package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMain2 {		
	public static void main(String[] args) {
		
	
	String ServiceKey = "V1ZK022TM9GGs2XJ7sSMDYk96j604sERtTiWDwdidJi2F+juYRL98yvX55ovOn5gygCQs6e33EDBB1cqdDRuwQ==";
	String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
	URL url = null;
	HttpURLConnection con = null;
	BufferedReader reader = null;
	
	try {
		
		String siDo = "1100";
		String searchYear = "2021";
		String guGun = "1125";
		StringBuilder sbURL = new StringBuilder();
		sbURL.append(apiURL);
		sbURL.append("?ServiceKey=" + URLEncoder.encode(ServiceKey, "UTF-8"));
		sbURL.append("&type=json");
		sbURL.append("&siDo=" + URLEncoder.encode(siDo, "UTF-8"));
		sbURL.append("&guGun=" + URLEncoder.encode(guGun, "UTF-8"));
		sbURL.append("&searchYear=" + URLEncoder.encode(searchYear, "UTF-8"));
		
		
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
		
		JSONObject body = obj.getJSONObject("response").getJSONObject("body");
		JSONArray items = body.getJSONArray("items");
		for(int i = 0; i < items.length(); i++) {
			JSONObject item = items.getJSONObject(i); 	
			String occrrncDt = item.getString("occrrncDt");
			String occrrncDayCd = item.getString("occrrncDayCd");
			String dthDnvCnt = item.getString("dthDnvCnt");
			String injpsnCnt = item.getString("injpsnCnt");
			System.out.println(occrrncDt  + occrrncDayCd);
				
		}
	}
	}
}
