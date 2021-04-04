/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

/*
 * 类中方法的分类：
 * 		1、静态方法 ：加了static的  方法
 * 				调用： 类名.方法名
 * 
 * 		2、实例方法 ： 不加static的 方法
 * 				调用： 对象.方法
 * 
 * 		3、构造函数（构造器，构造方法）
 */
public class Demo02 {
	/*
	 *1、静态方法和实例方法对全局变量的直接访问,
	 * 
	 * 当前类中的方法可以直接对 当前类中的变量进行访问,
	 * 访问的规则：
	 * 		（1）、 实例方法，可以直接访问实例变量
	 * 					 还可以直接访问静态变量
	 * 		（2）、 静态方法，只能访问 静态变量
	 * 
	 * 
	 *2、方法之间的相互调用
	 *		在同一个类中，方法之间是可以相互调用的
	 *
	 *		（1）、实例方法可以直接访问静态方法和 实例方法
	 *		（2）、静态方法 只能直接访问静态方法
	 */
	int temp=10; //实例变量
	static int staticTemp=20;
	
	
	public void method1() {
/*
 * 		我们在方法中直接调用实例变量，
 * 		但是实际上在编译器编译后得到的是this.temp
 * 		this表示调用此方法的当前对象，
 * 		这样我们就能确定在调用方法修改实例变量时，修改的是哪个对象的实例变量值
 */
//		this.temp=29;  
		temp=29;
		staticTemp=13;
		
		method2();
		staticMethod2();
	}
	
	public void method2() {
		System.out.println("Demo02.method2()....");
	}
	
	public static void staticMethod1() {
//		temp=18;
		staticTemp=89;
		staticMethod2();
//		 method2();
		
	}
	public static void staticMethod2() {
		System.out.println("Demo02.staticMethod2()....");
	}
	
	
	public static void main(String[] args) {
		
		Demo02 demo=new Demo02();
//		System.out.println("demo.temp"+demo.temp);
//		System.out.println("demo.staticTemp:"+demo.staticTemp);
		
		Demo02 demo1=new Demo02();
		
		demo.method1();
//		System.out.println("demo.temp"+demo.temp); // 29
//		
//		System.out.println("demo1.temp"+demo1.temp);// 10
//		
//		System.out.println("demo.staticTemp:"+demo.staticTemp);
		
	}
}
