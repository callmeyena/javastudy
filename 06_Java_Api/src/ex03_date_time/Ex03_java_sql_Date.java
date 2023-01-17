package ex03_date_time;

import java.sql.Date; // 빡공 안해도 됨 참고정도/ import 확인

public class Ex03_java_sql_Date { // 데이터베이스(JDBC)에 날짜를 저장시키기위해 / DB저장 기본 형식: 0000-01-11

	public static void main(String[] args) {
		
		// Oracle 데이터베이스와 호환되는 java.sql.Date
		
		Date now = new Date(System.currentTimeMillis()); // long타입의 시간은 timeStamp를 말하는 것
		System.out.println(now);

	}

}
