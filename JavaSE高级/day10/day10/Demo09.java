/**
 * <p>Title: Demo09.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

public class Demo09 {
	public static void method() {
		Thread th = Thread.currentThread();
		System.out.println("运行method()的线程是："+th.getName());
	}
	
	public static void main(String[] args) {
		method();
		
		Thread th = new Thread() {
			public void run() {
				Thread th = Thread.currentThread();
				System.out.println("当自定义线程是："+th.getName());
				method();
			}
		};
		th.start();
	}
}
