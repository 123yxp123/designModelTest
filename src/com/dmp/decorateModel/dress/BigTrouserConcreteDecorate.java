package decorateModel.dress;
/**
 * 具体服饰实现大裤衩类（具体装饰实现类）
 * @author yxp
 *
 */
public class BigTrouserConcreteDecorate extends FineryDecorate{
	@Override
	public void show() {
		//添加自有属性
		System.out.println("穿上大裤衩");
		//调用父类显示属性
		super.show();
	}
}
