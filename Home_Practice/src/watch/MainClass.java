package watch;

public class MainClass {

	public static void main(String[] args) {
		
		Watch watch = new Watch(16, 15, 30);
		
		watch.addHour(25);
		watch.addMinute(61);
		watch.addSecond(3661);
		
		watch.see();

	}

}
