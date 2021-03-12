package collect;

public class WhatsAppUser {
	String user;
	void chat(){
         System.out.println(user+" mostly doing chat on WhatsApp Group.");
	}
	void deleteChat(){
         System.out.println(user+" is always delet chat history before logout.");
	}
	void sendVideo(){
         System.out.println(user+" always circualte viral vidoes & images.");
	}
	void recordVideo(){
         System.out.println(user+" can record current video and send on group.");
	}
	void sendFiles(){
         System.out.println(user+" attached coding files and send on WhatsApp Group");
	}
	void videoCalling(){
         System.out.println(user+" can group video calling.");
	}
	void voiceCalling(){
         System.out.println(user+" like WhatsApp voice calling feature.");
	}
}
class TestWhatsAppUser{
	public static void main(String[] args){
           WhatsAppUser w1 = new WhatsAppUser();
           w1.user = "User1";
           System.out.println("-------------------------------------------------------");
           w1.chat();
           w1.deleteChat();
           w1.sendVideo();
           w1.recordVideo();
           w1.sendFiles();
           w1.videoCalling();
           w1.voiceCalling();
           System.out.println("-------------------------------------------------------");

           WhatsAppUser w2 = new WhatsAppUser();
           w2.user = "User2";
           w2.chat();
           w2.deleteChat();
           w2.sendVideo();
           w2.recordVideo();
           w2.sendFiles();
           w2.videoCalling();
           w2.voiceCalling();
           System.out.println("-------------------------------------------------------");
           
           WhatsAppUser w3 = new WhatsAppUser();
           w3.user = "User3";
           w3.chat();
           w3.deleteChat();
           w3.sendVideo();
           w3.recordVideo();
           w3.sendFiles();
           w3.videoCalling();
           w3.voiceCalling();

	}
}

