package prototypeModel.resume;
/**
 * 简历类，对象传值非参数传值
 * 原型模式：用原型实例指定创建对象的种类，并通过拷贝原型创建新的对象
 * 使用clone获得类的引用对象
 * @author yxp
 *
 */
public class ResumeNormal {
	private String name;
	private String age;
	private String sex;
	private String timeArea;
	private String company;
	public ResumeNormal(String name){
		this.name = name;
	}
	public void setPersonalInfo(String age,String sex){
		this.age = age;
		this.sex = sex;
	}
	public void setCompany(String timeArea,String company){
		this.timeArea = timeArea;
		this.company = company;
	}
	public void display(){
		System.out.println(name);
		System.out.println(age+" "+sex);
		System.out.println(timeArea+" "+company);
	}
}
