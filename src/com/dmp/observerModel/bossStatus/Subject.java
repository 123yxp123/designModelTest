package observerModel.bossStatus;
/**
 * 主题抽象接口，通知者类
 * 主动发现自身变化，给予订阅了该主题的观察者下发处理问题通知
 * @author yxp
 *
 */
public interface Subject {
	public void attach(Observer obs);//附加
	public void detach(Observer obs);//分离
	public void notifyInfo();//通知
	public String getSubjectState();//状态
	public void setSubjectState(String subjectState);//状态
}
