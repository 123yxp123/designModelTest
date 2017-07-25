package observerModel.weatherForecast;
/**
 * 气象站观察者
 * @author yxp
 *
 */
public class WeatherStationsObserver extends Observer{
	private String name;//观察者名称
	private Subject sub;//主题接口
	/**
	 * 初始设置订阅气象变更信息的信息
	 * @param sub
	 * @param name
	 */
	public WeatherStationsObserver(Subject sub,String name){
		this.name = name;
		this.sub = sub;
	}
	@Override
	public void changeWeatherData() {
		System.out.println("最新气象："+sub.getWeatherState());
		System.out.println(name+"，此时将更改气象显示信息");
		System.out.println();
	}
	
}
