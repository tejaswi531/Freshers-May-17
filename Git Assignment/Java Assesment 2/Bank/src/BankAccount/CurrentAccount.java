package BankAccount;

public class CurrentAccount extends Bank2 {
	public boolean withdraw(double amount) {
		balance -=amount;
		return true;
	}

	public void deposite(double d) {
		// TODO Auto-generated method stub
		
	}
	

}
