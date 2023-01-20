package practice02_soldier;

public class Soldier { // 총의 기능을 군인이 사용할 수 있다 = Soldier가 Gun을 가지고 있기 때문에 사용할 수 있다.
	
	// 필드
	private Gun gun;
	
	// 가지고 있으면 된다
	
	// 메소드
	public void reload(int bullet) {
		gun.reload(bullet); // 초기값은 null => 첫 null point exception
	}
	
	// 생성자
	public Soldier() {
		gun = new Gun();
	}
	
	public void shoot() {
		gun.shoot();
	}
	
	
	
	

}
