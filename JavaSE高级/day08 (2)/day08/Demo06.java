/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

/** 
 * 要求： 人吃了这个削苹果机削好的  苹果
 * 
 * 对象分析：  人   削苹果机    苹果
 */
public class Demo06 {
	public static void main(String[] args) {
		Person person=new Person();
		Apple apple=new Apple();
		
		person.eat(apple);
	}
	
}

//定义一个苹果类
class Apple{
	public Apple getPeelApple() {
		Apple apple=Peeler.peel(this);
		return apple;
	}
}
// 定义削苹果机类
class Peeler{
	// 定义一个 削苹果的方法，返回被削好的苹果
	public static Apple peel(Apple apple) {
		System.out.println("开始削苹果。。。");
		
		try {
			Thread.sleep(3000);  //此方法暂停3秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("苹果削好了。。。");
		
		return apple;
	}
}

// 定义人这个类
class Person{
	public void eat(Apple apple) {
		// 得到需要的苹果
		Apple yeeledApple=apple.getPeelApple();
		System.out.println("eat"+yeeledApple);
	}
}


