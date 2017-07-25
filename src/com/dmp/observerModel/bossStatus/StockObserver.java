package observerModel.bossStatus;
/**
 * 股票观察者，具体观察者子类
 * @author yxp
 *
 */
public class StockObserver extends Observer{

	protected String name;
	protected Subject sub;
	/**
	 * 观察者订阅的主题对象
	 * @param name
	 * @param sub
	 */
	public StockObserver(String name,Subject sub){
		this.name = name;
		this.sub = sub;
	}

	@Override
	public void update() {
		System.out.println("主题状态变更为："+sub.getSubjectState()+"，Stock观察者"+name+"关闭Stock的APP");
	}


}
