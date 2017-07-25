package observerModel.weatherForecast;
/**
 * 观察者抽象类
 * @author yxp
 *
 */
public abstract class Observer {
	/**
	 * 得知天气又变化，将气象数据进行变更处理
	 */
	public abstract void changeWeatherData();
}
