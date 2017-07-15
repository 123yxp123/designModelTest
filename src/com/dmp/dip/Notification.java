package dip;
/**
 * 所有通知类,依赖注入（三种方式：构造函数注入，属性注入，方法注入）
 * 高层对象不依赖于低层对象，都应该依赖于抽象，抽象不应该依赖于细节，细节应该依赖抽象
 * 依赖注入的思想为：程序中所有的依赖关系都应该终止于抽象类或者接口
 * @author yxp
 *
 */
public class Notification {
	private IMessage imessage;
	/**
	 * 构造函数的依赖注入
	 * @param imessage
	 */
	public Notification(IMessage imessage){
		this.imessage = imessage;
	}
	/**
	 * 发送促销通知
	 */
	public void promotionalNotification(){
		imessage.sendMessage();
	}
	
}
