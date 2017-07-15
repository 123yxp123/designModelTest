package factoryModel.abstractFactory;

import factoryModel.abstractFactory.model.User;

/**
 * 简单工厂模式，定义工厂对象方法接口
 * @author yxp
 *
 */
public interface IUser {
	public void insert(User user);
	public User getUser(int id);
}
