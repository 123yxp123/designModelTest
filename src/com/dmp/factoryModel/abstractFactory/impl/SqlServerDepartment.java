package factoryModel.abstractFactory.impl;

import factoryModel.abstractFactory.IDepartment;
import factoryModel.abstractFactory.model.Department;

public class SqlServerDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("添加SqlServer库department信息");
		
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("查看SqlServer库department信息");
		return null;
	}
	
}
