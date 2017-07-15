package test.factoryModel;

public class Test {
	public static void main(String[] args) {
		A a1 = new A();  
        A a2 = new B();  
        B b = new B();  
        C c = new C();   
        D d = new D();   
        System.out.println(a1.show(b));  // ①  
        System.out.println(a1.show(c));  // ②  
        System.out.println(a1.show(d));  // ③  
        System.out.println(a2.show(b));  // ④  
        System.out.println(a2.show(c));  // ⑤  
        System.out.println(a2.show(d));  // ⑥  
        System.out.println(b.show(b));   // ⑦  
        System.out.println(b.show(c));   // ⑧  
        System.out.println(b.show(d));   // ⑨
	}
}
class A {  
    public String show(D obj){  
           return ("A and D");  
    }   
    public String show(A obj){  
           return ("A and A");  
    }   
}   
class B extends A{  
    public String show(B obj){  
           return ("B and B");  
    }  
    public String show(A obj){  
           return ("B and A");  
    }   
}  
class C extends B{}   
class D extends B{}