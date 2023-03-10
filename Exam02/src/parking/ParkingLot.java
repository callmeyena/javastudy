package parking;


import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars; 	// cars[idx] = new Car("", "");	
	private int idx;		// idx++; / 즉 idx가 주차장에 저장된 자동차의 개수이기도 하다
	private Scanner sc;

	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}

	public void addCar() {
		System.out.println("현재 등록된 차량 : " + idx + "대");
		if (idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		System.out.println("차량번호 >>>");
		String carNo = sc.next();

		System.out.println("모델명 >>>");
		String model = sc.next();

		cars[idx++] = new Car(carNo, model);
		System.out.println("차량번호 " + carNo + "차량이 등록되었습니다.");
;

	}

	public void deleteCar() {
		//System.out.println("차량번호" + carNo +"차량이 삭제되었습니다.");
		System.out.println("대상 차량이 존재하지 않습니다.");
	}

	public void printAllCars() {
			System.out.println("대박주차장");		
			if (idx ==10)
				System.out.println("등록된 차량이 없습니다.");
				return;
		}

	public void manage() {

		while (true) {
			
			
			System.out.println("1.추가 2.삭제 3.전체 0.종료 >>>");
//			int choice = sc.nextInt(); // 비비비비추천. 에러남
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addCar();
				break;
			case 2:
				deleteCar();
				break;
			case 3:
				printAllCars();
				break;
			case 0:
				return;
			default:
				System.out.println("존재하지 않는 메뉴 입니다.");
			}

		}
	}
}