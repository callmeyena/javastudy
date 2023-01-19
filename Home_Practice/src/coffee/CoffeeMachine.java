package coffee;

public class CoffeeMachine {
	
	// 필드
	int moneyPot;
	int[] prices = {2000, 3000, 4000};
	String[] menu = {"Americano", "Cafe Latte", "vanila Latte"};

	// 생성자
	public CoffeeMachine() {
		
	}
	
	// 메소드
	CoffeeAndChange buyCoffee(int money, int choice) {
		
		// 돈이 모자르면 그대로 돈을 반환해보기
		int price = prices[choice-1];
		if (money < price) {
			CoffeeAndChange cnc = new CoffeeAndChange();
			cnc.change = money;
			return cnc;
		}
		
		// 돈이 안모자를때 동작함
		String coffee = menu[choice - 1];
		
		moneyPot += price;
		CoffeeAndChange cnc = new CoffeeAndChange();
		cnc.coffee = coffee;
		cnc.change = money - price;
		return cnc;
	}
	
	
} //
