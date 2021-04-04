/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day12;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**  
 * 线程池：
 * 	  目的：1、 控制线程的数量  2、实现线程的重用
 * 	
 * 	在实际的开发过程中， 我们不能够因为任务的增而无休止的创建线程，
 * 	这会导致cpu的内存开销过大 和 cpu的过度切换，严重拖慢系统的性能，
 *  同时频繁的创建和销毁线程也会给cpu带来负担，
 *  所以我们需要控制线程的数量和  重用已经创建好的线程。   
 */
public class Demo01 {
	public static void main(String[] args) {
		
		/*
		 *  1、创建线程池
		 *  		newFixedThreadPool() 创建线程池，需要指定线程池大小
		 */
		ExecutorService threadPool 
			=Executors.newFixedThreadPool(5);
		
		for(int i=1; i<=50;i++) {	
			final int x =i;
			// 定义任务
			Runnable runnable =new Runnable() {	
				@Override
				public void run() {
					Thread th = Thread.currentThread();
					System.out.println("线程"+th.getName()+"正在执行任务...."+x);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("线程"+th.getName()+"执行任务完毕");
					
				}
			};
			
			/*
			 * 将定义好的任务指派给线程池，
			 * 线程池中的线程执行完任务以后，不会被销毁，而是等到下一任务指派。
			 */
			threadPool.execute(runnable);
		}

		//shutdown() 关闭线程池，需要等待所有任务都执行完毕才关
		threadPool.shutdown();
		
		//立即关闭线程池，不管是否还有任务在执行
//		threadPool.shutdownNow();
	}
}
