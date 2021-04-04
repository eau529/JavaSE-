/**
 * <p>Title: Dmo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;
/**
 * 泛型：jdk1.5推出的
 * 			泛型又叫做参数类型化，即程序的定义者只是 
 * 			对程序的结构进行定义（定义当前程序有哪些方法和变量），
 * 			但是对具体 变量、参数、返回值的类型不定义，而是交给使用者来决定，
 * 			即使用在在创建该类的实例时，将泛型的实际类型传入。
 *  
 */
public class Demo02 {
	public static void main(String[] args) {
		Point p1=new Point(1,2);
		p1.setX("1");		
		
		/*
		 * 创建对象时，指定泛型的类型，
		 * 		编译在编译时，会进行类型的检查，
		 * 		如果 变量、参数的类型和 指定的泛型类型不一致，会编译报错
		 */
		Point<Integer> p2=new Point(1,2);
		p2.setX(2);
		
		Point<String> p3=new Point<String>("1","2");
		p3.setX("1");
	}
}

/*
 * 泛型的原型是Object类型，这里的T只是代替的作用，可以换成其他字母
 */
class Point<T>{
	private T x;
	private T y;
	

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}


	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}


