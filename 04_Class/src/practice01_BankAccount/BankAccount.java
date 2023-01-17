package practice01_BankAccount;

public class BankAccount {
	
	// 필드
	private String accNo;
	private long balance;
	
	
	// 생성자 // 메소드의 일종이라 public 처리함
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// 메소드(입금, 출금, 이체, 조회)
	
	// 입금(마이너스 입금 불가 처리)
	public void deposit(long money) {
		if(money <= 0) {
			return; // 메소드 종료(오직 반환이 void일 때만 사용 가능)
		}
		balance += money;
	}
	
	// 출금(마이너스 출금과 잔액보다 큰 출금 불가 처리)
	public long withdrawal(long money) {
		if(money <= 0 || money > balance) {
			return 0; // 반환 타입이 있을 땐 return과 함께 반환값 반환
		}
		balance -= money;
		return money;
	}
		
	
	// 이체
	public void transfer(BankAccount other, long money) {
		// 1. 내 통장에서 money 출금: (this.)withrawal(money)
		// 2. 상대 통장에 실제로 내 통장에서 출금된 금액 money 입금: other.withdrawal(money)
		other.deposit(withdrawal(money));
		
		
	}
	
	// 조회
	public void inquiry() {
		System.out.println("계좌번호: " + accNo);  
		System.out.println("잔액: " + balance + "원");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
