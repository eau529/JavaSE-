/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day14;

/*
 *内部类 ：  定义在一个类体中的类称为内部类，  外面的类我们叫外部类
 *
 *  内部类分两种： 
 *  	1、全局内部类
 *  	2、局部内部类
 *	 
 */
public class Demo02 {
	
	public void  test() {
		int testField=20;
		/*
		 * 定义在方法中的内部类
		 * 		局部内部类，可以直接访问局部代码段中的变量，
		 * 		但是反过来则不行。
		 * 		
		 *   注： 在jdk1.8以前，  局部内部类访问   对应的局部变量时，
		 *   					该变量必须被final关键字修饰
		 *   	  所以局部内部类只能实现对局部变量的访问，但不可以修改
		 */
		class TestInnerClass{
			int x=10;
			public TestInnerClass() {
				System.out.println("局部内部类对象被创建。。。");
			}
			public void innerMethod() {
//				testField=19; 
				System.out.println("当局部变量testField的值:"+testField);
				System.out.println("TestInnerClass.innerMethod() ");
			}
		}
		TestInnerClass tic=new TestInnerClass();
		System.out.println(tic.x);
		tic.innerMethod();
	}
	public static void main(String[] args) {
		Demo02 demo=new  Demo02();
		demo.test();
	}
}