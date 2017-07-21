package facadeModel.shares;
/**
 * 基金类（外观类）
 * 股票，证券，国债相当于子系统
 * 用于聚合股票，证券，国债，股民只需要购买基金，基金管理人员会选择多种股票等进行购买，，股民不需要去单独购买股票，还需要了解行业动态。对于新股民来说基金是较好的选择
 * 聚合关系：aggregation表示一种弱的“拥有”关系，A对象（基金）可以包含B（股票，证券等），但是B对象不是A对象的一部分。class A{private B[] b;},使用空心菱形+实线箭头表示
 * 
 * 外观模式（常用的一个设计模式）
 * 指为系统中的一组接口提供一个一致页面，此模式定义一个高层接口，使得这一子系统更加容易使用
 * 基金类（外观类）
 * 股票，证券，国债相当于子系统，子系统中没有任何跟外观类关联的内容
 * 用途：
 * 设计阶段，三层原则
 * 开发阶段，子系统会在不断迭代中完成，需要考虑使用外观模式
 * 维护遗留系统，修改和维护非常困难，新的需求又必须依赖于它，那么使用外观模式，为新系统提供一个外观类，来提供设计粗糙
 * 或者高复杂的遗留代码调用接口，使得新系统与外观类对象交互，外观类与遗留代码系统校核复杂过程。
 * 、	
 * @author yxp
 *
 */
public class Fund {
	private NationalDebt nationalDebt;
	private NegotiableS negotiableS;
	private Stock1 stock1;
	private Stock2 stock2;
	public Fund(){
		nationalDebt = new NationalDebt();
		negotiableS = new NegotiableS();
		stock1 = new Stock1();
		stock2 = new Stock2();
	}
	
	public void buy(){
		nationalDebt.buy();
		negotiableS.buy();
		stock1.buy();
		stock2.buy();
	}
	public void sell(){
		nationalDebt.sell();
		negotiableS.sell();
		stock1.sell();
		stock2.sell();
	}
}
