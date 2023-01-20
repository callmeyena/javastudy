package parking;

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
		
		System.out.println("현재 등록 된 차량 " + idx + "대");
		
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능 합니다.");
			return;
		}
		System.out.print("차량 번호 >>> ");
		String carNo = sc.next();
		System.out.print("모델명 >>> ");
		String carModel = sc.next();
		cars[idx++] = new Car(carNo, carModel);
		System.out.println("차량번호 " + carNo + "차량이 등록 되었습니다.");
	} //
	
	public void deleteCar() {
		
		if(idx == 0) {
			System.out.println("현재 등록된 차량이 없습니다.");
			return;
		}
		System.out.println("현재 등록된 차량 " + idx + "대");

		System.out.print("차량 번호 >>> ");
		String carNo = sc.next();
		for(int i = 0; i < idx; i++) {
			if(cars[i].getCarNo().equals(carNo)) {
				cars[i] = cars[idx--];
				System.out.println("차량번호 " + carNo + "차량이 삭제 되었습니다.");
			}
			else {
				System.out.println("대상 차량이 존재하지 않습니다.");
				return;
			}
		}	
		
	} // // system.arraycopy(cars, i+1, cars, i, 3) => (cars, i + 1, cars, i, idx - i - 1); // 삭제할 요소의 뒤에 있는 것들을 모두 한 칸씩 앞으로 옮기기
	
	public void printAllCars() {
		
		if(idx == 0) { // idx란 단순히 배열의 인덱스가 아니라, 앞으로 채워질 곳이 되는.. 하 나 뭐래냐...받아쓰기도 못하네...ㅎ
		System.out.println("현재 등록된 차량이 없습니다");	
		return;
		}
		System.out.println(name);
		
		  for(int i = 0; i < idx; i++) {
			Car car = cars[i];
			System.out.println(car);
		  } // 이게 쌤의 추천 방법
		  
		  for(int i = 0; i < cars.length; i++) {
			  Car car = cars[i];
			  if(car != null) {
				  System.out.println(car);
			  }
		  }
	}
	
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가 2.삭제 3.전체 0.종료 >>> ");
			
			String choice = sc.next();
		
			switch(choice) {
			case "1":
				addCar(); 			
				break;
			case "2":
				deleteCar(); 		
				break;
			case "3":
				printAllCars(); 	
				break;
			case "0":
				return; 			
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}	
		}
	}
	
} //
