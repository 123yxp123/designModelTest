package observerModel.weatherForecast;
/**
 * 主题抽象类
 * @author yxp
 *
 */
public interface Subject {
	/**
	 * 添加主题观察者
	 * @param obs
	 */
	public void attach(Observer obs);
	/**
	 * 删除主题观察者
	 * @param obs
	 */

	public void detach(Observer obs);
	/**
	 * 通知订阅主题状态的观察者
	 */
	public void weartherNotify();
	
	/**
	 * 设置主题的状态
	 * @param weatherState
	 */
	public void setWeatherState(String weatherState);
	/**
	 * 设置主题的状态
	 */
	public String getWeatherState();
}
