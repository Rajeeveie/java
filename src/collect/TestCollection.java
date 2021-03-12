package collect;

import java.util.TreeSet;

public class TestCollection {

	public static void main(String[] args) {
		Student s1=new Student("A",24,101);
		Student s2=new Student("B",25,103);
		Student s3=new Student("C",20,105);
		Student s4=new Student("D",27,108);
		Student s5=new Student("E",23,102);
		
		TreeSet<Student> ts=new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		for(Student student:ts){
			System.out.println(student);
		}

	}

}
