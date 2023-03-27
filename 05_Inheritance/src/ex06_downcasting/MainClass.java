package ex06_downcasting;

public class MainClass {
	
	public static void ex01() {
		
		// upcasting
		Person person = new Student();
		
		
		// downcasting
		Student student = (Student)person;
		
		student.eat();
		student.sleep();
		student.study(); //downcasting 하면 다 호출해서 실행할 수 있다
	}

	
	public static void ex02() {
		
		// Person
		Person person = new Person();
		
		
		// 잘못된 캐스팅은 컴파일 오류로 걸러지지 않는다.
		Student student = (Student)person;
		
		// 캐스팅은 
		student.eat();
		student.sleep();
		student.study(); // 오류가 발생하는 부분: person은 student의 study기능(메소드)이 없기 때문에 오류가 발생한다.
	}

	
	public static void ex03() {
		
		// Person
		Person person = new Person();
		
		// student 객체(인스턴스, instance)가 맞다면 student 타입으로 캐스팅 하자 / 객체(person) = 메모리에 실제로 만들어진 것 = 인스턴스(instance)
		if(person instanceof Student) { // instanceof 연산자
			
			Student student = (Student)person;
			student.eat();
			student.sleep();
			student.study();
			
		// 여기부터
			person.eat();
			person.sleep();
			((Student)person).study(); // 여기까지! 최종적으로 코드진행은 이런식으로 진행하자 eat, sleep 과 study는 다른 곳에 있다는 걸 알려주는게 좋다.
			// Student student = (Student)person; + student.eat(); = ((Student)person).eat(); 앞의 두 문장을 합친 것/ 서로 같은 의미임
			
			((Student) person).study(); // 자동으로 downcasting 해줌
		}
		
		
		
	}
	public static void main(String[] args) {
		ex02();
//		ex03();

		
		
		

	}

}
