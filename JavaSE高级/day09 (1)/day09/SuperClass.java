/**
 * <p>Title: SuperClass.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

/**    
 *  定义一个父类，用来被继承
 */
public class SuperClass {
	static String staticSuperField="父类静态变量初始化赋值";
	static {
		System.out.println(staticSuperField);
		System.out.println("父类静态代码块执行。。。");
		System.out.println("---------------------------------");
	}
	
	String superField="父类实例变量初始化";
	{
		System.out.println(superField);
		System.out.println("父类对象块被执行");
	}
	
	public SuperClass() {
		System.out.println("父类无参构造器被执行。。。");
		System.out.println("---------------------------------");
	}
}
