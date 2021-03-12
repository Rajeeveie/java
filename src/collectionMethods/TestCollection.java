package collectionMethods;
import java.util.Collection;
import java.util.ArrayList;

public class TestCollection {
	public static void main(String[] args){
Student s1=new Student("Rajeev",101,8828589632l);
Student s2=new Student("Sonam",102,9922775544l);
Student s3=new Student("Manjolika",103,8866557788l);
Student s4=new Student("Pooja",104,9955778866l);

Trainer t1=new Trainer("Zeeshan sir","core java",2.8);
Trainer t2=new Trainer("Rahul bhatt","Aptitude",3.0);

Collection c= new ArrayList();
c.add(s1);
c.add(s2);
c.add(s3);
c.add(s4);

c.add(t1);
c.add(t2);
for(Object object:c){
	System.out.println(object);
}
    }
	
}
