package ex01_connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MainClass {
	
	
	public static void ex01() {
		
		// 클래스를 로드하는 방법(메모리에 로드한다 : 사용하겠다)
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");	// 자매품으로 oracle.jdbc.driver.OracleDriver도 가능하다.
			System.out.println("클래스가 로드되었습니다.");
			
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	public static void ex02() {			// String으로 직접 우겨넣는걸 보여줌ㅋ 
		
		// Oracle DataBase와 연결할 때 사용하는 Connection 인터페이스
		Connection con = null;
		
		// Oracle 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "GDJ61";
		String password = "1111";
		
		// DriverManager 클래스로부터 Connection 객체를 받아 온다.
		
		try {
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB에 접속되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		// 사용이 끝난 Connection 객체는 반드시 닫아야 한다.
		try {
			
			if(con != null) {
				con.close();	// con 꼭 닫긔 ㅋ
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void ex03() {
		
		// 프로퍼티 파일 읽는 문자 입력 스트림 생성하기
		BufferedReader reader = null;
		Connection con = null;
		
		try {
			reader = new BufferedReader(new FileReader("db.properties"));
		
		// 프로퍼티 파일을 읽어서 프로퍼티 객체 생성하기
		Properties properties = new Properties();
		properties.load(reader);
		
		// 프로퍼티 객체에 저장된 각 Property 읽기
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		
		// DriverManager로 부터 Coneection 객체 얻기
		con = DriverManager.getConnection(url, user, password);
		System.out.println("DB에 접속 되었습니다.");
				
		
		
		} catch(IOException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(con != null) {
					con.close();
				}
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static Connection getConnection() { 		// 파일로 아이디 비번을 옮기고, 소스코드에서는 지워버리는거 구현 ㅋ 
		
		Connection con = null;									// 예외처리 할거기 때문에 null주기
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");			// 클래스 로드(.forName)
			
			Properties properties = new Properties();			// prperties를 저장하기 위해 properties객체 생성
			properties.load(new BufferedReader(new FileReader("db.properties")));	// db.properties에 있는 파일 내용 읽고, properties에 저장
			
			con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));	// DriveManager클래스에서 .getConnection메소드 사용하여 각 property호출해서 value값 저장)
			
		} catch(Exception e) { 		// ClassNotFoundException, SQLException, IOException		// 예외처리 닫기
			e.printStackTrace();
		} 
		
		return con;					// getConnection 메소드를 호출하면 그 값으로 con을 리턴한다.
		
	}
	
	public static void main(String[] args) { 
//		ex03();
		Connection con = getConnection();
		System.out.println("DB에 접속되었습니다.");
//		con.close();

	}

}
