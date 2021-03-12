package test;
import qspider.Trainer;
//import jspider.Trainer; we wont import, as className is same as in other package.
public class TestTrainer {

	public static void main(String[] args) {
		Trainer t1=new Trainer("Zeeshan sir",27,"Core java");
		t1.show();
	// t1.name="MD zeeshan";   (not visible)
	 //t1.subject="only java";   (not visible)
		t1.changeName("MD zeeshan");
		t1.show();
		
	//Now to make object of Trainer from jspider,we wont import it .instead we shall use qualified name.
   jspider.Trainer t2=new jspider.Trainer("Rahul sir",32,"Manual Testing");
      t2.show();
      t2.changeName("Azam sir");
      t2.show();
 }
}