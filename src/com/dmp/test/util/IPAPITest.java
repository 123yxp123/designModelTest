package test.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IPAPITest {
	public static void main(String[] args) {
		String httpUrl = "http://apis.baidu.com/netpopo/ip/ip";
		String httpArg = "ip=122.224.186.100";
//		String httpUrl = "http://freeapi.ipip.net/";
//		String httpArg = "ip=122.224.186.100";
//		String httpUrl="http://asnmap.com/ipv4/58.243.1.105";
//		String httpArg = "";
		String jsonResult = request(httpUrl, httpArg);
		System.out.println(jsonResult);

	}
	/**
	 * @param urlAll
	 *            :请求接口
	 * @param httpArg
	 *            :参数
	 * @return 返回结果
	 */
	public static String request(String httpUrl, String httpArg) {
	    BufferedReader reader = null;
	    String result = null;
	    StringBuffer sbf = new StringBuffer();
	    httpUrl = httpUrl + "?" + httpArg;

	    try {
	        URL url = new URL(httpUrl);
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        connection.setRequestMethod("GET");
	        // 填入apikey到HTTP header
	        connection.setRequestProperty("apikey",  "d81c3088e723daab0ee7908b6772aba2");
	        connection.connect();
	        InputStream is = connection.getInputStream();
	        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        String strRead = null;
	        while ((strRead = reader.readLine()) != null) {
	            sbf.append(strRead);
	            sbf.append("\r\n");
	        }
	        reader.close();
	        result = sbf.toString();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}

}
