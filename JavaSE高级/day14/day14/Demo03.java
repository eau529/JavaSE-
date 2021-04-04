/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day14;

/**  
 *  全局内部类：
 *		1、静态内部类
 *		2、实例内部类
 *	全局内部类同样可以直接访问 外部类的全局变量，
 *	但是，静态内部内只能直接访问静态变量，
 *		  实例内部类可以访问静态变量 和实例变量
 *	
 *	在全局内部类中可以实现对外内的全局变量值的修改
 */
public class Demo03 {
	static int staticField=78;
	int filed=20;
	
	//定义静态内部类
	static class StaticInnerClass{
		public StaticInnerClass() {
			System.out.println("staticInnerClass()..... ");
		}
		
		public static void  staticTest() {
			System.out.println("我是静态内部类的静态方法");
		}
		public void test() {
			staticField=17;
			System.out.println("staticField:"+staticField);
//			System.out.println(filed);
			System.out.println("staticInnerClass.test().......");
		}
	}
	//定义实例内部类
	class InnerClass{
		public InnerClass() {
			System.out.println("InnerClass()..... ");
		}
		public void test() {
			System.out.println("staticField:"+staticField);
			System.out.println("filed:"+filed);
			System.out.println("staticInnerClass.test().......");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 静态内部类的调用， 直接创建静态内部对象使用
		 */
		StaticInnerClass sic= new StaticInnerClass();
		sic.test();
		//使用静态内部类的静态方法
		Demo03.StaticInnerClass.staticTest();
		
		/*
		 * 实例内部类的调用：
		 * 		 外部内对象.new 实例内部类构造器	
		 */
		Demo03  demo= new Demo03();
		InnerClass ic=demo.new InnerClass();
		ic.test();	
	}
}
