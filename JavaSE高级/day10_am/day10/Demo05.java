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
 * 装饰的模式的核心组件：
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


interface Person{
	public double cost();
	public void show();
}

//MrWang属于被装饰对象
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

//1、装饰器的父抽象类
abstract class ClothesDecorator implements Person{
	protected Person  person;
	public ClothesDecorator(Person person) {
		this.person = person;
	}
}

// 2、开始定义装饰器类
class Jacket  extends ClothesDecorator{
	public Jacket(Person person) {
		super(person);
	}
	//累计消费
	@Override
	public double cost() {
		return person.cost()+200;
	}

	//数据显示
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
