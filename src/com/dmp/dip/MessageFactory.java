package dip;
/**
 * 发送消息工厂
 * @author yxp
 *
 */
public class MessageFactory {
	
	/**
	 * 发送促销信息
	 * 可以使用反射机制进行不同类型的对象实例化
	 * @param type
	 * @return
	 */
	public static IMessage createPromotionalMessage(String type){
		IMessage imessage = null;
		switch(type){
			case "Email":
				imessage = new EmailMessage();
				break;
			case "Phone":
				imessage = new PhoneMessage();
				break;
			default :
				imessage = new EmailMessage();
		}
		return imessage;
	}
}
