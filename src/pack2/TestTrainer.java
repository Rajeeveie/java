package pack2;

import pack1.Trainer;

public class TestTrainer {

	public static void main(String[] args) {
		Trainer t2=new Trainer("Rahul sir",32,"Manual Testing",new Character('m'));
		t2.show();
		t2.teach();
		//updation start from here...
		System.out.println("After update... ");
		t2.name="Aazam sir";
		t2.age=26;
		t2.subject="Database";
		t2.show();
		t2.teach();

	}

	}

