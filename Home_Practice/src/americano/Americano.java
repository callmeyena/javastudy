package americano;

public class Americano {

	private Espresso[] cups;
	private int shotCount;
	private int extraWater;
	private int idx;
	
	public Americano(int shotCount, int extraWater) {
		cups = new Espresso[shotCount];
		this.shotCount = shotCount;
		this.extraWater = extraWater;
	}
	
	// 샷추가 addEspresso 메소드
	public void addEspresso(Espresso espresso) {
		if(idx == shotCount) {
			System.out.println("더 이상 샷을 추가할 수 없습니다.");
			return;
		}
		cups[idx++] = espresso;
	}
	
	public void info() {
		int totalWater = 0;
		for(int i = 0; i < cups.length; i++) {
			System.out.println("-- " + (i + 1) + "번째 샷 정보 --");
			cups[i].info();
			totalWater += cups[i].getWater();
		}
		totalWater += extraWater;
		System.out.println("아메리카노 총 ml : " + totalWater + "ml");
	}
	
	
	
}
