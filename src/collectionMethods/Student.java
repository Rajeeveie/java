package collectionMethods;

public class Student {
String name;
int id;
long mobile;
public Student(String name, int id, long mobile) {
	super();
	this.name = name;
	this.id = id;
	this.mobile = mobile;
}
public int hashCode(){
	return id;
}
public String toString(){
	return (name+" "+mobile);
}
}
