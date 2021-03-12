package collectionMethods;

public class Trainer {
String name;
int empId;
String subject;
double workExp;
public Trainer(String name, String subject, double workExp) {
	super();
	this.name = name;
	this.subject = subject;
	this.workExp = workExp;
}
public String toSting(){
	return name;
}
public int hashcode(){
	return empId;
}
}
