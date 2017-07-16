package prototypeModel.resume;
/**
 * 使用clone实现对象引用
 * 浅复制，对普通类型可以实现克隆对象，但对于引用类型不可以进行克隆
 * 显示Cloneable接口，重写Object.clone(),使用super.clone()返回对象
 * 浅克隆 会引起引用对象，值传递只会实例化为最后一次的结果
 * @author yxp
 *
 */
public class ResumePrototypeShallowCopy implements Cloneable{
	private String name;
	private String age;
	private String sex;
//	private String timeArea;
//	private String company;
	private WorkExperience we;
	public ResumePrototypeShallowCopy(String name){
		this.name = name;
		we = new WorkExperience();
	}
	public void setPersonalInfo(String age,String sex){
		this.age = age;
		this.sex = sex;
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
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
