package pack1;

public class Trainer {
	public String name;
	public Integer age;
	public String subject;
	public Character gender;

	public Trainer(String name,Integer age,String subject,Character gender){
	this.name=name;
	this.age=age;
	this.subject=subject;
	this.gender=gender;
}
	public void show(){
	System.out.println(name+" is age of "+age+" and gender is "+gender);
}
	public void teach(){
	System.out.println(name+" teaches "+subject);
 }
}
