package test.observerModel.weatherForecast;

import observerModel.weatherForecast.MeteorologicalSubject;
import observerModel.weatherForecast.Subject;
import observerModel.weatherForecast.WeatherStationsObserver;
/**
 * weatherState
 * @author yxp
 *
 */
public class TestObserverModel {
	public static void main(String[] args) {
		test1();
	}
	/**
	 * client
	 */
	public static void test1(){
		Subject nba_sub = new MeteorologicalSubject();
		nba_sub.attach(new WeatherStationsObserver(nba_sub,"河北气象局"));
		nba_sub.attach(new WeatherStationsObserver(nba_sub,"广西气象局"));
		nba_sub.attach(new WeatherStationsObserver(nba_sub,"河南气象局"));
		nba_sub.attach(new WeatherStationsObserver(nba_sub,"腾讯天气视图"));
		nba_sub.attach(new WeatherStationsObserver(nba_sub,"百度天气视图"));
		//当前气温发生变化
		nba_sub.setWeatherState("多云转阴，气温28~30");
		//给订阅者发送通知
		nba_sub.weartherNotify();
	}
}
