package banking;

public class Atm {
	String accountHolder;
    long accountNum;
    long mob;
    private int bal;
    private int pin;
    int count;
    
    Atm(String accountHolder,long accountNum,long mob,int bal,int pin){
    	this.accountHolder=accountHolder;
    	this.accountNum=accountNum;
    	this.mob=mob;
    	this.bal=bal;
    	this.pin=pin;
    }
    void setPin(int oldPin,int newPin){
    	if(count<3){
    	if(this.pin==oldPin){
    		this.pin=newPin;
    		System.out.println("*******your pin has been changed******");
    	}
    	else{
    		System.out.println("incorrect pin");
    		count++;
    	}
    }
    	else{
    		System.out.println("****Blocked****");
    		System.exit(0);
    	}
    }
void setDeposit(long accountNum,int depositBal){
	if(this.accountNum==accountNum){
		this.bal=this.bal+depositBal;
	System.out.println(this.accountHolder+" your remaining balance is "+this.bal);
	}
	else{
		System.out.println("plz check your account number");
		
	}
}
void setWithdraw(long accountNum,int withdrawBal){
	if(this.accountNum==accountNum){
		this.bal=this.bal-withdrawBal;
		System.out.println(this.accountHolder+" your remaining balance is: "+this.bal);
}
else{
	System.out.println("check your account number");
	}
}
}
