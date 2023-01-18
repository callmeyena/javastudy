package ex01_String; 

	// 제일 중요하다구~~!

public class Ex01_String {
	
	public static void Literal() {
		// 문자열 리터럴(Literal)
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = "Hi";
		String str4 = "hi";
		
		//문자열 리터럴은 Java에 의해서 최적화 되기 때문에 동일한 리터럴("hello")을 2번 이상 사용하면 기존에 사용한 리터럴을 재사용 한다.
		// 즉, "hello"라는 리터럴이 2개 이상 만들어 지지 않는다.
		
		/*
        |-------|
   str1 | 0x123 |
        |-------|
   str2 | 0x123 |
        |-------|
        |  ...  |
        |-------|
        |"hello"| 0x123
        |-------|
	*/
		// 참조값이 같다는 의미이다. 저장된 문자열이 같다는 의미가 아니다.	
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
	}

	public static void StringObject() {
	
		// 문자열 객체(Object)
		// 문자열 객체는 언제나 새로 생성된다.
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		// 참조값이 다르다는 의미이다. 저장된 문자열이 다르다는 의미가 아니다.	
		System.out.println(str1 == str2);	
	}
	
	public static void equals() {
		
		//equals 메소드 (" == " 대신 동등비교 하는 것)
		// 비교하는 문자열이 동일하면 true, 아니면 false 반환
		String str1 = "hello";
		String str2 = new String("hello"); // 참조값이 다르기 때문에 false
		
		// 대소문자도 일치해야 함
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열이다.");
		}
		else {
			System.out.println("str1과 str2는 다른 문자열이다.");
		}
		
		// 대소문자는 무시함
		String str3 = "hello";
		String str4 = new String("HELLO"); // upper case, lower case
		
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("str3과 str4는 같은 문자열이다.");
		}
		else {
			System.out.println("str3과 str4는 다른 문자열이다.");
		}
		
} //
	
	public static void length() {
		
		// length 메소드
		// 문자열의 길이(글자수)를 반환
		
		String str = "Hello\nWorld";
		int length = str.length();
		System.out.println("글자수: " + length);
		
	}
	
	public static void charAt() {
	
		// charAt 메소드
		// 문자열의 특정 인덱스의 문자(char)를 반환
		
		String name = "박예나";
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));
		
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}
	
	public static void substring() {
		
		// substring 메소드
		// 문자열의 일부 문자열을 반환
		
		// substring 사용법
		// 1. substring(int begin) : 인덱스 begin부터 끝까지 반환
		// 2. substring(int begin, int end) : 인덱스 begin부터 end 이전까지 반환(begin <= 추출범위 < end)
		
		String name = "박예나"; // 인덱스 0,1,2
		String familyName = name.substring(0, 1); // 성
		String givenName = name.substring(1); // 이름
		
		String name2 = "차은우";
		String fullName = name2.substring(0);
		String familyName2 = name2.substring(0, 1);
		String givenName2 = name2.substring(1);
		
		System.out.println(familyName);
		System.out.println(givenName);
		
		System.out.println(fullName);
		System.out.println(familyName2);
		System.out.println(givenName2);
		
					
		}
	
	public static void indexOf() {
		
		// indexOf 메소드
		// 특정 문자열의 인덱스 정보를 반환
		// 발견된 첫 번째 문자열의 인덱스 정보를 반환
		// 발견된 문자열이 없는 경우에는 -1을 반환
		
		// indexOf 사용법
		// indexOf(String str): 인덱스 0부터 str을 검색
		// indexOF(String str, int (from)index): 지정한 인덱스(from index)부터 str을 검색
		
		String slogan = "걱정한다고 걱정이 없어지면 걱정이 없겠네.";
		
		int idx1 = slogan.indexOf("걱정"); 			 // 걱정이라는 문자열이 있으면 걱정의 index위치값인 0 반환, 없으면 -1
		int idx2 = slogan.indexOf("걱정", idx1 + 1); // 첫번째 걱정의 위치 다음부터 찾으면 된다는 뜻
		int idx3 = slogan.indexOf("걱정", idx2 + 1); 
		
		int idx4 = slogan.indexOf("박예나");		 // -1 반환
		
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
		
		System.out.println();
		
		String slogan2 = "서강 그대의 자랑이듯, 그대 서강의 자랑이어라";
		
		int idx_1 = slogan2.indexOf("서강"); 		 		 // 서강이라는 문자열이 있기 때문에 서강의 첫번째 index 위치값인 0 반환
		int idx_2 = slogan2.indexOf("서강", idx_1 + 1);		 // 첫번 째 "서강"의 위치 다음부터 찾으면 된다 
		int idx_3 = slogan2.indexOf("서강", idx_2 + 1); 	 // 두번 째 "서강"의 위치 다음부터 찾으면 됨 => 더이상 "서강"이라는 문자열 없음 => -1 반환
		
		int idx_4 = slogan2.indexOf("세종대학교");			 // -1 반환
		
		System.out.println(idx_1);
		System.out.println(idx_2);
		System.out.println(idx_3);
		System.out.println(idx_4);
		
	}
	
	public static void lastIndexOf() {
		// lastIndexOf
		// 발견된 마지막 문자열의 인덱스를 반환
		// 나머지 특성은 indexOf와 동일
		
		String slogan = "걱정한다고 걱정이 없어지면 걱정이 없겠네.";
		
		int idx1 = slogan.lastIndexOf("걱정");
		int idx2 = slogan.lastIndexOf("박예나");
		
		System.out.println(idx1);
		System.out.println(idx2);
	}
	
	public static void startsWith() {
		
		// startsWith
		// 문자열이 지정된 정규식 패턴(Regular Expression)으로 시작하면 true 반환 아니면 false 반환
		
		String name = "박예나";
		if(name.startsWith("박")) {
			System.out.println("박씨다.");
		}
		else {
			System.out.println("박씨가 아니다.");			
		}	
		
		// endsWith
		// 문자열이 지정된 정규식 패턴(Regular Expression)으로 끝나면 true 반환
		
		// matches
		// 문자열이 지정된 정규식 패턴(Regular Expression)을 포함하면 true 반환
		
		
	} //
	
	public static void contains() {
		
		// contains
		// 문자열이 지정된 charSequence(String타입, char[] 타입 등 => String 으로 생각해도 ok)를 포함하면 true를 반환
		
		// 참고
		// public interface charSequence { }
		// public class String implements charSequence { }
		
		String email = "rksk365@gmail.com";
		if(email.contains("@")) {
			System.out.println("이메일이 맞다.");
		} else {
			System.out.println("이메일이 아니다.");	
		}
		
		String email2 = "rksk365@gmail.com";
		if(email2.contains("@gmail.com")) {
			System.out.println("구글 이메일이다.");
		} else {
			System.out.println("구글 이메일이 아니다");
		}
		
	}
	
	public static void toCase() {
		
		// toUpperCase
		// 대문자로 변환
		
		// toLowerCase
		// 소문자로 변환
		
		String str = "I am a Girl";
		String str2 = "If I were you, I didn't choice like that";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
	}
	
	public static void trim() {
		
		// trim
		// 문자열의 앞뒤에 포함된 공백문자(스페이스, 탭, 엔터 등)를 제거 / 문자열들 가운데에 있는 공백은 제거되지 않는다.
		
		String str = "   hahaha   hohoho   ";
		System.out.println("(" + str + ")"); 
		System.out.println("(" + str.trim() + ")"); 
		
		String str2 = "        s s s s s Iphone12 pro WOw    ";
		System.out.println(str2);
		System.out.println("(" + str2.trim() + ")");
	}
	
	public static void replace() {
		
		// replace(모두 바꿔줌 이름만 보고 replaceAll이랑 헷갈리기 ㄴㄴ)
		// 기존 문자열을 새로운 문자열로 변환한 결과를 반환
		
		// replace 사용법
		// replace(String str1, String str2)
		// 모든 str1을 str2로 변환(교체)
		
		String str = "best of the best";
		String result = str.replace("best", "worst");
		System.out.println(result);
		
		String str2 = "내가 가장 좋아하는 것은, 내가 가장 싫어하는 것은, 내가 가장 놀라는 것은";
		String result2 = str2.replace("내가", "니가");
		System.out.println(result2);
		
		// replaceAll: 모든 글자를 적어놓은 걸로 바꾼다. ex) .부분 뿐 아니라 모든 부분을 _로 바꾼다.
		// 정규식 패턴(Regular Expression)을 만족하는 부분을 변환한 결과를 반환
		String ip = "61.78.121.242";
		String replacedIp = ip.replaceAll(".", "_"); // 61_78_121_242을 기대하지만 다른 정답이 나옴(정규식..어쩌구...못봄..)
		System.out.println(replacedIp);
		
	}

	public static void isEmpty() { // 비어있는지 비어있지 않는지 확인
		
		//isEmpty
		// 빈 문자열이면 true 반환
		// 빈 문자열(""): 문자열의 길이(length)가 0이면 빈 문자열
		
		String str = "  ";
		if(str.trim().isEmpty()) { // trim처리 먼저 해주기
			System.out.println("빈 문자열이다.");
		} else {
			System.out.println("빈 문자열이 아니다.");
		}
		
		// isBlank
		// 빈 문자열이거나 공백 문자로만 구성되었다면 true 반환
		// JDK 11 이후 에서만 사용 가능
		if(str.isBlank()) {
			System.out.println("빈 문자열이다.");
			} else {
				System.out.println("빈 문자열이 아니다.");
			}
		
	} // isEmpty 메소드의 끝
	
	public static void format() {
		
		// format (사용 많이 하지는 않음/ 쭉 읽어보고 끝내는 정도면 ok)
		// 문자열을 지정한 형식으로 반환
		
		// 숫자 형식 지정하기
		int number = 1000;
	
		System.out.println(String.format("%o", number)); // %o: 8진수로 표시하시오
		System.out.println(String.format("%d", number)); // %d:10진수로 표시하시오
		System.out.println(String.format("%x", number)); // %x:16진수로 표시하시오 (0~9, a, b, c, d, e, f)
		System.out.println(String.format("%X", number)); // %X:16진수로 표시하시오 (0~9, A, B, C, D, E, F)
		
		// 문자열 형식 지정하기
		String str = "Hi";
		System.out.println(String.format("%s", str)); // %s: 문자열로 표시하시오
		
		// 출력 폭 지정하기
		System.out.println(String.format("%10d", number)); // %10d: 10자리로 표시하시오. 숫자는 오른 쪽에 표시하시오
		System.out.println(String.format("%-10d", number)); // %-10d: 10자리로 표시하시오. 숫자는 왼 쪽에 표시하시오
		System.out.println(String.format("%5s", str)); // %5s: 5자리로 표시하시오. 숫자는 왼 쪽에 표시하시오
		System.out.println(String.format("%-5s", str)); // %-5s: 5자리로 표시하시오. 숫자는 왼 쪽에 표시하시오
		
	}
	
	public static void ex01() {
		String url = "https://comic.naver.com/webtoon/detail?titleId=802039&no=13&weekday=mon"; // 깨알팁 모든 인터넷 주소는 물음표? 하나만 들어갈 수 있다. => indexOf("?") => -1이 아니어야함
		
		String requestURI = url.substring(0, url.indexOf("?"));	// https://comic.naver.com/webtoon/detail" 까지만 나오게 하는 법
		System.out.println(requestURI);
		
		String params = url.substring(url.indexOf("?") + 1);
		System.out.println(params);
	}
	
	public static void ex02() {
		
		String fullName1 = "a.p.p.l.e.tar.gz";
		
		String fileName1 = "";
		String extName1 = "";
		if(fullName1.endsWith(".tar.gz")) {
			 fileName1 = fullName1.substring(0, fullName1.lastIndexOf(".tar.gz"));
			 extName1 = ".tar.gz";
		} else {
			fileName1= fullName1.substring(0, fullName1.lastIndexOf(".")); // apple
			extName1 = fullName1.substring(fullName1.lastIndexOf(".")); // .jpg
		}
		System.out.println(fileName1);
		System.out.println(extName1);
				
		
		
		String fullName = "a.p.p.l.e.jpg";
		String fileName =  fullName.substring(0, fullName.lastIndexOf(".")); // apple
		System.out.println(fileName);
		String extName = fullName.substring(fullName.lastIndexOf(".") + 1);	// jpg		
		System.out.println(extName);
	}
	
	
	public static void main(String[] args) {
//		Literal();
//		StringObject();
//		equals();
//		length();
//		charAt();
//		substring();
//		indexOf();
//		lastIndexOf();
//		startsWith();
//		contains();
//		toCase();
//		trim();
//		replace();
//		isEmpty();
//		format();
		ex01();
//		ex02();
		

	}

}
