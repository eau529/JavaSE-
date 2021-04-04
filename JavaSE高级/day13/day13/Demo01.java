/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day13;

public class Demo01 {
	
	public static void test(Shape shape) {
		shape.getArea();
	}
	
	public static void main(String[] args) {
		Shape shape=new Triangle(3,5);
		test(shape);
		shape.draw();
	}
}

/*
 * 抽象类：被 abstract关键字所修饰的类
 * 
 * 特点： 1、不可以被实例化（即创建抽象类对象）
 * 	     2、 当某个类中具有抽象方法时，那么该类一定是抽象类，
 * 			 但是抽象类，不一定有抽象方法
 * 		 3、抽象类中也可以定义实例变量，静态变量，
 * 			普通实例方法，普通静态方法
 * 
 * 		 注意：1、final和 abstract不可以同时使用修饰一个类
 * 		      2、 如果子类继承 抽象类，不想实现其抽象方法，
 * 			       那此类必须也是abstract的
 * 
 * 抽象类的意义：使用抽象类，一般来说是为了使用它的功能，
 * 			抽象它规定了它的子类必须实现某个抽象方法（或则说提供对应的功能服务），
 * 			这个方法会随着子类不同（场景不同），而实现不同，
 * 			之所以要 子类强制实现抽象类的 抽象方法，
 * 			是为了保证程序一定能提供对应的功能
 */
abstract class Shape{
	public abstract double getArea();
	
	public void draw() {
		System.out.println("draw()");
	}
}

class Triangle extends Shape{
	double x;      //底边   
	double height; //高

	public Triangle(double x, double height) {
		super();
		this.x = x;
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*height/2;
	}
	
}
class Circle extends Shape{
	 double  r;
	@Override
	public double getArea() {
		return 3.14*r*r;
	}
}
class Rectangle extends Shape{
	 double  x; //长
	 double  y; // 宽
	@Override
	public double getArea() {
		return x*y;
	}
}