package strategyModel.strategy;

import strategyModel.service.CashSuper;
import strategyModel.service.child.CashNormal;
import strategyModel.service.child.CashRebate;
import strategyModel.service.child.CashReturn;

/**
 * 设置所有可供选择的算法策略，管理上下文的算法入口
 * @author yxp
 *
 */
public class CashContext {
	private CashSuper cs;
	public CashContext(String type){
		switch(type){
			case "normal":
				cs = new CashNormal();
				break;
			case "rebate":
				cs = new CashRebate(0.8d);
				break;
			case "return":
				cs = new CashReturn(300d,100d);
				break;
		}
	}
	
	public double getCash(double money){
		return cs.acceptCash(money);
	}
}
