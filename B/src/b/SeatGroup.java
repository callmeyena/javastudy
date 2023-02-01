package b;

import javax.swing.JOptionPane;

public class SeatGroup {			// 좌석의 갯수가 타입마다 다르다.
	
	private String seatType; 		// "S", "R", "A"
	private Seat[] seats;			// 배열의 선언

	// new SeatGroup("S, 10): "S"석이 10개 있다.
	public SeatGroup(String seatType, int length) {
		this.seatType = seatType;
		seats = new Seat[length];	// 배열의 생성 / new Seat는 언제 어디서든 생성 해줘야 한다..!
		for(int i = 0; i < length; i++) {
			seats[i] = new Seat(); 	// 점유 되지 않은 빈 좌석을 배열의 길이 만큼 만들기
		}	
	}
	
	// 예매 상황
	public void info() {
		
		System.out.println("[" + seatType + "] 타입");
		for(int i= 0; i < seats.length; i++) {
			System.out.print((i < 9 ? "0" : "") + (i + 1));
			if(seats[i].isOccupied() == false) {
				System.out.print("      ");
			} else {
				System.out.print(seats[i].getName());
			}
			
			// 인덱스 일의 자리가 9면 줄을 바꾸고 아니면 공백을 준다.
			// 인덱스를 10으로 나눴을 때 나머지가 9가 되도록
			if(i % 10 == 9) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
	}
	
	// 예약하기
	public boolean reserve() {
		info();	 // 예매 상황 보여주기
		String strNo = JOptionPane.showInputDialog("예약할 시트 번호를 입력 하세요.");
		int seatNo = Integer.parseInt(strNo);	// Dialog를 통한 입력 값은 무조건 String처리 되기 때문에 parseInt 해줘야함
		if(seatNo < 1 || seatNo > seats.length) {
			System.out.println(seatNo + "번 좌석은 없는 좌석 입니다.");
			return false; 	// 예약하기 실패
		}
		if(seats[seatNo -1].isOccupied()) {
			System.out.println(seatNo + "번 좌석은 이미 예약 된 좌석 입니다.");
			return false;	// 예약하기 실패 / 실패 먼저 처리하고 성공 사유를 나중에 하자
		}
		String name = JOptionPane.showInputDialog("예약자 성함을 입력 하세요.");
		seats[seatNo - 1].reserve(name);
		System.out.println(seatNo + "번 좌석 예약이 성공했습니다.");
		return true;		// 예약하기 성공	
	}
	
	// 예약취소하기
	public boolean cancel() {
		info();
		String name = JOptionPane.showInputDialog("취소자 성함을 입력하세요.");
		for(int i = 0; i < seats.length; i++) {
			if(seats[i].isOccupied() && seats[i].isMatched(name)) {		// 같은 이름은 없다는 가정하에 풀기
				seats[i].cancel();									// 취소역할 수행하는 코드
				JOptionPane.showMessageDialog(null, "예약자 " + name + "의 예약이 취소 되었습니다.");
				return true;
			}
		}
		JOptionPane.showMessageDialog(null, "입력된 이름 " + name + "은 존재하지 않습니다.");
		return false;
	}

}

