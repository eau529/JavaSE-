/**
 * <p>Title: Demo11.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

import java.util.Scanner;

import javax.xml.soap.SAAJResult;

/**  
 *  线程的优先级：
 *		我们不能控制cpu对时间片的分配，
 *      但是我们可以提高线程获取时间片的概率，也即是提高线程的优先级。
 *      优先级越高，越容易获得时间片
 *  优先级总共有10: 1~10 ,数字越大，优先级越高，
 *  一般创建出来的线程的默认优先级都是5
 */
public class Demo11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		Thread th1 = new Thread() {
			public void run() {
				String threadName=Thread.currentThread().getName();
				for(int i=0;i<1000;i++) {
					System.out.println("正在执行任务1");
				}
			}
		};
		Thread th2 = new Thread() {
			public void run() {
				String threadName=Thread.currentThread().getName();
				for(int i=0;i<1000;i++) {
					System.out.println("正在执行任务2");
				}
			}
		};
		/*
		 * setPriority()设置线程的优先级，
		 * 				注意优先级需要在线程执行之前设置，否则没有意义。
		 */
		th1.setPriority(10);
		th2.setPriority(1);
		
		th1.start();
		th2.start();
		
	}
}
