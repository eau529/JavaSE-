/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day12;

public class Demo01 {

	/**  
	 * 多态：
	 *    指的是父类的某个方法被子类重写以后，产生了各自的功能行为
	 *    
	 * 多态产生的条件：  1、具有继承关系
	 * 				   2、子类必须对父类中的方法进行重写
	 * 				   3、向上造型
	 *
	 * 程序的静态绑定和动态绑定：
	 * 		绑定： 指的是将方法 和其所在类的对象 关联起来，就叫做方法的绑定
	 * 
	 *  	静态绑定（编译期绑定）：
	 *  		指的是在java中， 处于编译的时期，就能确定 方法和 哪个对象绑定
	 *  
	 *  	动态绑定（运行期绑定）：
	 * 			指的是程序在运行的过程中，
	 * 			根据引用变量所表示的具体对象 才能确定出调用 的具体的哪个方法
	 * 			
	 */
	public static void main(String[] args) {
		Father father=new Son();
		father.method();
		father.method1();
	}
}
class  Father {
	public static void method(){
		System.out.println("Father.method()");
	}
	
	public void method1(){
		System.out.println("Father.method1()");
	}
}
class Son extends Father{
	public static void method(){
		System.out.println("Son.method()");
	}
	public void method1(){
		System.out.println("Son.method1()");
	}
}
