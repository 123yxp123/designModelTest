package factoryModel.abstractFactory.impl;

import utils.xmlUtil.XmlDom4jHandler;
import factoryModel.abstractFactory.IDepartment;
import factoryModel.abstractFactory.IUser;

/**
 * 简单工厂模式改进抽象工厂模式，去除Ifactory、SqlServerFactory、MySqlFactory工厂
 * @author yxp
 *
 */
public class DataAccess {
	static{
		XmlDom4jHandler.readDocument();
		XmlDom4jHandler.documentParser();
	}
	public final String DB = XmlDom4jHandler.getAdd("DB");
	
	public IUser createUser(){
		IUser iuser = null;
		switch(DB){
			case "MySql":
				iuser = new MySqlUser();
				break;
			case "SqlServer":
				iuser = new SqlServerUser();
				break;
			default:
				iuser = new MySqlUser();
		}
		return iuser;
	}
	public IDepartment createDepartment(){
		IDepartment iDepartment = null;
		switch(DB){
			case "MySql":
				iDepartment = new MySqlDepartment();
				break;
			case "SqlServer":
				iDepartment = new SqlServerDepartment();
				break;
			default :
				iDepartment = new MySqlDepartment();
		}
		return iDepartment;
	}
	String ASSEMBLYNAME = XmlDom4jHandler.getAdd("ASSEMBLYNAME");
	public IUser createUserReflected(){
		IUser iuser = null;
		String className = ASSEMBLYNAME + "."+DB+"User";
		try {
			iuser = (IUser)Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return iuser;
	}
}
