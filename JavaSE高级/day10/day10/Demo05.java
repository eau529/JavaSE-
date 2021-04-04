/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**  
 * 装饰模式： 它是一种替代继承的技术，
 * 			 它通过一种无须定义子类的式来给对象动态的增加职能
 * 
 * 			使用时，我们先定义装饰类，
 * 			然后在装饰类中去持有 原始要被装饰的对象，
 * 			然后通过该对象可以实现对原始功能的调用，
 * 			同时在此基础上我们可以进行功能的新增， 来实现对原始类的功能扩展。
 * 
 * 装饰模式的组成构件：
 *  	1、被装饰对象 ，它是我们要进行功能扩展的基础类
 *  	2、 装饰器 ，用来装饰被装饰对象，即扩展他的功能
 * 		3、Component（抽象构件）：它是 被装饰对象 和 抽象装饰类的共同父类。
 * 
 * 		4、Decorator（抽象装饰类）：它也是抽象构件类的子类，
 * 								用于给具体构件增加职责，但是具体 职责在其子类中实现。
 * 								它维护一个指向抽象构件对象的引用，通过该引用可以调用装饰之前构件对象的方法，
 * 								并通过其子类扩展该方法，以达到装饰的目的。

 * 
 * 装饰模式的核心组件：
 * 		1、 装饰器    2、被装饰对象
 */
public class Demo05 {
	public static void main(String[] args) {
		MrWang mrWang = new MrWang();
		mrWang.show();
		System.out.println("累计消费： "+mrWang.cost());
		System.out.println("-----------------------------");
		
		Jacket jacket = new Jacket(mrWang); 
		jacket.show();
		System.out.println("累计消费： "+jacket.cost());
		System.out.println("--------------------------------");
		
		
		Hat hat  = new Hat (jacket);
		hat.show();
		System.out.println("累计消费： "+hat.cost());
		
	}
}


/*
 * 比如我们有一个基础类MrWang1,使用这个类中的方法时候，
 * 其功能除了基础功能外，还有有些一些功能是需要根据实际的使用情况动态变化的。
 * 在这种情况下我们可以考虑使用装饰器模式
 */
class MrWang1{
	public void show() {
	 	System.out.println("MrWang的基础功能，即购买东西");
		/*
		 * 这里我们将功能给定死了，没法实现动态变化，
		 * 比如在某个情况下我只想执行买衣服和鞋子的功能，或者只想买帽子。
		 * 但是我们又不能随时随地的去修改源码
		 */
		System.out.println("MrWang买了一件衣服，花费200");
		System.out.println("MrWang买了一顶帽子，花费100");
		System.out.println("MrWang买了一双鞋子，花费50");
	}
}


/*
 * 开始使用装饰器模式
 */

/*
 * 定义 被装饰对象 和 装饰抽象类的 父接口
 */
interface Person{
	public double cost();
	public void show();
}


//MrWang属于被装饰对象，即等下需要对他进行功能扩展
class MrWang implements Person{
	@Override
	public double cost() {
		System.out.println("MrWang.cost()具有的基础功能，花费0块钱");
		return 0;
	}

	@Override
	public void show() {
		System.out.println("MrWang.show()具有的基础功能，赤身裸体");
	}
}


//开始定义装饰器进功能扩展
/*
 * 1、先定义装饰器的父抽象类，
 * 	   在该抽象类中定义一个父接父类型的引用变量，
 * 	  该引用变量指向 具体需要被装饰的对象，我们等下通过构造器传入该对象
 */
abstract class ClothesDecorator implements Person{
	protected Person  person;
	public ClothesDecorator(Person person) {
		this.person = person;
	}
}

// 2、开始定义装饰器子类
class Jacket  extends ClothesDecorator{
	public Jacket(Person person) {
		super(person);
	}
	
	/*
	 *在装饰器子类中，我们通过抽象父类提供的  指向被装饰对象引用变量来 实现对其初始方法调用，
	 *与此同时我们还可以实现新的功能扩展
	 */
	@Override
	public double cost() {
		System.out.println("我是对新功能的扩展。。。");
		return person.cost()+200;
	}
	@Override
	public void show() {
		person.show();
		System.out.println("穿上了一件jacket，价值200金币");
	}
}

class Hat extends ClothesDecorator{
	public Hat(Person person) {
		super(person);
	}
	
	@Override
	public double cost() {
		return person.cost()+50;
	}

	@Override
	public void show() {
		person.show();
		System.out.println("带上了帽子，价值50金币");
	}
}
