package test.factoryModel.abstractFactory;

import factoryModel.abstractFactory.IDepartment;
import factoryModel.abstractFactory.IFactory;
import factoryModel.abstractFactory.IUser;
import factoryModel.abstractFactory.impl.DataAccess;
import factoryModel.abstractFactory.impl.MySqlFactory;
import factoryModel.abstractFactory.impl.MySqlUser;
import factoryModel.abstractFactory.impl.SqlServerFactory;
import factoryModel.abstractFactory.impl.SqlServerUser;
import factoryModel.abstractFactory.model.Department;
import factoryModel.abstractFactory.model.User;

public class TestAbstractFactory {
	public static void main(String[] args) {
		test5();
	}
	
	public static void test1(){
		String db = "MySql";
		IUser iuser = null;
		User user = new User();
		switch(db){
			case "MySql":
				iuser = new MySqlUser(); 
				break;
			case "SqlServer":
				iuser = new SqlServerUser();
				break;
			default:
				iuser = new MySqlUser(); 
		}
		iuser.insert(user);
		iuser.getUser(1);
	}
	
	public static void test2(){
		String db = "MySql";
		IFactory ifactory = null; 
		User user = new User();
		switch(db){
			case "MySql":
				ifactory = new MySqlFactory(); 
				break;
			case "SqlServer":
				ifactory = new SqlServerFactory();
				break;
			default:
				ifactory = new MySqlFactory();
		}
		IUser iuser = ifactory.createUser();
		iuser.insert(user);
		iuser.getUser(1);
	}
	
	public static void test3(){
		DataAccess dataAccess = new DataAccess();
		User user = new User();
		IUser iuser = dataAccess.createUser();
		iuser.insert(user);
		iuser.getUser(1);
	}
	public static void test4(){
		DataAccess dataAccess = new DataAccess();
		User user = new User();
		IUser iuser = dataAccess.createUser();
		iuser.insert(user);
		iuser.getUser(1);
		Department department = new Department();
		IDepartment iDepartment = dataAccess.createDepartment();
		iDepartment.insert(department);
		iDepartment.getDepartment(2);
	}
	public static void test5(){
		DataAccess dataAccess = new DataAccess();
		User user = new User();
		IUser iuser = dataAccess.createUserReflected();
		if(iuser!=null){
			iuser.insert(user);
			iuser.getUser(1);
		}
	}
}
