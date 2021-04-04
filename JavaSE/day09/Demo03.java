/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;
public class Demo03 {
	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstace();
		System.out.println("a:"+singleton.a+",b:"+singleton.b);//1,0 / 1,1 /0,0
	
		Singleton singleton1=new Singleton();
		System.out.println("a:"+singleton1.a+",b:"+singleton1.b);
	}
}
class Singleton{
	public static int a;
	public static int b=0;
	private static Singleton single=new Singleton();
	
	public Singleton() {
		a++;
		b++;
	}
	public static Singleton getInstace() {
		return single;
	}
}