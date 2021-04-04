/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day12;

public class Demo03 {
	public static void main(String[] args) {
		Super sup=new Sub();
		Goo goo=new Goo();
		goo.gooMethod(sup); // Sub.method()
	}
}
class Super{
	public void method() {
		System.out.println("Super.method()");
	}
}
class Sub extends Super{
	public void method() {
		System.out.println("Sub.method()");
	}
}
class Goo{
	public void gooMethod(Super sup) {
		System.out.println("Goo.gooMethod(Super sup) ");
		sup.method();
	}
	public void gooMethod(Sub sub) {
		System.out.println("Goo.gooMethod(Sub sub) ");
		sub.method();
	}
}


