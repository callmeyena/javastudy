package practice03_Watch;

public class Watch {

	// 필드
	private int hour;  // 0 ~ 23
	private int minute;  // 0 ~ 59
	private int second;  // 0 ~ 59
	
	// 생성자
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// 메소드
	int maxHour = 0;
	int addHour(int hour) {
		for(int i = 0; i < 24; i++) {
			if(hour < 24) {
				maxHour += hour;
			}
		}
		return maxHour;

	}
	
	
}