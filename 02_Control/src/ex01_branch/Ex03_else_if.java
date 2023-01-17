package ex01_branch;

public class Ex03_else_if {
	
	public static void ex01() {
		
		// 80 이상: 상
		// 80이상: 중
		// 나머지: 하
		
		int score = 50;
		
		if(score >= 80) {
			
			System.out.println("상");
		}
		else if(score >= 60) {
			
			System.out.println("중");
		}
		else {
			System.out.println("하");
		}
	}

	public static void ex02() { // 연습
		
		// 수, 우, 미, 양, 가, 잘못된점수
		
		int score = 91;
		
		if(score < 0 || score > 100) { // 0점 미만 이거나 혹은 100점 초과 이기때문에 OR연산을 사용한다
			System.out.println("잘못된 점수 입니다.");
		}
		else if(score >= 90) {
			System.out.println("수");
		}
		else if(score >= 80) {
			System.out.println("우");
		}
		else if(score >= 70) {
			System.out.println("미");
		}
		else if(score >= 60) {
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}
	}
	
	public static void ex03() { // 연습
		
		int month = 1; // 겨울을 만들기
		
		if(month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		}
		else if(month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.println("여름");
		}
		else {
			System.out.println("가을");
		}
	
		int month2 = 1;
		int mod = month2 % 12;
		
		if(mod <= 2) {
			System.out.println("겨울");		
		}
		else if(mod <= 5) {
			System.out.println("봄");
		}
		else if(mod <= 8) {
			System.out.println("여름");
		}
		else {
			System.out.println("가을");
		}
	}
	
	public static void ex04() { // 연습
		
		int day = 6; // 오늘 날짜
		int nDay = 10; // 10일 후
		day += nDay; // day = day + nDay;
		
		String weekName; // 월요일
		
		int mod = day % 7; 
		
		if(mod == 0) {
			weekName = "토";
		}
		else if(mod == 1) {
			weekName = "일";
		}
		else if(mod == 2) {
			weekName = "월";
		}
		else if(mod == 3) {
			weekName = "화";
		}
		else if(mod == 4) {
			weekName = "수";
		}
		else if(mod == 5) {
			weekName = "목";
		}
		else {
			weekName = "금";
		}
		
		System.out.println(nDay + "일 후는 " + weekName + "요일이다.");
			
	
	
	}
	
	
	
	public static void main(String[] args) {
		ex04();

	}

}
