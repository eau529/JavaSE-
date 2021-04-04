/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

public class Demo04 {
	
	/*
	 * 此时父类型的引用变量animal可以代代码 它下面的所有子类对象，
	 *  表明需要的是animal类，实际需要的是animal中的子类对象
	 */
	public static void feed(String food, Animal animal) {
		System.out.println(animal);
		animal.eat(food);
	}
	
	public static void main(String[] args) {
		String food="鱼";
		
//		向上造型：  父类型的引用变量指向子类型的实例 
		Animal animal=new Pig();
		feed(food,animal);
		/*
		 *  向上造型特点：  
		 *  	1、向上造型以后， 父类型的引用变量 不能访问子类中  新增的成员变量 和方法
		 *  	2、如果子类重写了父类的方法，父类型引用变量访问的是子类重写的方法
		 *  	3、 子类定义了和父类相同的变量时，父类型引用变量访问的还是 父类中的变量	
		 *  
		 *  目的：  以牺牲少部分的功能为代价，来提升代码设计的最大幅度优化
		 */
//		animal.method();
		System.out.println(animal.age);
		
		/*
		 * 向下溯型：
		 * 		将父类型引用变量  再强转成 子类型变量
		 * 
		 * 条件： 1、需要具有继承关系
		 * 		 2、 先经过向上造型， 不能直接将未向上造型的引用变量  向下溯型
		 * 		 3、 父类型变量 所代表的对象的类  可能和 我们要强转的类型不一致，
		 * 			此时程序会抛出ClassCastException 类造型异常，
		 * 				我们需要通过instanceof关键字来避免 ， 
		 * 				其作用就是判断当变量所代码的实例的类型是否为指定类型
		 */
		if(animal instanceof Cat) {
			Cat cat=(Cat)animal;
			cat.method();
		}else {
			System.out.println("animal不是cat的实例");
		}
	}
}
class Animal{
	int age=10;
	public void eat(String food) {
		System.out.println("吃了"+food);
	}
}


class Tiger extends Animal{
	public void eat(String food) {
		System.out.println("老虎吃了"+food);
	}
}
class Pig extends Animal{
	public void eat(String food) {
		System.out.println("野猪吃了"+food);
	}
	
}
class Cat extends Animal{
	int age=20;
	
	public void eat(String food) {
		System.out.println("猫吃了"+food);
	}
	public void method() {
		System.out.println("独属于cat自己的方法");
	}
}