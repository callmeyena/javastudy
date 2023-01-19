package ex07_exception;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun = new Gun();
		
		try {
			gun.reload(20);
			gun.shoot(3);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
