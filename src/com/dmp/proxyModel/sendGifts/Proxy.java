package proxyModel.sendGifts;
/**
 * 代理送礼类（远程代理方式）
 * 可以利用代理的间接做些其他的事情（附加其他的用途）
 * 代理模式应用：
 * 1、远程代理——webservice 
 * 给一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实。
 * 2、虚拟代理
 * 根据需要创建开销很大的对象，通过它存放实例化需要很长时间的真实对象，达到性能最优化。
 * html页面访问时，下载图片，可以使用代理处理
 * 3、安全代理
 * 用来控制真实对象访问时的权限。应用于对象有不同访问权限时
 * 4、智能指引
 * 指当前调用真实对象时，代理处理另外一些事
 * 如计算真实对象的引用次数，这样当该对象没有引用时，可以自动释放它；
 * 或者当第一次引用一个持久化对象时，将它装入内存；
 * 或者在访问一个实际对象前，检查是否已经锁定它，以确保其他对象不能修改它
 * 这些都是通过代理在访问一个对象附加的一些内务处理
 * 
 * 3、
 * @author yxp
 *
 */
public class Proxy implements GiveGift{
	private Pursuit pursuit;//追求者，代理者帮送礼物的人
	public Proxy(String schoolGirl){
		pursuit = new Pursuit(schoolGirl);
	}

	/**
	 * 送礼物，实际调用的是追求者的方法
	 */
	@Override
	public void giveGolle() {
		pursuit.giveGolle();
	}
}
