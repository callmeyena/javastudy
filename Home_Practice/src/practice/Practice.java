package practice;

public class Practice {

	public static void main(String[] args) {
//		int[] a = {1, 2, 3, 4, 5};
//		for(int n : a) {
//			System.out.print(n);
//		}
		
		int[][] b = new int[2][];
		b[0] = new int[] {1, 3, 5};
		b[1] = new int[] {7, 9};
		
//		System.out.println(b[0][0] + "" + b[0][1] + "" + b[0][2]);
//		System.out.println(b[1][0] + "" + b[1][1]);
		
//		for(int i = 0; i < b.length; i++) {
//			for(int j = 0; j < b[i].length; j++) {
//				System.out.println(b[i][j]);
//			}
			
			int[][] arr1 = new int[2][3];
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr1[i].length; j++) {
					System.out.println(arr1[i][j]);
					
			}
		}
	}

}
