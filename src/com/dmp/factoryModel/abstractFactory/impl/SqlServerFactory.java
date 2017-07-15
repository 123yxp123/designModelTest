package factoryModel.abstractFactory.impl;

import factoryModel.abstractFactory.IDepartment;
import factoryModel.abstractFactory.IFactory;
import factoryModel.abstractFactory.IUser;

/**
 * 定义实现sqlserver工厂实现
 * @author yxp
 *
 */
public class SqlServerFactory implements IFactory{

	@Override
	public IUser createUser() {
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}
	
}
