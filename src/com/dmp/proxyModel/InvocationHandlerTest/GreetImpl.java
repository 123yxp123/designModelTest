package proxyModel.InvocationHandlerTest;

public class GreetImpl implements Greet{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}

	@Override
	public void goodBey() {
		System.out.println("Good bey");
	}

}
