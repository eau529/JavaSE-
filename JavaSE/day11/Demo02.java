/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * super关键字： 就表示当前父类对象，和this关键字一样，不能出现static方法中
		 * 
		 *    1、可以在子类中调用  被隐藏父类的属性 和被重写的方法
		 *    2、在子类构造器的第一行，默认被编译器添加有super()
		 */
		Sub sub=new Sub();
		sub.test();
		sub.test1();
		
		/*
		 * final 关键：   修饰类，表示此类不可以被继承
		 * 				修饰方法， 表示此方法不可被重写
		 * 				修饰变量，表示为自定义常量
		 */
	}
}
class Super{
	int age=50;
	
	public Super() {
		System.out.println("父类构造器被调用。。。");
	}
	
	public void test() {
		System.out.println("Super.test()");
	}
}

 class Sub extends Super{
	int age=20;
	
	public Sub() {
		super();
	}
	
	public void test1() {
		super.test();
	}
	
	public void test() {
		int fatherAge=super.age;
		System.out.println("age:"+age);
		System.out.println("fatherAge:"+fatherAge);
	}
}