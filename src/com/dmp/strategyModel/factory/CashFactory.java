package strategyModel.factory;

import strategyModel.service.CashSuper;
import strategyModel.service.child.CashNormal;
import strategyModel.service.child.CashRebate;
import strategyModel.service.child.CashReturn;

/**
 * 现金收取工厂
 * @author yxp
 *
 */
public class CashFactory {
	/**
	 * 
	 * @param type 折扣类型
	 * @return
	 */
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
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
		return cs;
	}
}
