/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

import java.io.IOException;
import java.sql.SQLException;

/*
 *子类继承父类后， 变量的隐藏和方法的重写
 */
public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 变量的隐藏：
		 * 		子类继承父类后，可以定义和父类相同的属性，此时父类中对应的变量被隐藏，
		 * 		子类调用时调用的是子类自己的变量
		 * 
		 * 方法的重写：
		 * 		在子类中定义一个和父类完全相同的方法（类型，返回值，参数列表不同），
		 * 		权限 和 抛出的异常可以不一致
		 * 
		 * 方法重写的目的： 父类中方法的定义不满足子类的要求，我们就可以重写父类的方法
		 * 
		 * 方法重写的原则：   1、子类重写父类的方法时，不能比父类方法的权限修饰词更小
		 * 					2、子类重写父类方法时， 不能比父类方法抛出更多的异常
		 */
		Son son=new Son();
		System.out.println(son.age);
		son.student();
	}
}
class Father{
	public int age=40;
	protected void student() {
		System.out.println("父亲是学霸，门门功课100。。。");
	}
	
	
	public void method() throws InterruptedException,IOException {
		Thread.sleep(10);
		
	}
}
class Son extends Father{
	public int age=20;
	
	protected void student() {
		System.out.println("儿子是学渣，成绩倒数。。。");
	}
	
	//测试子类重写父类方法时，不能比父类方法有更多的异常
//	public void method() throws InterruptedException,IOException,SQLException {
//		
//	}
	public void method() throws InterruptedException,IOException {
		System.out.println(".......");
	}
	
}