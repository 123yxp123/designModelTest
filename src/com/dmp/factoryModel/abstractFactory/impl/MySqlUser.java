package factoryModel.abstractFactory.impl;

import factoryModel.abstractFactory.IUser;
import factoryModel.abstractFactory.model.User;

public class MySqlUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("添加mysql库user");
		
	}

	@Override
	public User getUser(int id) {
		System.out.println("查找mysql库user");
		return null;
	}

}
