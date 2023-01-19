package ex07_exception;

public class Gun {
	
	private int bullet;
	public static final int MAX_BULLET = 20;
	
	// 총알 넣기
	public void reload(int bullet) throws RuntimeException {
		if(this.bullet + bullet > MAX_BULLET) {
			throw new RuntimeException("장전 불가");
		}
		this.bullet += bullet;
	}

	// 총쏘기
	public void shoot(int shots) {
		if(this.bullet == 0) {
			throw new RuntimeException("총알이 없습니다.");
		}
 		bullet -= shots;
//		bullet--;
		System.out.println(bullet + "발 남았음");
	}

	// getter & setter
	public int getBullet() {
		return bullet; // set 받은 bullet을 현재 클래스에서 적용한 뒤의 값을 다시 메인에 보낸다
	} 
	public void setBullet(int bullet) {
		this.bullet = bullet;
	} // 메인에서 설정한 bullet 값을 가져와 현재 클래스에 set한다.

	
} //
