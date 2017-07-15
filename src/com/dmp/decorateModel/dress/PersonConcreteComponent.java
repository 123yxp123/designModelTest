package decorateModel.dress;
/**
 * 具体构件类，穿衣打扮对象：人
 * 如果只有一个具体构件类的化，那么可以直接把这个类当成是构件类，无需单独设置一个抽象的构件类，其装饰类可以是其子类
 * ，同样，如果只有一个装饰实现类的化，没有必要创建一个装饰抽象类，可直接把混合构件类和装饰类合并
 * 
 * 注意：在父类（基类）中定义了有参构造方法，那么在其子类中就必须要构件一个子类的有参构造方法可以super()调用实现父类的有参构成方法。
 * 如果在父类中定义一个无参构造方法，那么子类就可以不实现父类的带参构造方法了。
 * @author yxp
 *
 */
public class PersonConcreteComponent {
	private String name;//打扮的人名
	public PersonConcreteComponent(){}
	public PersonConcreteComponent(String name){
		this.name = name;
	}
	/**
	 * 展示最终打扮后的效果
	 */
	public void show(){
		System.out.println(name+"完成打扮");
	}
}
