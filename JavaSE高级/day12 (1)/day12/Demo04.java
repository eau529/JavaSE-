/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day12;

/*
 * 方法的执行顺序： 
 * 		对象执行方法时顺序： 
 * 			1 、 先从子类本类中找方法  sub(Object obj)
 * 			2、子类未找到，去父类中寻找，  super(Object obj)
 * 			3、如果父类中也未找到，回到子类找方法参数为父类型的， sub((super)obj)
 * 			4、 如果子还是未找到，则去父类中找方法参数为父类型的  super((super)obj)
 */
public class Demo04 {
	public static void main(String[] args) {
		A a1 = new A();
		
		A a2 = new B();
		
		B b  = new B();
		C c  = new C(); 
		D d  = new D(); 
		System.out.println(a1.show(b));//  a and a 
		System.out.println(a1.show(c)); // a and a 
		System.out.println(a1.show(d)); // A and D
		System.out.println(a2.show(b)); // B and A
		
	
		System.out.println(a2.show(c));   
		System.out.println(a2.show(d));   
		System.out.println(b.show(b));    
		System.out.println(b.show(c));    
		System.out.println(b.show(d));      
	}
}
class A {
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}
}

class B extends A {
	public String show(B obj) {
		return ("B and B");
	}

	public String show(A obj) {
		return ("B and A");
	}
}
class C extends B {
}

class D extends B {
}