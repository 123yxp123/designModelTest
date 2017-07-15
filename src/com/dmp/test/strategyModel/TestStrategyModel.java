package test.strategyModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import strategyModel.factory.CashFactory;
import strategyModel.service.CashSuper;
import strategyModel.strategy.CashContext;

public class TestStrategyModel {
	static double total = 0d;//总共价格
	static double cashPrices = 0d;//单品价格
	static Map<String, Double> memuList = new HashMap<String, Double>();
	
	public static void main(String[] arg){
		memuList.put("apple", 300d);
		memuList.put("writer", 5d);
		memuList.put("cabbager", 5d);
		factory();
	}
	/**
	 * 使用工厂方式实现
	 */
	public static void factory(){
		Set<String> keys = memuList.keySet();
		for(String key : keys){
			double money = memuList.get(key);
			total += money;
		}
		CashSuper cs = CashFactory.createCashAccept("normal");
		cashPrices = cs.acceptCash(total);
		System.out.println("正常总价格"+cashPrices);
		CashSuper cs_rebate = CashFactory.createCashAccept("rebate");
		cashPrices = cs_rebate.acceptCash(total);
		System.out.println("折扣价格"+cashPrices);
		CashSuper cs_return = CashFactory.createCashAccept("return");
		cashPrices = cs_return.acceptCash(total);
		System.out.println("满减价格"+cashPrices);
	}
	/**
	 * 策略加工厂
	 */
	public static void strategy(){
		CashContext cs = new CashContext("normal");
		cashPrices = cs.getCash(total);
		System.out.println("正常总价格"+cashPrices);
		CashContext cs_rebate = new CashContext("rebate");
		cashPrices = cs_rebate.getCash(total);
		System.out.println("折扣价格"+cashPrices);
		CashContext cs_return = new CashContext("return");
		cashPrices = cs_return.getCash(total);
		System.out.println("满减价格"+cashPrices);
	}
}
