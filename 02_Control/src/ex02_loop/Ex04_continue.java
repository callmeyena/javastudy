package ex02_loop;

public class Ex04_continue {
		
		/*
		 continue 문
		 1. 반복문을 계속하시오 라는 뜻은 반복문의 시작 지점부터 다시 실행하라는 뜻
		 2. 어떤 코드를 제외하고 반복문을 실행하고 싶을 때 사용 Keyword: 제외(이건 안하겠다)
		 */
	
	public static void main(String[] args) {
		
		// 1 ~ 50사이에서 4의 배수를 제외하고 출력하기
		
		for(int a = 1; a <= 50; a++) {
			
			if(a % 4 == 0) {
				continue; // 해당 되는 조건식의 continue 를 만나면 sysout으로 가서 출력 되지 않고 처음의 for문으로 가는 것. 해당 안되면 sysout 출력 됨
			}
			System.out.println(a);
		}

	}

}
