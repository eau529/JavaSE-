/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day13;

public class Demo02 {

}

/*
 * 接口：  一种特殊的抽象类，通过interface关键字定义，其比抽象类更抽象
 * 		
 * 		   一般来说在接口中，只有 常量 和 方法定义
 * 
 *  语法规则： 
 *  	1、接口中的常量，可以省略 final, public 关键字
 * 		2、 接口中的抽象方法，可以省略abstract关键字
 * 		3、接口不能实例化，需要通过implements关键字实现
 * 		4、一个子类是可以实现多个接口,并且需要实现所有接口中的方法
 * 
 * 接口的意义： 主要定义该类具有哪些功能，
 * 			     并且接口不管这些方法具体是怎么实现的，具体交由子类来实现。
 * 			
 * 				通常情况下，为了确保一个类能够调用另一个类中的方法，
 * 				通常都会要求这两个类是都同时存在的，
 * 				从而使得java的编译器在编译时能够确该方法是存在的，
 * 				但是这也使得着整个程序变成了一个静态不可扩展的类系统，
 * 				为了更好的维护和功能扩展，所以我们在很多地方会使用接口
 * 
 * 接口和抽象类的差别：
 * 		
 * 		1、接口是对功能的抽象（描述子类具有哪些能力）；
 * 		      抽象类是对类的根源的抽象（描述子类是属于哪个类的）；
 * 			（接口表示子类能做什么，抽象类表示子类 像什么）
 * 
 * 		2、java 不支持多继承，但是支持实现多个接口
 */	
interface Myinterface1{
	public final int STATE=10;
	int STATE1=10;
	public abstract void myinterface1Method();
	public void myinterface1Method1();
} 

interface Myinterface2{
	public final int STATE=10;
	int STATE1=10;
	public abstract void myinterface2Method();
	public void myinterface2Method1();
}

class SubInterface implements Myinterface1,Myinterface2{
	@Override
	public void myinterface2Method() {
		
		
	}
	@Override
	public void myinterface2Method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myinterface1Method() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void myinterface1Method1() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
