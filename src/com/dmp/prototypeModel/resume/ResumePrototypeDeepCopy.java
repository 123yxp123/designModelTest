package prototypeModel.resume;
/**
 * 使用clone实现对象引用
 * 深复制，需要克隆引用类型
 * 显示Cloneable接口，重写Object.clone(),使用super.clone()返回对象
 * @author yxp
 *
 */
public class ResumePrototypeDeepCopy implements Cloneable{
	private String name;
	private String age;
	private String sex;
	private WorkExperience we;
	public ResumePrototypeDeepCopy(String name){
		this.name = name;
		we = new WorkExperience();
	}
	
	public void setPersonalInfo(String age,String sex){
		this.age = age;
		this.sex = sex;
	}
	/**
	 * 克隆
	 * @param timeArea
	 * @param company
	 * @throws CloneNotSupportedException 
	 */
	public ResumePrototypeDeepCopy(WorkExperience we) throws CloneNotSupportedException{
		//this表示当前对象
		this.we = (WorkExperience) we.clone();
	}
	public void setCompany(String timeArea,String company){
		this.we.setTimeArea(timeArea);
		this.we.setCompany(company);
	}
	public void display(){
		System.out.println(name);
		System.out.println(age+" "+sex);
		System.out.println(this.we.getTimeArea()+" "+this.we.getCompany());
	}
	/**
	 * 深复制 返回复制后的对象
	 */
	public Object clone() throws CloneNotSupportedException{
		ResumePrototypeDeepCopy rp = new ResumePrototypeDeepCopy(this.we) ;
		rp.name = name;
		rp.age = age;
		rp.sex = sex;
		return rp;
	}
}
