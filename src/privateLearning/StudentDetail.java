package privateLearning;

public class StudentDetail {
String name;
private long mobile;
String email;
int marks;
private int pin;
int countMobUpdate;

public StudentDetail(String name,long mobile,String email,int marks,int pin){
this.name=name;
this.mobile=mobile;
this.email=email;
this.marks=marks;
this.pin=pin;
  }
void setMobile(int pin,long oldMob,long newMob){
	if(countMobUpdate<3){
		if(this.pin==pin && this.mobile==oldMob){
			this.mobile=oldMob;
			System.out.println("****congrats mobile updated *****");
	}
	else{
		countMobUpdate++;
		System.out.println("wrong pin or wrong mobile number");
	}
	}
else{
	System.out.println("Blocked");
	System.exit(0);
	}
}
	void getMobile(int pin){
		if(countMobUpdate<3){
			if(this.pin==pin){
				System.out.println(this.mobile);
				countMobUpdate=0;
			}
			else{
				countMobUpdate++;
				System.out.println("wrong pin");
			}
		}
		else{
			System.out.println("Bolocked");
			System.exit(0);
		}
	}
	void setPin(int oldPin,int newPin){
		if(this.pin==oldPin){
			this.pin=newPin;
			System.out.println("******pin updated*****");
		}
		else{
			System.out.println("cannot update.You entered wrong pin number");
		}
	}
}

			
	