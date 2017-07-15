package dip;
/**
 * 发生邮箱信息
 * @author yxp
 *
 */
public class EmailMessage implements IMessage{

	@Override
	public void sendMessage() {
		System.out.println("send email messeage");
	}

}
