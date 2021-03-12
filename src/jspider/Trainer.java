package jspider;

public class Trainer {
	String name;
	int age;
	String subject;
	public Trainer(String name,int age,String subject){
		this.name=name;
		this.age=age;this.subject=subject;
	}
	public void show(){
		System.out.println(name+" is teaching : "+subject);
		System.out.println("from Jspider");
	  }
	public void changeName(String name){
		this.name=name;
	}
	}

