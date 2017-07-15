package factoryModel.abstractFactory;

import factoryModel.abstractFactory.model.Department;


public interface IDepartment {
	public void insert(Department department);
	public Department getDepartment(int id);
}
