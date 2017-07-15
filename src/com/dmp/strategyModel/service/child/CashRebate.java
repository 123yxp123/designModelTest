package strategyModel.service.child;

import strategyModel.service.CashSuper;
/**
 * 打折策略类，按照折扣进行打折返回要收取的费用
 * @author yxp
 *
 */
public class CashRebate extends CashSuper{
	private double moneyRebate = -1d;
	public CashRebate(double moneyRebate){
		this.moneyRebate = moneyRebate;
	}
	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
