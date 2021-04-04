/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

/**  
 *  方法的重载:  实质指的就是同名的不同方法
 *			
 *		在同一个类中，允许出现相同名字的两个方法，
 *		这两个方法的 权限，方法类型，返回值数据类型，方法体中的内容 可同可不相同，
 *		
 *		但是方法中的参数列表一定不同
 *		
 */
public class Demo04 {
	public void method() {
		System.out.println("method()");
	}
	
	double method(int a,double b) {
		System.out.println("method(int a,double b)");
		return 0.0;
	}
	
	double method(double y,int x) {
		System.out.println("method(double y,int x)");
		return 0.0;
	}
	
	public static void main(String[] args) {
		Demo04 demo=new Demo04();
		demo.method(1.3,1);
	}
	
}
