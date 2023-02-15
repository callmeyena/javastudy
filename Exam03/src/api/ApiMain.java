package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMain {

	public static void main(String[] args) { // 우리가 배우는 api는 rest조회 밖에 없다는거~!
		
		try {
			// API 주소 API마다 다르기 때문에 문서를 참고하기
			String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath"; // Postman으로 체크해보기
			apiURL += "?serviceKey=" + URLEncoder.encode("V1ZK022TM9GGs2XJ7sSMDYk96j604sERtTiWDwdidJi2F+juYRL98yvX55ovOn5gygCQs6e33EDBB1cqdDRuwQ==", "UTF-8");
			apiURL += "&siDo=" + URLEncoder.encode("1100", "UTF-8");
			apiURL += "&searchYear=" + URLEncoder.encode("2021", "UTF-8");
			apiURL += "&guGun=" + URLEncoder.encode("1125", "UTF-8");
			apiURL += "&type=" + URLEncoder.encode("json", "UTF-8");
			apiURL += "&numOfRows=" + URLEncoder.encode("10", "UTF-8");
			apiURL += "&pageNo=" + URLEncoder.encode("1", "UTF-8");
		
			// URL 객체 생성(API주소의 형식 검증)
			URL url = new URL(apiURL);
			
			// API 주소로 접속
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			// Get 방식의 요청임을 처리
			con.setRequestMethod("GET"); // GET방식: 주소창에 파라미터들(?이하, &이하)을 주렁주렁 매달아 요청하는 방식 ㅋ
			
			// 응답 데이터는 "json"임을 처리
			// 웹 상에서 주고 받는 데이터의 타입: Content-Type
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			// 접속된 API로부터 데이터를 읽어들일 입력스트림 생성
			// 1. 정상 스트림과 에러 스트림으로 구분해서 생성 
			// 2. API 입력 스트림은 오직 바이트 입력 스트림만 지원하므로 문자입력스트림으로 바꾸는 작업이 필요하다.
			// 3. 속도 향상을 위해서 Buffer가 내장된 스트림을 생성
			BufferedReader reader = null;
			if(con.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			// BufferdReader는 readLine 메소드를 지원한다. 한줄씩 읽어 들이는 readLine
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			//  이제 API의 응답 데이터는 sb에 저장되어 있다.
			// System.out.println(sb.toString());
			
			// API의 응답 데이터를 분석하기 위해서 JSONObject로 변환한다.
			// json 라이브러리 사용을 위해서 Build Path 작업을 수행한다.
			/*
			JSONObject obj = new JSONObject(sb.toString());
			JSONObject items = obj.getJSONObject("items");
			JSONArray itemList = items.getJSONArray("item");
			*/
			
			JSONArray itemList = new JSONObject(sb.toString())
								.getJSONObject("items")
								.getJSONArray("item");
			
			List<Accident> list = new ArrayList<Accident>(); 	// for문 안쪽 절대 x 무조건 for문 위에서 생성, 선언
			for(int i = 0; i < itemList.length(); i++) {
				// 응답 데이터에서 필요한 데이터를 분석(파싱)한다.
				JSONObject item = itemList.getJSONObject(i);
				String occrrncDt = item.getString("occrrnc_dt");
				String occrrncDayCd = item.getString("occrrnc_day_cd");
				int dthDnvCnt = item.getInt("dth_dnv_cnt");
				int injpsnCnt = item.getInt("injpsn_cnt");
				System.out.println(occrrncDt);
				System.out.println(occrrncDayCd);
				System.out.println(dthDnvCnt);
				System.out.println(injpsnCnt);
				// 응답 데이터에서 추출한 데이터를 하나의 객체(Bean)로 만든다.
				Accident accident = new Accident();
				accident.setOccrrncDt(occrrncDt);
				accident.setOccrrncDayCd(occrrncDayCd);
				accident.setDthDnvCnt(dthDnvCnt);
				accident.setInjpsnCnt(injpsnCnt);
				// accident라는 객체 하나가 위의 4가지의 값을 모두 저장
				// total사고 9개의 데이터(Accident 객체)을 ArrayList에 저장한다.
				list.add(accident);
			} // 자바의 변수 네이밍은 언더바 없애고 대문자로 변경해주기!
			
			// 발생월일시, 발생요일코드, 사망자수, 부상자수
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}

}
