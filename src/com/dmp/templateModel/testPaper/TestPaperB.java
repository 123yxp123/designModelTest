package templateModel.testPaper;
/**
 * 测试模板实现类B
 * @author yxp
 *
 */
public class TestPaperB extends TestPaper{
	public void testQuestion1(){
		super.testQuestion1();
		System.out.println(name+"答案：A");
	}
	public void testQuestion2(){
		super.testQuestion2();
		System.out.println(name+"答案：C");
	}
	/**
	 * 实现答案方法
	 */
	public String answer3() {
		return "A";
	}
	
	public String answer4() {
		return "C";
	}
	public TestPaperB(String name){
		super(name);
		this.name =name;
	}
	private String name;
}
