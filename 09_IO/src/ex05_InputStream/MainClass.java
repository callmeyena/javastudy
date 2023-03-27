package ex05_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.List;

import ex04_OutputStream.Person;

public class MainClass {

	
	public static void ex01() {
		
		// 글자가 깨지지 않기 위해서 inputstream 일때는 inputstreamreader / outstream일 때는 getbytes를 이용한다.
		
		File file = new File("C:" + File.separator + "storage", "ex01.bin");
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			// 입력 단위
			// 1. int: 1개
			// 2. byte[]: 2개 이상
			
			int c = 0;
			StringBuilder sb = new StringBuilder();
			while((c = fis.read()) != -1) {
				sb.append((char)c); // 1. 읽어드린 내용을 StringBuilder에 담기
			}
			System.out.println(sb.toString());
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	public static void ex02() { // byte 기반의 스트림은 한글 처리에 문제가 있기 때문에 원래 깨져서 출력 됨
		
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			byte[] b = new byte[4];		// 한 번에 4바이트를 읽어오시오.
			int readByte = 0;			// 실제로 4바이트를 못 읽을 수도 있으니 실제로 읽은 바이트를 저장해 둘 수 있다.
			StringBuilder sb = new StringBuilder();
			
			while((readByte = fis.read(b)) != -1 ) {
				sb.append(new String(b, 0, readByte)); 	// 배열 b의 인덱스 0부터 readByte 개 데이터를 사용한다. ex) 4바이트 사용했으면 4개
			}
			System.out.println(sb.toString());

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex02_comlete() { // 바이트 입력 스트림을 문자 입력 스트림으로 변환하는 InputStreamReader
		
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		
		InputStreamReader isr = null;
		
		try {
			isr = new InputStreamReader(new FileInputStream(file)); 	// 바이트 기반 스트림 X, 문자 스트림을 받음 => 파일 리더 라고 생각하면 됨
			
			char[] cbuf = new char[4];		// 한 번에 4글자를 읽어오시오.
			int readCount = 0;			// 실제로 읽은 글자수를 저장해 두시오.
			StringBuilder sb = new StringBuilder();
			
			while((readCount = isr.read(cbuf)) != -1 ) {
				sb.append(cbuf, 0, readCount); 	// 배열 cbuf의 인덱스 0부터 readCount 개 데이터를 사용한다.
			}
			System.out.println(sb.toString());

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr != null) {
					isr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex03() { 	// 빠른 스트림의 BufferedInputStream 을 사용한다고 인코딩 되지 않은 한글이 깨지지 않을리가 없다는걸 보여준다!
		
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			
			byte[] b = new byte[4];
			int readByte = 0;
			StringBuilder sb = new StringBuilder();
			
			while((readByte = bis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte));
			}
			System.out.println(sb.toString());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex03_complete() {
		
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		
		BufferedReader br = null;	
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file))); // FileInputSteam: byte타입을 받는 스트림, InputStreamReader: 문자열로 변환
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			while((line = br.readLine()) != null) {	// 그냥 외워...
				sb.append(line + "\n");
			}
			System.out.println(sb.toString());		// 키보드에 뚫어놓은 통로의 이름이 system.in 이다.
		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
				
		
		
	}
	
	public static void ex04() {
		
		// String name, int age, double height, boolean isAlive 순으로 값이 저장 된 ex04.dat 파일

		File file = new File("C:" + File.separator + "storage", "ex04.dat");
		
		DataInputStream dis = null;
		
		try {
			
			dis = new DataInputStream(new FileInputStream(file));
			
			// 입력(변수 타입에 따라서 메소드가 다름)
			String name = dis.readUTF(); 			// writeUTF에 대응
			int age = dis.readInt(); 				// writeInt 에 대응
			double height = dis.readDouble(); 		// writeDouble 에 대응
			boolean isAlive = dis.readBoolean(); 	// writBoolean 에 대응
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(height);
			System.out.println(isAlive);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(dis != null) {
						dis.close();
					} 
				}catch(IOException e) {
						e.printStackTrace();
					}
					
				}
	}
	
	public static void ex05() {
		
		// Person 객체가 3개 저장 되어 있는 (List<Person> 2개, Person 1개) ex05.dat 파일
		
		File file = new File("C:" + File.separator + "storage", "ex05.dat");
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream(file));
			
			// 입력
			// readObject 메소드는 Object를 반환하므로 적절하게 캐스팅 해야 한다.
			@SuppressWarnings("unchecked")
			List<Person> people = (List<Person>)ois.readObject();
			Person person = (Person)ois.readObject();
			
			System.out.println(people);
			System.out.println(person);

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ex01();
//		ex02();
//		ex02_comlete();
//		ex03();
//		ex03_complete();
//		ex04();
//		ex05();
		
		
	}


}
