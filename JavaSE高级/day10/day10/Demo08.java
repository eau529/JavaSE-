/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/*
 * Thread提供的常见方法：
 * 	  1、static currentThread()  获取执行当前方法的线程
 */
public class Demo08 {
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("执行当前main方法的线程是："+t);
		
		Runnable myRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("任务执行");
				Thread t = Thread.currentThread();
				System.out.println("执行当前任务的线程是："+t);
			}
		};
		
		Thread th = new Thread(myRunnable,"自定义线程");
		th.start();
	}
}
