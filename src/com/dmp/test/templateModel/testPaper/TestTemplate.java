package test.templateModel.testPaper;

import templateModel.testPaper.TestPaper;
import templateModel.testPaper.TestPaperA;
import templateModel.testPaper.TestPaperB;

public class TestTemplate {
	public static void main(String[] args) {
		testTemplate1();
	}

	/**
	 * 抄写试题，每个人给出不同答案
	 */
	private static void test1() {
		TestPaper tpA = new TestPaperA("小花");
		tpA.testQuestion1();
		tpA.testQuestion2();
		TestPaper tpB = new TestPaperB("小羽");
		tpB.testQuestion1();
		tpB.testQuestion2();
	}
	/**
	 * 打印处试题。答题人只需要提交答题答案即可，不需要抄写题目
	 */
	private static void testTemplate1() {
		TestPaper tpA = new TestPaperA("小花");
		tpA.testTemplate();
		TestPaper tpB = new TestPaperB("小羽");
		tpB.testTemplate();
	}
}
