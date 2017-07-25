package test.observerModel.bossStatus;

import observerModel.bossStatus.NBAObserver;
import observerModel.bossStatus.NBASubject;
import observerModel.bossStatus.StockObserver;
import observerModel.bossStatus.StockSubject;
import observerModel.bossStatus.Subject;
/**
 * bossState
 * @author yxp
 *
 */
public class TestObserverModel {
	public static void main(String[] args) {
		test1();
	}
	public static void test1(){
		Subject nba_sub = new NBASubject();
		nba_sub.attach(new NBAObserver("中国队球迷", nba_sub));
		nba_sub.attach(new NBAObserver("荷兰队球迷", nba_sub));
		nba_sub.attach(new NBAObserver("切尔西队球迷", nba_sub));
		nba_sub.setSubjectState("老板回来了！");
		nba_sub.notifyInfo();
		Subject stock_sub = new StockSubject();
		stock_sub.attach(new StockObserver("微信理财会员", stock_sub));
		stock_sub.attach(new StockObserver("蚂蚁金服会员", stock_sub));
		stock_sub.setSubjectState("老板又回来了！");	
		stock_sub.notifyInfo();
	}
}
