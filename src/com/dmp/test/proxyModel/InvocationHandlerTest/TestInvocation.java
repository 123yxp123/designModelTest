package test.proxyModel.InvocationHandlerTest;

import proxyModel.InvocationHandlerTest.DebugProxy;
import proxyModel.InvocationHandlerTest.Greet;
import proxyModel.InvocationHandlerTest.GreetImpl;
import proxyModel.InvocationHandlerTest.SimpleProxy;

public class TestInvocation {
	public static void main(String[] args) {
		test2();
	}
	public static void test1(){
		Greet g = new GreetImpl();
		Greet s = new SimpleProxy(g);
		s.sayHello("SimplyProxy");
		s.goodBey();
	}
	
	public static void test2(){
		Greet g = new GreetImpl();
		//生成的s和g有相同的hashCode，通过DebugProxy构造的s比原来的g有更多的功能
		Greet s = (Greet) DebugProxy.newInstance(g);
		s.sayHello("DebugProxy");
		s.goodBey();
	}
}
