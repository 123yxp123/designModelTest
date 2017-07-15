package decorateModel.dress;
/**
 * 具体服饰实现T恤类（具体装饰实现类）
 * @author bluntwu
 *
 */
public class TShirtsConcreteDecorate extends FineryDecorate{
	@Override
	public void show() {
		//添加自有属性
		System.out.println("穿上T恤");
		//调用父类显示属性
		super.show();
	}
}
