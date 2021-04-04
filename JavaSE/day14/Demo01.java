/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day14;

/**  
 *在jdk1.8 以后，  接口中还以允许有以下两种方法存在方法体
 *		1、静态方法
 *			使用规则： 
 *			     （1）、由于java中是可以实现多个接口的，
 *				如果在两个接口中出现了同名同参数列表的静态方法，
 *				此时通过   子类.静态方法名   进行方法调用时，
 *				程序将不知道访问哪个方法， 所以允许此种方式调用父接口中的方法
 *			
 *				只允许通过    父接口名.方法名   调用
 *
 *				(2)  子类也不能去重写父接口的方法
 *
 *		2、默认方法（被default关键字修饰的方法）
 *			 	使用规则：
 *				（1）因为java中子类可以实现多个接口， 
 *					如果在两个父接口中 存在同名同参数列表的方法， 
 *					那么子类在继承 父接口的方法时，将不知道继承哪一个，
 *					所以编译器要 我们重写父接口的default ， 
 *					并且重写时，子类中的方法需要去除  default关键字
 *					
 */
public class Demo01 implements MyInterface1,MyInterface2 {
	static void method1() {
		System.out.println("MyInterface1.method1()");
	}
	
	public void defaultMethod2() {
		//调用父接口中的方法
		MyInterface1.super.defaultMethod2();
//		System.out.println("Demo01.defaultMethod2()");
	
	}
	
	public static void main(String[] args) {
		MyInterface1 mf=new Demo01();
		MyInterface1.method1();
	}

	
}
interface MyInterface1{
	
	public default void defaultMethod2() {
		System.out.println("MyInterface1.defaultmethod2() ");
	}
	
	static void method1() {
		System.out.println("MyInterface1.method1()");
	}
}
interface MyInterface2{
	static void method1() {
		System.out.println("MyInterface1.method1()");
	}

	public default void defaultMethod2() {
		System.out.println("MyInterface2.defaultmethod2() ");
	}
}
