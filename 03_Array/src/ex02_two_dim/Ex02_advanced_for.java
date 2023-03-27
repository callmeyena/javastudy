package ex02_two_dim;

public class Ex02_advanced_for {

	public static void ex01() {
		
		int[][] scores = {
				{70, 80, 90},
				{80, 90, 100},
				{50, 60, 70,}	
		};
		
//		for(int[] arr : scores) { // 2차원 배열에서 1차원 배열을 꺼내서 담는다
//			for(int score : arr) { // 그 1차원 배열을 변수에 꺼내서 담는다
//				System.out.print(score + "\t");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
	} // ex01 메소드의 끝
	
	public static void ex02() {
		
		String[][] timeTable = {
				{"국어", "윤리", "수학", "체육"},
				{"미술", "수학", "영어"},
				{"사회", "한자", "수학", "국어", "영어"},
				{"음악", "국어", "윤리"},
				{"수학", "영어", "체육", "과학"}
		};
		
		for(String[] day : timeTable) {
			for(String b : day) 	  {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
		
	} //
	
	public static void main(String[] args) {
//		ex01();
		ex02();

	}

}
