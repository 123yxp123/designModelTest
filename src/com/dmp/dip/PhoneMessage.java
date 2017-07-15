package dip;

public class PhoneMessage implements IMessage{

	@Override
	public void sendMessage() {
		System.out.println("send phone message");
	}
	
}
