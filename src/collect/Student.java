package collect;

public class Student implements Comparable{
	String name;
	int age;
	int id;
	
     public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public int hashCode() {
		
		return id;
	}

	@Override
	public String toString() {
		
		return (name+" "+"\t"+id );
	}

	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return -(this.id-s.id);
	}
     
}
