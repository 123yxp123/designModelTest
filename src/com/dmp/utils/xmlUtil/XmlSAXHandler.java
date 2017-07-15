package utils.xmlUtil;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * ASX
 * 操作xml文件格式数据，分别使用dom4j、sax、jsoup
 * @author yxp
 *
 */
public class XmlSAXHandler extends DefaultHandler{
	private static String filePath = XmlSAXHandler.class.getClassLoader().getResource("").getPath()+"configure.xml";
	private static SAXParser saxp = null;
	private  static Map<String, Object> tags = new HashMap<String, Object>();
	 public XmlSAXHandler() {   
		 super(); 
	 }
	public static void readDocument(){
		//获取文件目录
		System.out.println(filePath);
		SAXParserFactory saxpf = SAXParserFactory.newInstance();
		try {
			if(saxp == null){
				SAXParser saxp = saxpf.newSAXParser();
				saxp.parse(new File(filePath), new XmlSAXHandler());
			}
			for(String key :tags.keySet()){
				System.out.println(key);
				Attributes a = (Attributes) tags.get("DB");
				System.out.println(a.getValue("DB"));
			}
		} catch (ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Object getProperties(String name){
		Object value = null;
		/*try {
			value = saxp.getProperty(name);
		} catch (SAXNotRecognizedException | SAXNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return value;
	}
	public void startElement(String uri,
            String localName,
            String qName,
            Attributes attributes)
     throws SAXException{
		System.out.println(qName);
		System.out.println(attributes.getValue(0));
		tags.put(qName,attributes);  
	}
	public void characters(char[] ch,
            int start,
            int length)
     throws SAXException{
		System.out.print("车牌号码：" + new String(ch, start, length));   
	}
}
