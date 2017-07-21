package builderModel.game;
/**
 * 游戏任务建造者类
 * 包含人物的组成构件部分
 * 建造者模式
 * 当创建复杂对象的算法应该独立于该对象的组成部分，以及它们的装配方式时适用的模式
 * 
 * 建造者模式主要运用于构造一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象内部的构建通常面临这复杂的编号。
 * 好处是是的构建代码与表示代码分离，由于建造者隐藏了该产品是如何组装改变的，所以如果需要改变一个产品的内部标识，只需要再定义一个建造者即可。
 * 
 * 
 * 建造者模式，有以下角色
 * 1、builder：为创建一个产品对象的各个部件指定抽象接口
 * 2、concreteBuilder：实现builder的接口构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口
 * 3、director：构造一个实验builder接口的对象
 * 4、produce：表示被构造的复杂对象，concreteBuilder创建该产品的内部表示并定义它的装配过程，包含定义组件部件的类，包括将这个部件装配陈最终产品接口
 * 
 * @author yxp
 *
 */
public interface GamePersonBuilder {
	/**
	 * 组成产品的部件1
	 */
	public void concreateBulderFace();
	/**
	 * 组成产品的部件2
	 */
	public void concreateBulderFoot();
	
	/**
	 * 组成产品的部件3
	 */
	public void concreateBulderHand();
	/**
	 * 返回一个产品对象
	 */
	public GamePerson giveGamePersonPart();
}
