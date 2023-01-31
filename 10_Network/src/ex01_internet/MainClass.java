package ex01_internet;

import java.net.MalformedURLException;
import java.net.URL;

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

	public static void main(String[] args) {
		ex01();
	}

}
