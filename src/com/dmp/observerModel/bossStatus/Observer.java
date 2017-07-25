package observerModel.bossStatus;
/**
 * 观察者抽象类
 * 等待通知者给予信号，进行对于处理
 * @author yxp
 *
 */
public abstract class Observer {
//	protected String name;
//	protected Subject sub;
//	/**
//	 * 观察者订阅的主题对象
//	 * @param name
//	 * @param sub
//	 */
//	public Observer(String name,Subject sub){
//		this.name = name;
//		this.sub = sub;
//	}
	
	/**
	 * 观察者根据通知者发生变化时给予的信号，进行相关处理
	 */
	public abstract void update();
}
