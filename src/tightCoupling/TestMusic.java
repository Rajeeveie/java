package tightCoupling;
import java.util.Scanner;
public class TestMusic {

	public static void main(String[] args) {
		AviPlayer a =new AviPlayer();
		Scanner sc=new Scanner(System.in);
    System.out.println("please type a song to listen in Avi format");
    String song=sc.nextLine();
    a.play(song);

	Mp4Player m=new Mp4Player();
System.out.println("please type a song to listen in Mp4 format");
song =sc.nextLine();
m.play(song);
}

}
