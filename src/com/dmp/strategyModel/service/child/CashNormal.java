package strategyModel.service.child;

import strategyModel.service.CashSuper;
/**
 * 原价策略类，按照实际值收取费用，及传入的费用值
 * @author yxp
 *
 */
public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
