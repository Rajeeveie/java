package looseCoupling;

public class PlayerFactory {
void playMusic(String songName){
	Player p;
	if(songName.endsWith("Mp4")){
		p=new Mp4Player();
		p.play(songName);
	}
	else if(songName.endsWith("Avi")){
		p=new AviPlayer();
		p.play(songName);
	}
	else{
		System.out.println("sorry! unsupported formatmat");
	}
}
}
