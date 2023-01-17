package ex03_method;

public class CoffeeMachine {
	
	// 필드 
	int moneyPot;
	String[] menu = {"아메리카노", "카페라떼", "마키아또"};
	int[] prices = {900, 1500, 2000};
	
	// 메소드 
	coffeeAndChange buyCoffee(int money, int choice) {
		
		// 돈이 모자르면 그대로 돈을 반환해보기
		int price = prices[choice -1];
		if(money < price) { // 아메 900원이 입력
			coffeeAndChange cnc = new coffeeAndChange();
			cnc.change = money;
			return cnc;
		};
		
		
		// 돈이 안모자를때 동작함
		String coffee = menu[choice - 1];
		
		moneyPot += price;
		coffeeAndChange cnc = new coffeeAndChange();
		cnc.coffee = coffee;
		cnc.change = money - price;
		return cnc; // return 뒤에는 어떤 문장도 출력할 수 없음
		
		// 사용자가 어떤 커피를 먹고싶은지, 커피의 가격은 얼마인지, 잔돈은 얼마 돌려줘야하는지
		
	}

}
