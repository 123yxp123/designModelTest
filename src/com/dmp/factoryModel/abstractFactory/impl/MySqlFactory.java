package factoryModel.abstractFactory.impl;

import factoryModel.abstractFactory.IDepartment;
import factoryModel.abstractFactory.IFactory;
import factoryModel.abstractFactory.IUser;
/**
 * 定义实现mysql工厂实现
 * @author bluntwu
 *
 */
public class MySqlFactory implements IFactory{

	@Override
	public IUser createUser() {
		return new MySqlUser();
	}

	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new MySqlDepartment();
	}

}
