package proxyModel.InvocationHandlerTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 实现反射机制的代理，可以实现所需要的不太代理需求，并且功能更加丰富
 * 动态代理
 * @author yxp
 *
 */
public class DebugProxy implements InvocationHandler{
	private Object obj;
	public DebugProxy(Object obj) {
		this.obj = obj;
	}
	/**
	 * 返回类实例
	 * @param obj
	 * @return
	 */
	public static Object newInstance(Object obj){
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new DebugProxy(obj));
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result;
		try {
			System.out.println("myMethod before"+method.getName());
			//注意为当前对象
			result = method.invoke(obj, args);
		} catch(InvocationTargetException ie){
			throw ie.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation exception"+e.getMessage());
		}finally{
			System.out.println("myMethod after"+method.getName());
		}
		return result;
	}
}
