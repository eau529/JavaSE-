/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**   
 *  值传递： 指的是在方法调用时，传递的参数实际上是一个副本（即当前值的拷贝），
 *			传递完毕后就再不想关
 */
public interface Demo02 {
	public static void test(int a) {
		a=10;
		System.out.println("test().a:"+a);// 10
	}
	
	public static void main(String[] args) {
		int a=100;
		test(a);
		System.out.println("main().a:"+a);// 100
	}
}



