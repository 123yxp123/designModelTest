package proxyModel.InvocationHandlerTest;
/**
 * 实现的简单代理模式
 * 静态代理
 * @author yxp
 *
 */
public class SimpleProxy implements Greet{
	private Greet greet;
	public SimpleProxy(Greet greet){
		this.greet = greet;
	}
	@Override
	public void sayHello(String name) {
		greet.sayHello(name);
	}

	@Override
	public void goodBey() {
		greet.goodBey();
		
	}

}
