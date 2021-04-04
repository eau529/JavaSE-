/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

/**  
 * this关键字的使用：  表示当前对象
 *  	
 *	1、区别方法中的   形式参数  和 成员变量
 *
 *	2、 在实例方法中，所有的实例变量都会被编译器默认添加this
 *
 *	3、构造器的相互调用, this(参数列表)来决定调用哪个构造器，
 *	      而且必须要放在当前构造器的第一行，否则编译报错
 *
 *	4、将当前对象作为参数传递到其他方法中
 */
public class Demo05 {
	String userName;
	int age;
	
	public Demo05() {
		this("cf",19);
		System.out.println("其他的初始化操作。。");
	
	}
	
	public Demo05(String userName) {
		this.userName=userName;
	}
	
	public Demo05(String userName,int age) {
		this.userName=userName;
		this.age=age;
	}
	
	public static void main(String[] args) {
		Demo05 demo=new Demo05();
		System.out.println(demo.age);
	}
}
