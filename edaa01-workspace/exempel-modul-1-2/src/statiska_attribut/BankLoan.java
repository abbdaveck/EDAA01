package statiska_attribut;
public class BankLoan {
	private static double interest = 0.0;
	private double amount;
	
	public BankLoan(double amount) {
		this.amount = amount;
	}
	
	public static void setInterestRate(double interestRate) {
		interest = interestRate;
	}
	
	public double getInterestExpense() {
		return amount * interest / 100.0;
	}
	
	public static void main(String[] args) {
		BankLoan.setInterestRate(4.0);
		BankLoan loan = new BankLoan(200000);
		System.out.println(loan.getInterestExpense());
	}
}
