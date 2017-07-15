package decorateModel.dress;
/**
 * 服饰类（装饰抽象类）
 * 如果只有
 * @author yxp
 *
 */
abstract class FineryDecorate extends PersonConcreteComponent{
	protected PersonConcreteComponent personCompent;
	/**
	 * 装饰方法
	 * @param personCompent
	 */
	public void decorate(PersonConcreteComponent personCompent){
		this.personCompent = personCompent;
	}
	
	/**
	 * 展示最终打扮后的效果
	 */
	public void show(){
		System.out.println("装饰类");
		if(personCompent != null){
			//调用混合构建类展示方法
			personCompent.show();
		}
	}

}
