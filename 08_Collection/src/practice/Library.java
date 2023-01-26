package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	private List<Book> books;
	private Scanner sc;
	
	public Library() {
		books = new ArrayList<Book>();
		sc = new Scanner(System.in);
	}
	
	private void addBook() {
		System.out.println("==== 책 추가하기 ====");
		
		System.out.print("isbn >>> ");
		String isbn = sc.next();
		System.out.print("title >>> ");
		String title = sc.next();
		System.out.print("author >>> ");
		String author = sc.next();
		Book book = new Book(isbn, title, author);
		books.add(book);
		System.out.println(title + "책이 추가 되었습니다.");
		
	}
	
	private void deleteBook() {
		System.out.println("==== 책 삭제하기 ====");
		
		try {
			if(books.isEmpty())  {						 // 공백검사를 위해 만들어진 메소드 
				throw new RuntimeException("등록된 책이 없습니다.");
			} 
			System.out.print("삭제할 isbn >>> ");
			String isbn = sc.next();

			if(isbn.isEmpty() == false) {
				/* 1. 객체 기반 삭제(Book 객체간의 동등 비교가 필요하기 때문에 equals 메소드를 오버라이드 해야한다.) */
				for(Book book : books) { 	// 향상 for문으로 삭제하려면(배열이 있는) 객체를 생성해서 삭제한다...??????? 무슨말이야!!!!!!!!!!!
					if(isbn.equals(book.getIsbn())) {	
						books.remove(book);		// equals 메소드가 내부에서 사용된다.
						System.out.println(book + "책이 삭제 되었습니다.");
						return;
					}
				}	 
				 
				/* 2. 인덱스 기반 삭제
				for(int i = 0; i < books.size(); i++) {
					Book book = books.get(i); 				// 저장된 책의 한 권 한 권을 가져온다.
					if(isbn.equals(book.getIsbn())) {
						Book deletedBook = books.remove(i);	// remove(i)는 삭제된 요소(Book)를 반환한다 // idx가 있을 때는 향상 for문 사용 불가
						System.out.println(deletedBook + "책이 삭제 되었습니다."); // 변수 이름 book으로 해도 된답니다,,사실 졸아서 잘 못들었음 ㅠ
						return;
						}
				}	*/
			}
			throw new RuntimeException(isbn + "을 가진 책이 없습니다.");
		}	catch(Exception e) {
				System.out.println(e.getMessage()); 		// Exception e가 RuntimeException출력 값을 받아온거고, e.getMessage로 그 값을 출력해준다
		}
	} //
	
	private void findBook() {
		System.out.println("==== 책 조회하기 ====");
		try {
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");	
			}
			System.out.print("조회할 isbn >>> ");
			String isbn = sc.next();
			if(!isbn.isEmpty()) { 	// !(부정 연산자)는 잘 안보이기 때문에 잘 안쓴다.. 장난하나..ㅠ...그러면 왜만들었어,,!!!!!
				for(Book book : books) {
					if(isbn.equals(book.getIsbn())) {
						System.out.println("조회결과: " + book);
						return;
					}
				}
				
			}
			throw new RuntimeException(isbn + " isbn을 가진 책이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	private void printAllBooks() {
		System.out.println("==== 전체 조회하기 ====");
		try {
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			for(Book book : books) {
				System.out.println(book);
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void manage() {
		
		while(true) {
			
			System.out.println("1.추가 2.삭제 3.조회 4.전체 0.종료 >>> ");
			String choice = sc.next();
			
			switch(choice) {
				case "1": 
					addBook();
					break;
				case "2":
					deleteBook();
					break;
				case "3":
					findBook();
					break;
				case "4":
					printAllBooks();
					break;
				case "0":
					System.out.println("도서관리 프로그램을 종료합니다.");
					return;
				default:
						System.out.println("잘못된 입력입니다. 다시 시도해주시궜어요?");
				}
		}
	}

}
