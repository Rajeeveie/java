package privateLearning;

public class TestDeatil {

	public static void main(String[] args) {
		StudentDetail s1=new StudentDetail("Rajeev",9988776655l,"email@gmail.com",450,1221);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(s1.email);
		//System.out.println(s1.mobile);
	  s1.getMobile(1221);
      s1.setMobile(1221,9988776655l,7788996655l);
      s1.getMobile(1221);
      s1.setPin(1221,8570);
      s1.getMobile(1221);
      s1.getMobile(1221);
	}

}
