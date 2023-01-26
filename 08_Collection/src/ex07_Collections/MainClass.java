package ex07_Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {
	
	public static void PrintList(List<Integer> list) {
		
		int lastIndex = list.size() - 1;
		
		for(int i = 0; i < lastIndex; i++) {
			System.out.print(list.get(i) + " - ");
		}
		System.out.println(list.get(lastIndex));
		
		
	}

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 3, 1, 4);
		
		PrintList(list); // 5-2-3-1-4
		
		Collections.sort(list); // 오름차순 정렬
		
		PrintList(list); // 1-2-3-4-5
		
		int idx = Collections.binarySearch(list, 6); // 이진 검색(반드시 정렬이 되어 있어야 한다.)
//		System.out.println(idx); // 찾을 수 없는 값은 -(마이너스)값으로 반환된다.
		if(idx >= 0) {
			System.out.println("찾았다.");
		} else {
			System.out.println("못 찾았다.");
		}
	}

}
