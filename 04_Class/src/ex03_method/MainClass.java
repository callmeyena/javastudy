package ex03_method;

public class MainClass {

	
	public static void ex01() {
		
		// Calculator 객체 선언 + 생성
		Calculator calc = new Calculator();
		
		double add = calc.addition(1.5, 2.5); // addition 메소드의 호출 / 1.5, 2.5 => 인수 혹은 argument라고 부른다 => 그 argument를 저장하는 변수는 매개변수
		System.out.println(add);
		
		double sub = calc.subtraction(2.5, 1.3); // addition 메소드의 호출
		System.out.println(sub);
		
		double mul = calc.multiple(2.5, 1.3); // addition 메소드의 호출
		System.out.println(mul);

	}
	
	public static void ex02() {
		
		CoffeeMachine coffeeMacine = new CoffeeMachine();
		
		coffeeAndChange coffeeAndChange = coffeeMacine.buyCoffee(500, 1); // 결과적으로 = cnc
		System.out.println(coffeeAndChange.coffee);
		System.out.println(coffeeAndChange.change);
		
		System.out.println(coffeeMacine.moneyPot);
		
	}
	
	public static void ex03() {
		
		Car car = new Car();
		
		car.addOil(100);
		
		for(int n = 0; n < 51; n++) { 
			car.pushAccel(); // 기름은 없고 속도는 100
		}
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
		
		for(int n = 0; n < 11; n++) {
			car.pushBrake();
		}
		
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);

	}
	public static void main(String[] args) {
		ex01();
		
	

	}

}
