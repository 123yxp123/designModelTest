package decorateModel.dress;
/**
 * 具体服饰实现休闲鞋类（具体装饰实现类）
 * @author yxp
 *
 */
public class CasualShoesConcreteDecorate extends FineryDecorate{
	@Override
	public void show() {
		//添加自有属性
		System.out.println("穿上休闲鞋");
		//调用父类显示属性
		super.show();
	}
}
