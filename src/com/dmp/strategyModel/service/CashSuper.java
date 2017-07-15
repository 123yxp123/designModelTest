package strategyModel.service;
/**
 * 资金抽象策略超类
 * @author yxp
 *
 */
abstract public class CashSuper {
	//参数为收了多少钱,返回实际要收取的资金数
	public abstract double acceptCash(double money);
}
