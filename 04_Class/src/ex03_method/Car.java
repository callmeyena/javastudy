package ex03_method;

public class Car {
	
	// 필드
	int oilPot;
	int carSpeed; // pushAccel 마다 속도는 10씩 증가, 최대속도 100, pushBrake 마다 속도 10씩 감소
	
	// 기름 넣기 메소드	
//	void addoil(int oil) {
//		oilPot += oil;
//		if(oilPot > 50) {
//			oil = 50;
//		}
//	}

	void addOil(int oil) {
		if(oilPot + oil > 50) {
			oilPot = 50;
			return; // 메소드를 더이상 실행하지 말고 종료하시오. / return은 원래 반환값이 있어야하는데 단독으로 return만 사용한다면 메소드를 종료하라는 뜻임 대신 void일때만 사용 가능함
		}
		oilPot += oil;
	}

	// 달리기 메소드
	void pushAccel() {
		if(oilPot == 0) {
			return;
	}
		oilPot--;
		
	if(carSpeed + 10 > 100) {
		carSpeed = 100;
		return;
	}
		carSpeed += 10;
		
}
	
	// 멈추기 메소드
	void pushBrake() {
		
		if(carSpeed == 0) {
			return;
		}
		
		carSpeed -= 10;
		if(carSpeed < 0) {
			carSpeed = 0;
		}
		
		
	}


}