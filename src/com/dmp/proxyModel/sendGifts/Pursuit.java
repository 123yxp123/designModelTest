package proxyModel.sendGifts;
/**
 * 追求者类
 * @author yxp
 *
 */
public class Pursuit implements GiveGift{
	private String schoolGirl;//接收礼物的人
	public Pursuit(String schoolGirl){
		this.schoolGirl = schoolGirl;
	}
	@Override
	public void giveGolle(){
		System.out.println(schoolGirl+":送给你娃娃 ");
	}
}
