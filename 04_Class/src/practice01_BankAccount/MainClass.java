package practice01_BankAccount;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount myAcc = new BankAccount("010-1111-1111", 50_000);
		
		BankAccount yourAcc = new BankAccount("010-2222-2222", 100_000);
		// Tip 천단위 구분 , 대신 _로 표기/ , 하면 인수 구분으로 되기 때문에 오류나고 지랄남ㅋ	
		
		
		myAcc.transfer(yourAcc, 50_000);
		System.out.println();
		
		myAcc.inquiry();
		yourAcc.inquiry();
		

	}

}
