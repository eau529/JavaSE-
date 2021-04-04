/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

/**  
 * 类加载与 对象的创建：
 * 		程序在启动时， jvm会先将 类进行事先的加载， 然后再执行创建对象的操作 
 *  
 *		类加载的步骤：
 *			1、初始化类（静态）变量
 *			2、 分配静态方法入口
 *			3、执行静态代码块
 *		
 *		对象的创建步骤：
 *			1、执行实例变量初始化
 *			2、分配实例方法的函数入口；
			3、执行对象块；
			4、执行构造函数(剩余语句才是第四部分执行)

 */
public class Demo01 {
	static String classNo;
	String name;
	//静态代码块，只随着类被加载时执行一次，一般来进行加载资源的等操作
	static {
		System.out.println(classNo);
		classNo="javaSE1808";
		System.out.println(classNo);
		System.out.println("----------------------------------");
	}
	
	//对象块，当有对象被创建时，随着执行一次
	{
		System.out.println(name);
		name="lxy";
		System.out.println(name);
	}
	
	public Demo01() {
		System.out.println("构造器被执行。。。");
	}
	
	
	public static void main(String[] args) {
		Demo01 demo=new Demo01();
		demo.name="cf";
	}
}
