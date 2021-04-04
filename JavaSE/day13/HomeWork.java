/**
 * <p>Title: HomeWork.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day13;

public class HomeWork {
	public static void main(String[] args) {
		MyShape[] myShapes=new MyShape[2];	
		myShapes[0]=new MyTriangle();
		myShapes[1]=new MyCircle();
		
		myShapes[0].draw();
	}
}

class MyShape{
	public void draw() {
		
	}
	public double getPermetier() {
		return 0.0;
	} 
	public double getArea() {
		return 0.0;
	} 
}

class MyTriangle extends MyShape{
	double x;      //底边
	double y;      
	double z;      
	double height; //高
	@Override
	public void draw() {
		System.out.println("MyTriangle.draw()");
	}
	public void draw(String color){
		System.out.println("MyTriangle.draw(String color)");
	};
	
	
	@Override
	public double getPermetier() {
		return x+y+z; 
	}
	@Override
	public double getArea() {
		return x*height/2;
	}
}
class MyCircle extends MyShape{
	double r;
	@Override
	public void draw() {
		System.out.println("MyCircle.draw()");
	}
	
	public void draw(String color){
		System.out.println("MyCircle.draw(String color)");
	};
	@Override
	public double getPermetier() {
		return 2*r*3.14; 
	}
	@Override
	public double getArea() {
		return 3.14*r*r;
	}
}

