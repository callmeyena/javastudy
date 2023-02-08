package ex01_internet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class MainClass {
	
	/*
	 	URL
	 	1. Uniform Resource Locator = 모양이 하나
	 	2. 정형화 된 자원의 경로
	 	3. 쉽게말해 실제로는 웹 주소를 의미한다.
	 	4. 구성
	 		프로토콜(http):// 	  호스트	 / 서버경로	 ? 파라미터=값&파라미터=값&...
	 				https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=삼성전자
	 				1) 프로토콜	: 통신규약, https(secure + http : 보안 처리 된 하이퍼텍스트 전송 프로토콜)
	 				2) 호스트	: 서버의 대표 주소
	 				3) 서버경로	: URL Mapping(URL Pattern) , 개발자가 만든다
	 				4) 파라미터 : 서버로 보내는 데이터를 의미(변수라고 생각하면 된다), 주소의 ?이후에 나온다. 그래서 ?는 무조건 주소에 하나씩 존재
	*/
	
	
	
	public static void ex01() {		// 맞는 주소인지 예외처리로 확인하는 방법, 
		 
		String apiURL = "https://search.naver.com/search.naver?query=삼성전자"; 	// 모든 웹 페이지의 첫 시작
		URL url = null;		// url사용에는 무조건 예외처리가 필요
		
		try {
			url = new URL(apiURL);	// 반드시 예외처리가 필요한 코드/ 예외처리가 필요한 코드는 try안에 넣어야 한다 / 모든 웹 페이지의 첫 시작
			
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트: " + url.getHost());
			System.out.println("파라미터: " + url.getQuery());
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} 
		
		
		
	}

	public static void ex02() {		// 웹 접속을 담당하는 HttpURLConnection
		
		String apiURL = "https://www.naver.com";
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();		// IOException 처리가 필요하다.
			
			/* 
			 	HTTP 응답 코드 공부하기
			 	1. 200: 정상 접속
			 	2. 40X: 잘못된 요청(사용자가 잘못하였음 ex) 존재하지 않는 주소)
			 	3. 50X: 서버측 오류(서버가 잘못하였음)
			*/
			System.out.println("정상 응답: " + HttpURLConnection.HTTP_OK); 					// HttpURLConnection.HTTP_OK = 200
			System.out.println("Not Found: " + HttpURLConnection.HTTP_NOT_FOUND);			// HttpURLConnection.HTTP_NOT_FOUND = 404
			System.out.println("Internal Error: " + HttpURLConnection.HTTP_INTERNAL_ERROR); // HttpURLConnection.HTTP_INTERNAL_ERROR) = 500
			
			// apiURL 접속 확인
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				System.out.println(apiURL + "접속 완료");
			}
			
			// 요청 방식(요청 메소드)
			String requestMethod = con.getRequestMethod();
			System.out.println("요청방식: " + requestMethod);		 // GET 방식: 검색창에서 받은 정보를 검색창으로 보낼게
			
			// 컨텐트 타입
			String contentType = con.getContentType();
			System.out.println("컨텐트 타입: " + contentType); 		 // 웹상에서 주고받는 데이터 타입(java로 예를 들자면 int, double 등등..)
			
			// 요청 헤더
			String userAgent = con.getRequestProperty("User-Agent"); // 하이픈(-)이 들어가는 형식, 헤더의 Key값이 무엇이냐 
			System.out.println("User-Agent: " + userAgent);
			
			String referer = con.getRequestProperty("Referer");
			System.out.println("Referer: " + referer); 				 //  직전 주소가 나옴 ex) 웹툰 홈페이지에서 로그인 할 때 다시 직전 페이지로 돌려보내기
			
			// 접속 종료
			con.disconnect();  		// 생략 가능하긴 함
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch(IOException e) {
			System.out.println("api 접속 오류");
		}
	}
	
	public static void ex03() {

		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedInputStream in = null;			// Daum 로고를 읽어 들이는 입력 스트림 
		BufferedOutputStream out = null;	// C:\storage\daum.png로 내보내는 출력 스트림
		// 정리 단축키 Ctrl + shift + o
		File file = new File("C:" + File.separator + "storage", "daum.png");
		
		try { 
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				
				in = new BufferedInputStream(con.getInputStream());			// HUC로 커넥션 한 상태에서 다음에서 자바로 정보를 입력받는 con.getinput..사용
				out = new BufferedOutputStream(new FileOutputStream(file)); // String으로 처리
				
				byte[] b = new byte[10];
				int readByte = 0;
				
				while((readByte = in.read(b)) != -1) {
					out.write(b, 0, readByte);
				}
				
				System.out.println("다운로드 완료");
				
				out.close();
				in.close();
				con.disconnect();
				
			}
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch(IOException e) {
			// 접속 실패 또는 스트림 관련 오류
			e.printStackTrace();
		}
		
		
		

	}	
	
	public static void ex04() { 	// Connection은 reader와  writer를 제공하지 않고 오직 byte스트림만 제공해준다.
									// 바이트 입력 스트림을 문자 입력 스트림으로 변환하는 InputStreamReader 되게 되게 중요
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/_63d8848f7d506.txt";
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		File file = null;
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			String message = null;
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				file = new File("C:" + File.separator + "storage", "다운로드문서.txt");
				message = "다운로드 성공";
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				file = new File("C:" + File.separator + "storage", "다운로드실패.html");
				message = "다운로드 실패";
			}
			
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[2];
			int readCount = 0;
			
			while((readCount = reader.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCount);
			}
			
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			
			writer.close();
			reader.close();
			con.disconnect();
			
			System.out.println(message);
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void ex05() {		// 인코딩(UTF-8)
		
		/*
		 	인코딩(암호화): 원본 데이터를 UTF-8 방식으로 암호화
		 	디코딩(복호화): UTF-8 방식으로 암호화된 데이터를 복원 
		*/
		
		String data = "한글 english 12345 !@#$+-";
		
		try {
			
			// 인코딩
			String encodeData = URLEncoder.encode(data, "UTF-8"); // 주소창에 주소를 보낼 때, 인코딩에 더 집중공부
			System.out.println(encodeData);				
			
			// 디코딩
			String decodeData = URLDecoder.decode(encodeData, "UTF-8");
			System.out.println(decodeData);
					
					
					
		} catch(UnsupportedEncodingException e) { 
			System.out.println("인코딩 실패");
		}
	
	}
	
	public static void ex06() { // 연습
		
		// 1시간 마다 갱신되는 전국 날씨 정보
		String apiURL = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
		
	}
	
	public static void main(String[] args) {
		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
//		ex06();
	}

}
