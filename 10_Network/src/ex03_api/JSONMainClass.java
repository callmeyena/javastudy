package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

/* 
	JSON
	-네트워크를 통해 데이터를 주고받는 데 자주 사용되는 경량의 데이터 형식  
	-정해진 문법에 맞게 데이터를 담아 전달하게 되면 전달 받은 사람은 파싱하여 데이터들을 쉽게 꺼내서 사용할 수 있도록 도와주는 것이다. 

	파싱 : 다른 형식으로 저장된 데이터를 원하는 형식의 데이터로 변환하는 것. 
*/


public class JSONMainClass {
	
	public static void ex01() {
	
	/*
		한국환경공단_에어코리아_대기오염정보 : 시도별 실시간 측정정보 조회
		1. 서비스 URL : http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty
		2. 요청 변수(Request Parameter)
			1) serviceKey : 인증키
			2) returnType : xml 또는 json
			3) sidoName : 시도 이름
	*/
		//apiURL은 홈페이지 내의 '요청주소' 확인할 것, 서비스키는 일반인증키로 진행할 것. 
		String serviceKey = "V1ZK022TM9GGs2XJ7sSMDYk96j604sERtTiWDwdidJi2F+juYRL98yvX55ovOn5gygCQs6e33EDBB1cqdDRuwQ==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		
		try {
			
			String sidoName = "서울";
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&sidoName=" + URLEncoder.encode(sidoName, "UTF-8"));
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			con.disconnect();
			
			System.out.println(sb.toString());
			JSONObject obj = new JSONObject(sb.toString());
	
			// obj3 == body
			JSONObject body = obj.getJSONObject("response").getJSONObject("body"); // response를 가져올 때 body까지 가져오는게 더 수월하다!
			JSONArray items = body.getJSONArray("items");
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i); 			// JSONObject
				String stationName = item.getString("stationName");
				String pm10Value = item.getString("pm10Value");
				String o3Value = item.getString("o3Value");
				System.out.println(stationName + " : 미세먼지 - " + ", 오존농도 - " + o3Value);
					
			}
			
			{
				
			}
			// casting
			// obj.get("response") (X)
			// (JSONObject)obj.get("response")
			// obj.getJSONObject("response")
			
			// JSONArray items = body.getJSONArray("items");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void ex02() {
		
	/*
		한국환경공단_에어코리아_대기오염정보 : 시도별 실시간 측정정보 조회
		1. 서비스 URL : http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth
		2. 요청 변수(Request Parameter)
			1) serviceKey : 인증키
			2) returnType : xml 또는 json
			3) searchDate : 통보시간 검색
	*/
		
		String serviceKey = "V1ZK022TM9GGs2XJ7sSMDYk96j604sERtTiWDwdidJi2F+juYRL98yvX55ovOn5gygCQs6e33EDBB1cqdDRuwQ==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		
		
		try {
			
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&searchDate=2023-01-30");
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			JSONArray items = new JSONObject(sb.toString())
								.getJSONObject("response")
								.getJSONObject("body")
								.getJSONArray("items");
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				System.out.println(item.getString("frcstOneDt") + " : " + item.getString("frcstOneCn"));
				System.out.println(item.getString("frcstTwoDt") + " : " + item.getString("frcstTwoCn"));
				System.out.println(item.getString("frcstThreeDt") + " : " + item.getString("frcstThreeCn"));
				System.out.println(item.getString("frcstFourDt") + " : " + item.getString("frcstFourCn"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex01();
//		ex02();
	}

}
