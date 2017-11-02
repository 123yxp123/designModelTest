package test.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
	private static List<Integer>  integerList = new ArrayList<Integer>();
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
			testRandrom(5,10);
		}
		for (Integer i: integerList) {
			System.out.println(i);
		}
		
		System.out.println("testRandrom2");
		integerList = new ArrayList<Integer>();
		testRandrom1(5,10);
		for (Integer i: integerList) {
			System.out.println(i);
		}
	}
	/**
	 * 在1-10直接获取5个随机不相等的整数
	 */
	public static void testRandrom(int m,int n){
		Random r = new Random();
		int value = r.nextInt(n);
		if(integerList.contains(value)){
			integerList.add(n);
		}else{
			integerList.add(value);
		}
	}
	/**
	 * 在1-10直接获取5个随机不相等的整数
	 */
	public static List<Integer> testRandrom1(int m,int n){
		Random r = new Random();
		int value = r.nextInt(n);
		if(m==0){
			return integerList;
		}else{
			integerList = testRandrom1(m-1,n-1);
			if(integerList.contains(value)){
				System.out.println("n="+n);
				integerList.add(n);
			}else{
				System.out.println("m="+m);
				System.out.println("n="+n);
				System.out.println("value="+value);
				integerList.add(value);
			}
		}
		return integerList;
	}
}
