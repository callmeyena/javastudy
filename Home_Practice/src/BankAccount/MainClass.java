package BankAccount;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount yourAcc = new BankAccount("110-558-565588", 300000);
		BankAccount myAcc = new BankAccount("110-741-369452", 35000);
		
		yourAcc.transfer(myAcc, 100000);
		System.out.println();
		
		myAcc.inquiry();
		yourAcc.inquiry();
		
		
	}

}
