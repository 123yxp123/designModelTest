package test.proxyModel.sendGift;

import proxyModel.sendGifts.Proxy;

/**
 * 代理模式
 * @author yxp
 *
 */
public class TestSendGift {
	public static void main(String[] args) {
		test1();
	}
	public static void test1(){
		Proxy proxy = new Proxy("小花");
		proxy.giveGolle();//送花
	}
}
