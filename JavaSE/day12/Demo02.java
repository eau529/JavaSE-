/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day12;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * 变量以及方法    的隐藏和覆盖（重写）
		 * 
		 * 	 隐藏： 指的是子类隐藏了父类的变量和方法后，
		 * 		     那么子类就不能够访问到已经被隐藏的方法和变量，
		 * 		     但是，当将子类转换成父类（向上造型）后，
		 * 		      可以访问到父类被隐藏的变量和方法
		 * 
		 * 	 覆盖（重写）： 
		 * 			指的是子类覆盖了父类的变量和方法后，
		 * 			那么子类就不能够访问到已经被 覆盖的方法和变量，
		 * 			同时，将子类转成父类型变量后，
		 * 			依然访问不到父类被覆盖的变量的方法
		 * 
		 * 	在java中方法和变量的  隐藏以及覆盖原则：
		 * 		1、在java中， 实例变量，静态变量，静态方法 都只能被隐藏
		 * 		2、 实例方法是被覆盖的
		 * 
		 * 
		 * 		注意： 1、 静态方法不存在重写
		 * 			  2、  不能用子类的静态方法  去  隐藏 父类的实例方法  
		 * 			  3、   不能用子类的实例方法 去  覆盖  父类的静态方法
		 */
		
		SonClass son=new SonClass();
		System.out.println(son.field);
		System.out.println(son.staticField);
		son.test();
		System.out.println("----------------------------------");
		
		SuperClass sc=new SonClass();
		System.out.println(sc.field);
		System.out.println(sc.staticField);
		sc.test();
	}
}
class SuperClass{
	public String staticField="父类静态变量";
	public String field="我是父类变量";
	public static void test() {
		System.out.println("SuperClass.test()");
	}
	
	public void metod1() {
		System.out.println("SuperClass.metod1()");
	}
	
	public static void metod2() {
		System.out.println("SuperClass.metod2()");
	}
}
class SonClass extends SuperClass{
	public String staticField="子类类静态变量";
	public String field="我是子类变量";
	public static void test() {
		System.out.println("SonClass.test()");
	}
	
//	public static void metod1() {
//		System.out.println("SuperClass.metod1()");
//	}
//	
//	public void metod2() {
//		System.out.println("SuperClass.metod1()");
//	}
	
}



