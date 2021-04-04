/**
 * <p>Title: Demo15.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**   
 *  守护线程：又叫做后台线程
 *           正常创建出来的线程都是前台线程， 
 *           后台线程是通过setDaemon(true) 将前线程设置成后台线程。
 *           
 *   特点： 使用上和普通线程一样， 只是运行时，
 *         如果一个进程中的所有前台线程运行结束，此时还有守护线程在运行，
 *         那么此时整个进程强制结束。
 *         
 *         如果一个进程中的所有守护线程运行结束，此时还有前台线程在运行，
 *         那么此时整个进程继续，直到全部的前台线程结束。
 */
public class Demo15 {
	public static void main(String[] args) {
		Thread th1 = new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("我前台线程，正在执行第"+i+"个任务");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("前台线程执行任务完毕。。。");
			}
		};
		Thread th2 = new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("我守护线程，正在执行第"+i+"个任务");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("守护线程执行任务完毕。。。");
			}
		};
		th2.setDaemon(true);
		
		th1.start();
		th2.start();
	}
}
