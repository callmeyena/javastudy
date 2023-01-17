package ex01_one_dim;

public class Ex02_reference {
	
	public static void ex01() {
		
		int[] arr;
		
		arr = new int[5];
		
		System.out.println(arr); // 5개 요소의 참조(= 주소, 번지) 값
		
	}
	
	public static void ex02() {
		
		int[] a = new int[5]; // 메모리 그림 그려보기 집에서/ 그림의 형태로 외우기
		int[] b;
		
		
		b = a; // 배열 a 를 b에 대입했기 때문에 b또한 5개의 메모리를 가지고 있는 a와 같아짐(주소값이 같다) 데이터 타입의 크기(byte ex) int-> 4byte)와 주소값(10번지, 14번지...)이 연관있음 
		
		System.out.println(b[0]);
		
	}

	public static void ex03() { // 심화
		
		// 생성된 배열의 크기를 늘리는 방법
		
		// 기존 배열
		int[] a = new int[5];
		
		// 신규배열
		int[] b = new int[10];
		
		// 기존 배열 요소 -> 신규 배열 요소
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		// 기존 배열의 참조값을 신규 배열에 참조값으로 수정
		a = b;
		
		// 기존 배열이 신규 배열로 변경되었으므로 확인해보기
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	} // ex03 메소드의 끝
	
	public static void ex04() {
		
		int[] arr1 = new int[3];
		
		int[] arr2 = new int[5];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr2 = arr1;
		
	}
		
		
		
	public static void main(String[] args) {
//		ex03();
		ex04();

	}

}
