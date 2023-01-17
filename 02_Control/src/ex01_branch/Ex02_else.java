package ex01_branch;

public class Ex02_else {

	public static void main(String[] args) { // if문이 2개면 분기문이 2개
		
		int score = 50; 
		
		if(score >= 60) {
			System.out.println("합격");
			System.out.println("축하합니다."); // if문 여부와 관계 없이 무조건 나타나는 sysout
	}
			
		else {
			System.out.println("불합격");
			System.out.println("보충수업입니다.");
		}
			

	}

}
