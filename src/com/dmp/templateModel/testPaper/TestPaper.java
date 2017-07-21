package templateModel.testPaper;
/**
 * 测试试题类(模板类)
 * 模板方法模式，通过把不变行为搬迁到超类，去除子类重复代码的优势，实现平台代码复用功能。
 * 抽象出需要实现的所有固定的方法testQuestion1，testQuestion2，可变方法答案，抽离出单独方法，子类重写方法进行实现。
 * 
 * 给予子类实例化父类对象调用
  	TestPaper tpA = new TestPaperA("小花");
		tpA.testTemplate();
	动态实现可变的方法内容
 * 
 * @author yxp
 *
 */
public class TestPaper {
	
	/**
	 * 只负责题目
	 */
	public void testQuestion1(){
		System.out.println("选择曹操所属时代：");
		System.out.println("A：三国");
		System.out.println("B：东汉");
		System.out.println("C：战国");
		System.out.println("D：春秋");
	}
	public void testQuestion2(){
		System.out.println("一下哪一个不是曹操的作品：");
		System.out.println("A：《观沧海》");
		System.out.println("B：《典略》");
		System.out.println("C：《让县自明本志令》");
		System.out.println("D：《龟虽寿》");
	}
	/**
	 * 将汇集题目和答案
	 */
	public void testQuestion3(){
		System.out.println("选择曹操所属时代：");
		System.out.println("A：三国");
		System.out.println("B：东汉");
		System.out.println("C：战国");
		System.out.println("D：春秋");
		System.out.println(name+"答案："+answer3());
	}
	public String answer3() {
		return "";
	}
	public void testQuestion4(){
		System.out.println("一下哪一个不是曹操的作品：");
		System.out.println("A：《观沧海》");
		System.out.println("B：《典略》");
		System.out.println("C：《让县自明本志令》");
		System.out.println("D：《龟虽寿》");
		System.out.println(name+"答案："+answer4());

	}
	public String answer4() {
		return "";
	}
	/**
	 * 模板抽象方法，将模板中所以的内容放到该方法中进行调用
	 */
	public void testTemplate(){
		testQuestion3();
		testQuestion4();
	}
	private String name;

	public TestPaper(String name){
		this.name =name;
	}
	public TestPaper(){}
}
