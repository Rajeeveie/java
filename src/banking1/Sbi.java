package banking1;

public class Sbi extends Atm {
	public String accountHolderName;
	public long accountNumber;
	public long mobile;
	private int pin;
	public static int minBal=3000;
	private int balance;
	int counter;
	card c;
	static long numberCard;
	public Sbi(String accountHolderName, long accountNumber, long mobile, int pin, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.mobile = mobile;
		this.pin = pin;
		this.balance = balance;
		c=new card();
		c.nameOnCard=accountHolderName;
		c.typeCard="VISA";
		c.cardNumber=numberCard;
		numberCard++;
	}

}
