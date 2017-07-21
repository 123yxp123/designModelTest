package templateModel.testPaper;
/**
 * 测试模板实现类A
 * 使用模板的方式，考生只需要调用答案方法提交答案即可。
 * @author yxp
 *
 */
public class TestPaperA extends TestPaper{
	public void testQuestion1(){
		super.testQuestion1();
		System.out.println(name+"答案：A");
	}
	public void testQuestion2(){
		super.testQuestion2();
		System.out.println(name+"答案：B");
	}
	/**
	 * 实现答案方法
	 */
	public String answer3() {
		return "A";
	}
	
	public String answer4() {
		return "B";
	}
	public TestPaperA(String name){
		super(name);
		this.name = name;
	}
	private String name;
}
