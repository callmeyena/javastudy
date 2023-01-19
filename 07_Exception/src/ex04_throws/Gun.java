package ex04_throws;

	public class Gun {
		
		private int bullet;
		public static final int MAX_BULLET = 10;
		
		// 총알 넣기
		public void reload(int bullet) throws RuntimeException { // reload 메소드를 호출하는 곳으로 예외를 던지겠다 => MainClass의 try로 던짐 => 메소드를 호출했으니까
			if(this.bullet + bullet > MAX_BULLET) {
				throw new RuntimeException("장전 불가능");
			}
			this.bullet += bullet;
		}
	
		// 총쏘기
		public void shoot() throws RuntimeException {
			if(bullet == 0) {
				throw new RuntimeException("총알을 장전해주세요.");
			}
			bullet--;
		}
	
		public int getBullet() {
			return bullet;
		}
	
		public void setBullet(int bullet) {
			this.bullet = bullet;
		}
		
		
}
