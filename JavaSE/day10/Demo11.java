/**
 * <p>Title: Demo11.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

import day10.test03.Pig;

public class Demo11 {	
	public static void main(String[] args) {
		/*
		 * 继承： 子类通过extends 关键字可以实现对其他类的继承	
		 * 			被继承的类叫父类（超类），继承的类叫做子类
		 * 继承的目的： 为了实现代码的复用，通过父类去定义共用的属性和功能
		 * 
		 * 
		 * 继承父类以后可以调用父类中的非private的  方法 和 成员变量
		 * 	父类的中 默认权限，需要在同包类中可以通过 子类对象名.父类属性名的方式调用
		 * 		
		 *       子类继承父类以后同样可以拥有属于自己的属性 和 方法，
		 *       同时也可以定义和父类相同的变量和方法,
		 *       在使用时也使用的是子类自己书写的变量 和 方法
		 * 		
		 */
		Dog dog=new Dog();
		dog.run();
		dog.age=10;
		System.out.println("dog.size:"+dog.size);
			
		Pig pig=new Pig();
//		pig.size; // 不能调用到不同包中的父类中的默认权限
		
	}
}
class Dog extends Demo11_Animal{
	public int age;
	public String size="33";
}

class Cat extends Demo11_Animal{
	
}

