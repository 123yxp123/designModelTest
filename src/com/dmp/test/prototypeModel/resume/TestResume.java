package test.prototypeModel.resume;

import prototypeModel.resume.ResumeNormal;
import prototypeModel.resume.ResumePrototypeDeepCopy;
import prototypeModel.resume.ResumePrototypeShallowCopy;

public class TestResume {
	public static void main(String[] args) {
		resumePrototypeDeepCopy();
	}

	/**
	 * 必须重新实例化对象，获得新引用
	 */
	private static void resumeNormal() {
		ResumeNormal rna =  new ResumeNormal("小花");
		rna.setPersonalInfo("23", "女");
		rna.setCompany("2014-9~2015-4", "北京");
		rna.display();
		rna =  new ResumeNormal("小花");
		rna.setPersonalInfo("23", "女");
		rna.setCompany("2015-9~2016-4", "广西");
		rna.display();
		
	}
	/**
	 * 使用原型clone方式创建对象
	 * 浅克隆 会引起引用对象，值传递只会实例化为最后一次的结果
	 */
	private static void resumePrototypeShallowCopy() {
		ResumePrototypeShallowCopy rna =  new ResumePrototypeShallowCopy("小花");
		rna.setPersonalInfo("23", "女");
		rna.setCompany("2014-9~2015-4", "北京");
		ResumePrototypeShallowCopy rnb;
		try {
			rnb = (ResumePrototypeShallowCopy) rna.clone();
			rnb.setCompany("2015-9~2016-4", "广西");
			rna.display();
			rnb.display();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 使用原型clone方式创建对象
	 */
	private static void resumePrototypeDeepCopy() {
		ResumePrototypeDeepCopy rna =  new ResumePrototypeDeepCopy("小花");
		rna.setPersonalInfo("23", "女");
		rna.setCompany("2014-9~2015-4", "北京");
		ResumePrototypeDeepCopy rnb;
		try {
			rnb = (ResumePrototypeDeepCopy) rna.clone();
			rnb.setCompany("2015-9~2016-4", "广西");
			rna.display();
			rnb.display();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
