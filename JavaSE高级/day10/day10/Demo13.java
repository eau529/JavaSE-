/**
 * <p>Title: Demo13.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**   
 *  阻塞状态：
 *		1、IO阻塞
 *		2、join 和 yield 让线程陷入阻塞 
 */
public class Demo13 {
	public static void joinTest() {
		/*
		 * join: 线程插队， 将当前线程强制 加入cpu执行列表，
		 * 				     当 当前线程执行完毕时，其他线程才可以执行
		 */
		Thread th1 = new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("我线程1，我正在插队");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread th2 = new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("我线程2，排队中。。。。");
					if(i==10) {
						try {
							th1.join();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		th1.start();
		th2.start();
	} 
	
	
	public static void main(String[] args) {
		joinTest();
	}
}
