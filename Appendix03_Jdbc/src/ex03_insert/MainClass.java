package ex03_insert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainClass {
	
	// 상수 삽입
	public static void ex01() {
		
		Connection con = null;			// Connection 인터페이스의 con 변수 선언
		PreparedStatement ps = null;	// SQL쿼리문을 전달하기 위한 인터페이스
		
		try {							// 예외 처리 
			
			Class.forName("oracle.jdbc.OracleDriver");	// 클래스 로드(오라클)
			
			Properties p = new Properties();			// db.properties값을 받기 위한 properties 객체 생성
			p.load(new BufferedReader(new FileReader("db.properties")));	// properties의 load메소드를 통해 파일 값 받아와서 p에 저장
			
			String url = p.getProperty("url");			  // url property의 value값 불러와서 String url 변수에 저장
			String user = p.getProperty("user");		  // user property의 value값 불러와서 String user 변수에 저장
			String password = p.getProperty("password");  // password property의 value값 불러와서 String password변수에 저장
			
			con = DriverManager.getConnection(url, user, password);			// DriveManager클래스의 .getConnection메소드를 통해 정의되며, 데이터베이스에 sql을 전송하고 그 결과인 ResultSet을 받는다.
			// DB접속
			
			String sql = "INSERT INTO MEMBER_TBL(MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE)";
			sql += " VALUES(MEMBER_SEQ.NEXTVAL, 'admin', '관리자', '서울', TO_DATE('2023-02-15', 'YYYY-MM-DD'))";
			
			ps = con.prepareStatement(sql);					// con.prepareStatement => 쿼리문을 전달 받는 메소드 => preparedStatement인터페이스에 전달할 때 사용할 수 있는 메소드
			
			int insResult = ps.executeUpdate();				// 실행 된 행의 갯수의 값을 int타입의 insResult에 리턴받는다 / INSERT니까 executeUpdate 사용
			
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close(); 		// 가장 먼저 오픈한 소스는 가장 나중에 닫기
				if(con != null) con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}	
	
	// 변수 삽입 (중요한 건 변수 삽입!)
	public static void ex02() {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");		
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));		// db.properties 값을 읽어서 properties 타입의 p변수에 load메소드를 통해 저장
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			String sql = "INSERT INTO MEMBER_TBL(MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE)";
			sql += " VALUES(MEMBER_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";
			
			ps = con.prepareStatement(sql);
			
			String id = "master";
			String name = "운영자";
			String address = "경기";
			
			ps.setString(1, id);		// 1번째 물음표(?) 자리에 id를 넣으시오
			ps.setString(2, name);		// 2번째 물음표(?) 자리에 name을 넣으시오
			ps.setString(3, address);	// 3번째 물음표(?) 자리에 address를 넣으시오
			
			int insResult = ps.executeUpdate();
			
			System.out.println(insResult + "개의 행이 삽입 되었습니다.");			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void ex03() {
		// admin이 작성한 임의의 게시글을 삽입해보자.
		
		Connection con = null;
		PreparedStatement ps = null;
		
		 try {
			 
			 Class.forName("oracle.jdbc.OracleDriver");
			 Properties p = new Properties();
			 p.load(new BufferedReader(new FileReader("db.properties")));

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "INSERT INTO BOARD_TBL(BOARD_NO, MEMBER_NO, TITLE, CONTENT, CREATE_DATE";
			sql += "VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";
			
			ps = con.prepareStatement(sql);
			
			int memberNo = 1;
			String title  = "오늘은 목요일";
			String content = "보충은 취소되었소";
			
			ps.setInt(1, memberNo);
			ps.setString(2, title);
			ps.setString(3, content);
		 
			int insResult = ps.executeUpdate();
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 try {
				 if(ps != null) ps.close();
				 if(con != null) con.close();
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		 }
	}
	
	public static void main(String[] args) {
//		ex01();
//		ex02();
		ex03();
	}

}
