package banking;

public class TestAtm {
public static void main(String[] args){
	Atm a1=new Atm("Rajeev",1199882277332l,9988776655l,50000,5555);
	System.out.println(a1.accountHolder);
	System.out.println(a1.accountNum);
	System.out.println(a1.mob);
	//System.out.println(a1.bal);
	//System.out.println(a1.pin);
	a1.setPin(5555,7777);
	a1.setWithdraw(1199882277332l, 15000);
	a1.setDeposit(1199882277332l, 5000);
	
   }
}
