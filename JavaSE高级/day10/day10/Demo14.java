/**
 * <p>Title: Demo14.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**  
 *  yield:  当前线程让出cpu资源，让其他线程先执行
 *    	yield()使得当前程线程让出cpu,但是让出的时间是不定的，
 *    	同时在让出cpu资源之前，
 *    	它会事先检查当前是否有处于相同优先级的线程处于可运行状态，
 *    	如果有，则将cpu让给此线程，如果没有则继续执行。
 */
public class Demo14 {
	public static void main(String[] args) {
		Thread th1 = new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("我线程1，正在执行任务1");
				}
			}
		};
		
		Thread th2 = new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("我线程2，正在执行任务2");
					if(i==10) {
						System.out.println("开始让出cpu资源。。。。。。。。。。。。。。。。");
						Thread.yield();
					}
				}
			}
		};
		th1.setPriority(4);
		th1.start();
		th2.start();
	}
}
