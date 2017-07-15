package test.dip;

import dip.EmailMessage;
import dip.IMessage;
import dip.MessageFactory;
import dip.Notification;

public class TestNotifition {
	public static void main(String[] args) {
		test2();
	}
	public static void test1(){
		IMessage imessage = new EmailMessage();
		Notification notifcation = new Notification(imessage);
		notifcation.promotionalNotification();
	}
	public static void test2(){
		IMessage imessage = MessageFactory.createPromotionalMessage("Phone");
		Notification notifcation = new Notification(imessage);
		notifcation.promotionalNotification();
	}
}
