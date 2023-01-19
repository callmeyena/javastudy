package parking;

import java.util.Scanner;

public class ParkingLot {
	
	private String name;
	private Car[] cars; 				// cars[idx] = new Car("", "");			
	private int idx; 					// idx++; / 즉 idx가 주차장에 저장된 자동차의 개수이기도 하다						
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10]; 			// 주차장에 총 10대 주차 가능
		sc = new Scanner(System.in);
	}
	
	public void addCar() { 				// 현재 등록된 차량이 몇 대인지 보여주기 
		System.out.println("현재 등록된 차량: " + idx + "대");
		if(idx == cars.length) {		// idx와 cars 배열의 길이 10인 cars.length
			System.out.println("더 이상 차량 등록이 불가능 합니다.");
			return;
		}
		
//		System.out.println("차량번호와 모델명을 순서대로 입력하세요.");
//		Car car = new Car(sc.next(), sc.next()); // 객체를 이용한 저장 방법
		
		System.out.print("차량번호 >>> ");
		String carNo = sc.next(); 		// 공백 없는 문자열은 next
		System.out.print("모델 >>> ");
		String carModel = sc.next(); 
		cars[idx++] = new Car(carNo, carModel); // new...흑...ㅠ눈물..
		System.out.println("차량번호" + carNo + " 차량이 등록 되었습니다.");		
	}
	
	public void deleteCar() {
		
	}
	
	public void printAllCars() {
		
	}
	
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가 2.삭제 3.전체 0.종료 >>> ");
			
//			int choice = sc.nextInt(); // 비비비비추천. 에러남
			
			String choice = sc.next();
			
			switch(choice) {
			case "1":
				addCar(); 			// addCar 호출
				break;
			case "2":
				deleteCar(); 		// deletCar 호출
				break;
			case "3":
				printAllCars(); 	// printAllCars 호출
				break;
			case "0":
				return; 			// manage 메소드 종료 / return은 메소드 전체(while문)을 빠져나가는 것
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}
			
		}
	}
	
}
