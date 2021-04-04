/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10.demo08;

import day10.Demo06;

public class Demo09 extends Demo06{
	
	public void test() {
		/*
		 *    子类使用父类的变量和方法，直接使用即可，或者通过super关键来调用
		 */
		System.out.println(super.filed2);
	}
	public static void main(String[] args) {
		Demo09 demo=new Demo09();
		//通过   子类对象名来调用父类中的属性
		demo.filed2="xfs";
	}
}
