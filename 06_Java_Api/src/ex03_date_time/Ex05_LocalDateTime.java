package ex03_date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex05_LocalDateTime {
	
	/*
	 	날짜: java.time.LocalDate
	 	시간: java.time.LocalTime
	 	둘다: java.time.LocalDateTime
	*/
	
	public static void ex01() {
		
		// LocalDate
		
		LocalDate date1 = LocalDate.now(); // 현재
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(2023, 2, 15); // 특정 날짜 지정
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.parse("2023-01-17"); // 문자열 기본 형식: yyyy-MM-dd
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.parse("2023/01/17", DateTimeFormatter.ofPattern("yyyy/MM/dd")); // 문자열은 하이픈만 인식하기 때문에 슬래쉬/로 입력하면 인식하지 못함
																									// 따라서 DateTimeFormatter.ofPattern("yyyy/MM/dd")를 통해 입력해서 switch한다.
		System.out.println(date4);
	} //
	
	public static void ex02() {
		
		// LocalTime
		
		LocalTime time1 = LocalTime.now(); // 현재시간 // 나노초까지 찍혀있음
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.of(14, 38, 10); // 시, 분, 초
		System.out.println(time2);
		
		LocalTime time3 = LocalTime.parse("14:40:30"); // 14시 40분 30초
		System.out.println(time3);
		
		
	}

	public static void main(String[] args) {
		ex02();
	}

}
