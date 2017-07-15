package factoryModel.abstractFactory.impl;

import factoryModel.abstractFactory.IUser;
import factoryModel.abstractFactory.model.User;

public class SqlServerUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("添加SqlServer库User");
		
	}

	@Override
	public User getUser(int id) {
		System.out.println("获得SqlServer库User");
		return null;
	}

}
