package observerModel.weatherForecast;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象主题
 * @author yxp
 *
 */
public class MeteorologicalSubject implements Subject{

	private List<Observer> observer = new ArrayList<Observer>();//主题的观察者列表
	private String weatherState;
	@Override
	public void attach(Observer obs) {
		observer.add(obs);
	}

	@Override
	public void detach(Observer obs) {
		observer.remove(obs);
	}

	@Override
	public void weartherNotify() {
		for (Observer obs : observer) {
			obs.changeWeatherData();
		}
	}

	@Override
	public void setWeatherState(String weatherState) {
//		System.out.println("最新气象："+weatherState);
		this.weatherState  = weatherState;
	}

	@Override
	public String getWeatherState() {
		return this.weatherState;
	}

}
