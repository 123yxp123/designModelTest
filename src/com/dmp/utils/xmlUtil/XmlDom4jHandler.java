package utils.xmlUtil;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * dom4j
 * 操作xml文件格式数据，分别使用dom4j、sax、jsoup
 * @author yxp
 *
 */
public class XmlDom4jHandler {
	private static String filePath = XmlDom4jHandler.class.getClassLoader().getResource("").getPath()+"configure.xml";
	static Document doc = null;
	private static Map<String, Object> addMap = new HashMap<String, Object>();
	
	public static Document readDocument(){
		File file = new File(filePath);
		//读取xml文件，获取document对象
		SAXReader reader = new SAXReader();
		try {
			 doc = reader.read(file);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	public static void documentParser(){
		if(doc == null){
			return;
		}
		//获取根节点
		Element el = doc.getRootElement();
		Element a = el.element("appsettings");
		List<Element> addEls = a.elements("add");
		for (Element addEl : addEls) {
			Attribute key = addEl.attribute("key");
			Attribute value = addEl.attribute("value");
			if(key.getValue()!=null&&addMap.get(key.getValue())==null){
				addMap.put(key.getValue(), value.getValue());
			}

		}
		
		
	}
	
	public static String getAdd(String key){
		String value = null;
		value = (String) addMap.get(key);
		return value!=null?value:"";
	}
}
