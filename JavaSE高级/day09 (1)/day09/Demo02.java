/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

/**   
 *  类加载与 对象的创建：
 *		如果有继承关系，先加载父类，在加载子类
 *						接着先创建父类对象，再创建子类对象
 */
public class Demo02 extends SuperClass{
	static String staticSubField="子类静态变量初始化赋值";
	static {
		System.out.println(staticSubField);
		System.out.println("子类静态代码块执行。。。");
		System.out.println("---------------------------------");
	}
	
	String subField="子类实例变量初始化";
	{
		System.out.println(subField);
		System.out.println("子类对象块被执行");
	}
	
	public Demo02() {
		super();
		System.out.println("子类类无参构造器被执行。。。");
	}
	
	
	public static void main(String[] args) {
		Demo02 demo=new Demo02();
	}
}
