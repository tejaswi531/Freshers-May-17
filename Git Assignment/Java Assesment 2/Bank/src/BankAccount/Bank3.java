package BankAccount;

public class Bank3 {

	public static void main(String[] args) {
		CurrentAccount c = new CurrentAccount();
		SavingsAccount s = new SavingsAccount();
		c.deposite(500.00);
		s.deposite(500.00);
		doWithdrawl(c);
		doWithdrawl(s);
	}
	
	public static void doWithdrawl(Bank2 acc) {
		boolean result = acc.withdraw(1000.00);
		if(result) {
			System.out.println("Withdraw succeed.");
		}else {
			System.out.println("Withdraw failed.");
		}
	}
	
}	

	


