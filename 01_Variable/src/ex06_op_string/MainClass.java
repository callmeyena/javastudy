package ex06_op_string;

public class MainClass {
	
	public static void ex01() {
		
		// 연결 연산
		// 문자열과 +연산자가 만나면 문자열로 연결된다.
		
		String str1 = "구디" + "아카데미"; // 단순한 문자열 이어붙이기
		String str2 = "4" + "달라"; // 문자열 "4" + 문자열 "달라"
		String str3 = 100 + 10 + "번지"; // 순서대로 계산이 되기 때문에 숫자 100+10= 110 + 문자열 "번지"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
	public static void ex02() {
		
		// 모든 타입의 데이터는 빈 문자열("")을 + 시키면 문자열이 된다~!
		
		int a = 100;
		String str = a + "";
		
		
		// 원래는 이런게 있습니다
		// String str = String.valueOf(a); // String 변환 메소드
		// 하지만 개발자들은 잘 안쓰죠
		
		System.out.println(str);
//		System.out.println(a == str); 비교 불가 문자열과 숫자이기 때문에
	}

	
	public static void ex03() {
		
		// 문자열의 비교는 == 또는 != 로 하지 않는다.
		
		String str1 = "hello";
		System.out.println(str1 == "hello"); // true
		
		String str2 = new String("hello");
		System.out.println(str2 == "hello"); // false
		
	}
	
	public static void main(String[] args) {
//		ex01();
//		ex02();
		ex03();
		
		

	}

}
