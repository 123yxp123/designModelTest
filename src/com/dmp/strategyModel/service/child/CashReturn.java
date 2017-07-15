package strategyModel.service.child;

import strategyModel.service.CashSuper;
/**
 * 满减策略类，根据满减规则，满300-100等规则算出需要多少资金
 * @author yxp
 *
 */
public class CashReturn extends CashSuper{
	private double moneyCondition = 0.00d;
	private double moneyReturn = 0.0d;
	public CashReturn(double moneyCondition, double moneyReturn){
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	@Override
	public double acceptCash(double money) {
		double result = money;
		if(money>moneyCondition){
			result = money - Math.floor(money/moneyCondition)*moneyReturn;
		}
		return result;
	}

}
