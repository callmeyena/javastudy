package BankAccount;

public class BankAccount {
	
	// 필드
	private String accNo;
	private long balance;
	
	// 생성자
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	// 메소드(입금, 출금, 이체, 조회)
	
	// 입금(마이너스 입금 불가 처리)
	public void deposit(long money) {
		if(money <= 0) {
			return;
		}
		balance += money;
	}
	
	// 출금(마이너스 출금과 잔액보다 큰 출금 불가 처리)
	public long withdrawal(long money) {
		if(money <= 0 || money > balance) {
			return 0;
		}
		balance -= money;
		return money;
	}
	
	// 이체
	// 1. 내 통장에서 money 출금: (this.)withrawal(money)
	// 2. 상대 통장에 실제로 내 통장에서 출금된 금액 money 입금: other.withdrawal(money)
	public void transfer(BankAccount other, long money) {
		other.deposit(withdrawal(money));
	}

	public void inquiry() {
		System.out.println("계좌번호: " + accNo);
		System.out.println("현재 잔액: " + balance);
	}

}
