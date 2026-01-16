package java_oops;

interface notificationServices {
	
	String service_Name=" Brodcasting Serivices";

	void send(String message, String User);

	default void Unsend() {
		System.out.println("Message is not Delivered");
	}

}

class SMS implements notificationServices {

	@Override
	public void send(String message, String User) {
		System.out.println("SMS had deliverd");
		System.out.println(message + " BY " +User);

	}
	

}

class Email implements notificationServices{
	
	@Override
	public void send(String message, String User) {
		System.out.println("Email has deliverd succesfully");
	}
}
public class Interface2_NotificationProgram {

	public static void main(String[] args) {
		
		SMS s = new SMS();
		s.send("Hi Ritik How are you", "Harivansh");
	

	}

}
