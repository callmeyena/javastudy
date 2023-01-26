package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {
	
	private String name;
	private List<Car> cars;
	private int idx;
	private Scanner sc;
	private int max;
	
	public ParkingLot(String name, int max) {
		super();
		this.name = name;
		this.max = max;
		cars = new ArrayList<Car>();
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		System.out.println("현재 등록 된 차량: " + cars.size() + "대");
		if(cars.size() == max) {
			return;
		}
		
		System.out.print("차량번호 >>> ");
		String carNo = sc.next();
		System.out.print("모델 >>> ");
		String model = sc.next();
		
		cars.add(new Car(carNo, model));
		System.out.println("차량번호" + carNo + " 차량이 등록 되었습니다.");	
	}
	
	public void deleteCar() {
		System.out.println("현재 등록 된 차량: " + cars.size() + "대");
		if(cars.size() == 0) {
			return;
		}
		
		System.out.print("차량번호 >>> ");
		String carNo = sc.next();
		for(Car c : cars) {
			if(carNo.equals(c.getCarNo())) {
				cars.remove(c);
				System.out.println("차량 번호 " + carNo + "가 삭제 되었습니다.");
				return;
			}
		}
		System.out.println("대상 차량이 존재하지 않습니다.");
			
	}
	
	public void printAllCars() {
		if(cars.size() == 0) {
			System.out.println("현재 등록 된 차량이 없습니다.");
			return;
		}
		
		System.out.println(name + " 차량 목록");
		for(Car c : cars) {
			System.out.println(c);
		}
		
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
