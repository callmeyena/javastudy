package ex01_branch;

public class Ex04_switch {
	
	/* 
	  switch(표현식/ 괄호 안에 들어가는게 if문과 다름) {
	  case 값1: 실행문
	  case 값2: 실행문
	  ... // 원하는 갯수만큼 가능
	  default: 실행문 (if의 else개념)  
	  }
	  표현식의 결과로 주로 사용하는 타입
	  - int
	  - String
	  
	  표현식의 결과로 사용 불가능한 타입
	  - boolean
	  - double
	  - long
	 */
	
	public static void ex01() {
		
		int month = 7;
		
		switch(month) {
		case 12:
		case 1:
		case 2: System.out.println("겨울"); break;
		case 3:
		case 4:
		case 5: System.out.println("봄"); break;
		case 6:
		case 7:
		case 8: System.out.println("여름"); break;
		default: System.out.println("가을"); // 어차피 끝이라 break; 안넣어도 됨
		}
		
	}
	
	public static void ex02() {
		
		int day = 13;
		
		String weekName;
		
		switch(day % 7) { // if 보다 가독성이 좋다! 
		case 0: weekName = "토"; break;
		case 1: weekName = "일"; break;
		case 2: weekName = "월"; break;
		case 3: weekName = "화"; break;
		case 4: weekName = "수"; break;
		case 5: weekName = "목"; break;
		default: weekName = "금";
		}
		
		System.out.println(day + "일은 " + weekName + "요일이다.");
		
	}

	public static void ex03() {
		
		// 수, 우, 미, 양, 가, 잘못된 점수
		
		
		
		int score = 60;
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수");
			return; // ex03 메소드를 종료하시오.
		}
		
		switch(score / 10) {
		case 10:
		case 9: System.out.println("수"); break;
		case 8: System.out.println("우"); break;
		case 7: System.out.println("미"); break;
		case 6: System.out.println("양"); break;
		default: System.out.println("가");
		}
			
	}

	
	public static void ex04() {
		
		// 1분기(1~3), 2분기(4~6), 3분기(7~9), 4분기(10~12)
		
		int month = 1;
		
		System.out.println((month - 1) / 3 + 1 + "분기");
		
		switch((month -1) / 3) {
		case 0:
			System.out.println("1분기");
			break;
		case 1:
			System.out.println("2분기");
			break;
		case 2:
			System.out.println("3분기");
			break;
		default:
			System.out.println("4분기");
		}		
		
	}
	
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
		ex04();
		
		
		}

	}
