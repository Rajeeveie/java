package looseCoupling;
import java.util.Scanner;
public class TestPlayer {

	public static void main(String[] args) {
		PlayerFactory pf=new PlayerFactory();
		Scanner sc=new Scanner(System.in);
		System.out.println("please type a song to listen of your choice");
		String song = sc.nextLine();
		pf.playMusic(song);

	}

}