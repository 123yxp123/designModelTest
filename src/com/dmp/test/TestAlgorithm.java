package test;

public class TestAlgorithm {
	public static void main(String[] args) {
		int sum = add(5);
		System.out.println("sum:"+sum);
		int sum2 = add2(5);
		System.out.println(sum2);
	}
	public static int add(int a){
		System.out.println("a="+a);
		if(a==1){
			return 1;
		}
		return a+add(a-1);
	}
	public static int add2(int a){
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			System.out.println("i="+i);
			sum+=i;
		}
		return sum;
	}
}
