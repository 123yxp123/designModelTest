package factoryModel.abstractFactory;
/**
 * 定义开放的抽象工厂
 * @author yxp
 *
 */
public interface IFactory {
	//访问user的工厂Iuser
	IUser createUser();
	IDepartment createDepartment();
	//可以定义开放其他的工厂
	
}
