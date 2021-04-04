/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day14;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 匿名内部类：
		 *		没有名字的内部类，  因为没有名字，所以该类只能被使用一次，
		 *		通常它被用来简化代码的编写， 
		 *使用的前提条件：  继承一个父类 或者 实现了一个接口
		 *
		 *使用场景：  一般来说，如果我们想使用  抽象类或接口 的方法，
		 *			那么必须定义一个子类  去继承 或者实现 父类(或接口)，
		 *
		 *			那如果在某个场景下，
		 *			我们只是想在某个代码段中使用一次 抽象类或接口的方法，
		 *			除此外，别的地方再也会不会用到，那么我们就没有必要
		 *			再去为这些抽象类或接口定义 一个子类，然后在调用，
		 *			只需要通过匿名内部类实现即可
		 */
		Person p=new Person() {
			@Override
			public void eat() {
				System.out.println("eat");
			}
		};
		p.eat();
	}
}
abstract class Person{
	public abstract void eat();
}
//class Son extends Person{
//	@Override
//	public void eat() {
//		System.out.println("eat()....");	
//	}
//}




