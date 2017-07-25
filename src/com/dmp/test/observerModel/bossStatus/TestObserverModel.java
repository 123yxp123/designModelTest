package test.observerModel.bossStatus;

import observerModel.bossStatus.NBAObserver;
import observerModel.bossStatus.NBASubject;
import observerModel.bossStatus.StockObserver;
import observerModel.bossStatus.Subject;

public class TestObserverModel {
	public static void main(String[] args) {
		test1();
	}
	public static void test1(){
		Subject nba_sub = new NBASubject();
		nba_sub.attach(new NBAObserver("中国队", nba_sub));
		nba_sub.attach(new NBAObserver("荷兰队", nba_sub));
		nba_sub.attach(new NBAObserver("切尔西队", nba_sub));
		nba_sub.setSubjectState("老板回来了！");
		nba_sub.notifyInfo();
		Subject stock_sub = new NBASubject();
		stock_sub.attach(new StockObserver("陆金所", stock_sub));
		stock_sub.attach(new StockObserver("蚂蚁金服", stock_sub));
		stock_sub.setSubjectState("老板又回来了！");	
		stock_sub.notifyInfo();
	}
}
