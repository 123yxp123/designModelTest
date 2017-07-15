package test.util.xmlUtil;

import utils.xmlUtil.XmlDom4jHandler;

public class TestXml {
	public static void main(String[] args) {
		XmlDom4jHandler.readDocument();
		XmlDom4jHandler.documentParser();
		String value = XmlDom4jHandler.getAdd("DB");
		System.out.println("value="+value);
	}
}
