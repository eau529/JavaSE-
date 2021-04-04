/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * java只支持单继承（即父类只能有一个），
		 * 但是可以支持多重继承，即子类可以 重用父类的父类 中的属性和方法
		 */
		Son1 son=new Son1();
		System.out.println(son.name);
	}
}
class GraFather{
	String name="矮星聚落";
}

class Father1 extends GraFather{
	
}

class Son1 extends Father1{
	
}