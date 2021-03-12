package packageLearning;

 public class Trainer {
	public String name;
	public int age;
	public String subject;

	public Trainer(String name,int age,String subject){
	this.name=name;
	this.age=age;
	this.subject=subject;
}
	public void show(){
	System.out.println(name+" is age of "+age);
}
	public void teach(){
	System.out.println(name+" teaches "+subject);
 }
}
