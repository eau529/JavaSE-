/**
 * <p>Title: HomeWork02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day13;

public class HomeWork02 {
	public static void main(String[] args) {
		new Sub();
	}
}
class Supper {
	int i = 10;
	public Supper() {
		/*
		 * 子类继承父类，并重写其方法后，
		 * 如果在父类构造器中调用对应的方法，那么调的是子类重写的方法
		 */
		print();
		i = 20;
	}
	public void print() {
		System.out.println("Supper==="+i);
	}
}

class Sub extends Supper {
	int i = 30;
	public Sub() {
		print();
		super.print();
		i = 40;
	}

	public void print() {
		System.out.println("Sub==="+i);
	}
}