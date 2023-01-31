package ex04_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import com.sun.jdi.Field;

public class MainClass {
	
	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex01.bin"); 	// 이진 파일, 이진 데이터
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);	// 파일의 연결된 출력 통로(stream)의 이름이 fos => int or byte[]타입만 출력 가능
			
			// 출력단위
			// 1. int: 1개
			// 2. byte[]: 2개 이상
			
			int c = 'A';						// Byte = 1바이트, char = 2바이트, int = 4바이트
			String str = "pple";
			byte[] b = str.getBytes();
			
			// 출력
			fos.write(c);
			fos.write(b);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();					
				} 
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	
	}

	public static void ex02() { 	// byte 스트림 인코딩 해서 내보내는 방법
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex02.bin");
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			
			String str = "안녕하세요";
			
			// 1번 방법: getBytes(Charset charset)
			byte[] b = str.getBytes(StandardCharsets.UTF_8);	// UTF-8로 만들어서 인코딩 해주세요 라는 뜻 ㅋ charset = UTF-8 = 한 글자에 3바이트 
			
			// 2번 방법: getBytes(String charsetName)
			// byte[] b = str.getbytes("UTF-8"); // 추천 ㅋ 이거 무족권 무족권이야
			
			fos.write(b);

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
 		}
		
		System.out.println("ex02.bin 파일의 크기: " + file.length() + "바이트");
		
		
	}
	
	public static void ex03() {
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex03.bin");
		
		BufferedOutputStream bos = null;
		
		try {
			
			bos = new BufferedOutputStream(new FileOutputStream(file)); 	// 권장~! 쓸 것 만 선언하자! 괜히 여러개 변수 만들기 ㄴㄴ
			
			bos.write("반갑습니다\n또만나요".getBytes("UTF-8"));			// \n의 크기 = 1바이트
			// 현실적으론 여기서 bos가 다 끝난 시점인 여기서 bos.close(); 사용. 여기서 사용하면 finally 사용할 필요 없음 우와우 ㅋ

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) {
					bos.close();				// 권장하는 위치
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ex03.bin 파일의 크기: " + file.length() + "바이트");
	}
	
	public static void ex04() { // 데이터?  변수 내보내기..?
		
		// 변수를 그대로 출력하는 DataOutputStream => 보조 스트림(buffered 처럼 사용)
		// 한글 처리 할 때 사용
		
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File(dir, "ex04.dat");
		
		DataOutputStream dos = null;
		
		try {
			
			dos = new DataOutputStream(new FileOutputStream(file));
			
			// 출력할 변수
			String name = "에밀리";	// 9바이트
			int age = 30;			// 4바이트
			double height = 190.5;	// 8바이트
			boolean isAlive = true; // 3바이트 / boolean의 크기 결정은 JVM이 한다.
			
			// 출력(변수 타입에 따라서 메소드가 다름)
			dos.writeUTF(name);			// 아깐 getbytes하라고 하셨잖아요.. 왜냐면 ㅇㅒ는 변수니까 ㅋ
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeBoolean(isAlive);

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) {
					dos.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ex04 파일의 크기: " + file.length() + "바이트");
		
	}
	
	public static void ex05() {
		
		// 객체를 그대로 출력하는 ObjectOutputStream
	
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File(dir, "ex05.dat");
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			// 출력할 객체
			List<Person> people = Arrays.asList(
				new Person("에밀리", 30, 180.5, true),
				new Person("제시카", 35, 190.5, true)
			);
			
			// 출력할 객체
			Person person = new Person();
			person.setName("제임스");
			person.setAge(40);
			person.setHeight(170.5);
			person.setAlive(false);
			
			// 출력
			oos.writeObject(people);
			oos.writeObject(person);
					
					
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {
						oos.close();
					} 
				} catch(IOException e) {
						e.printStackTrace();
					}
				}
		System.out.println("ex05 파일의 크기: " + file.length() + "바이트");
	}
	
	
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
		ex05();
	}

}
