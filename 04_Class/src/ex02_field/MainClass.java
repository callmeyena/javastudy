package ex02_field;

public class MainClass {
	public static void main(String[] args) {
		ex01();
		
		
	}
	
	public static void ex01() {
		
		School school = new School();

		
		school.name = "철산초";
		school.students = new Student[3]; // 학생을 3명 저장할 수 있음

		
		for(int i = 0; i < school.students.length; i++) {
			
			// student 객체 생성
			school.students[i] = new Student(); // 학생 한 명 한 명을 만드는 것 ㅅ이ㅂ라 먼소리야 
			
			school.students[i].name = "정숙";
			school.students[i].stuNo = "10101";
			
			// Score 객체 생성
			school.students[i].score = new Score();
			school.students[i].score.Kor = 100;
			school.students[i].score.Eng = 90;
			school.students[i].score.Math = 80;
			
			System.out.println("이름: " + school.students[i].name);
			System.out.println("이름: " + school.students[i].stuNo);
			System.out.println("이름: " + school.students[i].score.Kor);
			System.out.println("이름: " + school.students[i].score.Eng);
			System.out.println("이름: " + school.students[i].score.Math);
		
		}	

	} //

	public static void ex02() {
		
		// 학생 3명 만들기
		// 한잔초/ 김정숙, 이미희, 이도형/ 14342, 14456, 14577/ 수학: 100, 98, 100/ 영어: 56, 99, 99/ 국어: 87, 56, 98
		
		School school = new School();
		
		school.name = "한잔초";
	
		
		
		
	}
} // 
