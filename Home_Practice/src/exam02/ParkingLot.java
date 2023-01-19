package exam02;

import java.util.Scanner;

public class ParkingLot {
	
	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		
		System.out.println("현재 등록 된 차량: " + idx + "대");
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능 합니다.");
			return;
		}
		System.out.print("차량번호 >>> ");
		String carNo = sc.next();
		System.out.println("모델 >>> ");
		String carModel = sc.next();
		cars[idx++] = new Car(carNo, carModel);
		System.out.println("차량번호 " + carNo + "차량이 등록 되었습니다.");
	}
	
	
	
	public void deleteCar() {
		
		System.out.println("현재 등록된 차량: " + idx + "대");
		
		System.out.print("차량번호 >>> ");
		String carNo = sc.next();
		if(carNo != sc.next()) {
			System.out.println("일치하는 차량이 없습니다.");
			return;
		}
		for(int i = 0; i < cars.length; i++) {
			if(cars[idx].getCarNo() == carNo) {
				cars[idx] = cars[idx--];
				break;
			}
		}
//		
//		1. 차량번호 입력받기
//		2. 번호에 해당하는 차 찾아서 배열에서 제거하기
//		(없는 차이면 없다고 print하고 다시 입력받기)
//		3. 배열 빈칸 채우기
//

	
	}
	
	public void printAllCars() {
		
//		printAllCar()
//		이건 그냥 배열 순회해서 출력하면 끝일 것 같은데,,?
		
	}
	
	public void manage() {
		
//		while(true) {
//			
//			System.out.print("1.추가 2.삭제 3.전체 0.종료 >>> ");
//			
//			String choice = sc.next();
//			
//			switch(choice) {
//			case "1": 
//				addCar(); 
//				break;
//			case "2": 
//				deleteCar(); 
//				break;
//			case "3": 
//				printAllCars(); 
//				break;
//			case "0": 
//				return;
//			default: 
//				System.out.println("존재하지 않는 메뉴입니다.");
//			}
//		}
		
		
		while(true) {
			
			System.out.print("1.추가 2.삭제 3.전체 0.종료 >>> ");
			String choice = sc.next();
			
			switch(choice) {
			case"1": addCar(); break;
			case"2": deleteCar(); break;
			case"3": printAllCars(); return;
			case"0": return;
			default: System.out.println("존재하지 않는 메뉴입니다.");
			}
			
		}

		
	}
	
	
	

}
