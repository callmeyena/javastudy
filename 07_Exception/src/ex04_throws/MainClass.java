package ex04_throws;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun = new Gun();
		
		try {
			gun.reload(10);		// reload메소드 호출함
			for(int n = 0; n < 11; n++) {
				gun.shoot();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	} // 메인메소드의 끝

} //
