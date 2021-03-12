package interfacelerning;

public class TestVechile {

	public static void main(String[] args) {
		Vechile v=new Yamaha();	
		v.start();
		v.run();
		v.stop();
		Yamaha y=(Yamaha)v;
		y.kick();
		}
	
	}


