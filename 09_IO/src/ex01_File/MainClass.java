package ex01_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class MainClass {
	/*
		 	File 클래스
		 	1. java.io 패키지
		 	2. 파일, 디렉터리(폴더)를 관리하는 클래스이다.
		 	3. 객체 생성 방법
		 		1) new File(경로, 파일)
		 		2) new File(파일)
		 	4. 경로 구분 방법
		 		1) 윈도우: 역슬래시(\)
		 		2) 리눅스: 슬래시(/)
	 */
	
	public static void ex01() {
		
		// File.separator: 플랫폼에 따라서 자동으로 경로 구분자를 사용하는 필드값
		
		// 디렉터리 관련 필수 작업(꼭꼮꼭꼭꼭 진짜진짜진짜 할줄 알아야함)
		
		File dir = new File("C:" + File.separator + "storage"); // 역슬래시는 꼭 두 개를 넣어줘야 한다. C드라이브 아래 storage 폴더를 의미한다.
		
		// 없으면 만들고, 있으면 지운다.
		if(dir.exists() == false) {
			dir.mkdirs();
			System.out.println("C:" + File.separator + "storage 생성 완료");	// s가 붙어 있는 mkdirs만 쓰도록 하셈 => make directory
		} else {
			dir.delete();					// 지금 바로 지운다.
			System.out.println("C:" + File.separator + "storage 삭제 완료");
//			dir.deleteOnExit();  			// JVM실행이 끝나면 지운다
		}
			
		
	}

	public static void ex02() throws IOException {
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "myfile.txt"); 
			if(file.exists() == false) {
				file.createNewFile();	
		}
			// 파일의 정보확인
			System.out.println("파일명: " + file.getName());
			System.out.println("경로명: " + file.getParent()); 	// 파일은 자기가 속한 디렉터리(폴더)를 부모라고 생각....생각? 파일이 생각..?
			System.out.println("경로명: " + file.getPath()); 	// 파일명 + 디렉터리명
			
			System.out.println("디렉터리인가? " + file.isDirectory());
			System.out.println("파일인가? " + file.isFile());
			
			long lastModified = file.lastModified();			// 최종 수정일의 타임 스탬프
			System.out.println("최종 수정일 : " + lastModified);
			
			String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
			System.out.println("최종 수정일: "  + lastModifiedDate);
			
			long size = file.length(); // 파일의 크기가 바이트 단위로 저장
			long kb = (size / 1024) + (size % 1024 != 0 ? 1 : 0);
			System.out.println("파일크기 " + kb + "KB"); // 킬로 바이트 출력(1024 바이트 = 1킬로 바이트)
	}
	
	public static void main(String[] args) {
		ex01();
	}

}
