/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**  
 * 进程： 指的是具有一定独立功能的关于某个数据集合的程序的一次运行活动，
 * 		 进程是系统进行 资源分配和调度的独立单位。
 * 
 * 线程： 进程运行时，可能会有多个任务需要同时执行，
 *       此时执行些任务的多个单元就是线程，它也是cpu执行任务的基本单位。
 *  
 *		线程是依附于进程存在的，它没有自己的系统资源，
 *      与同属一个进程的其他线程共享全部资源，一个进程中至少含有一个线程。
 *		可以把进程看做 多个线程的集合，
 *
 *并发：   线程总是并发执行的， cup在执行任务时，会将时间成若干个片段（时间片），
 *		 这些时间片会尽可能均匀的分配给每一个线程，只有当线程拿到时间片以后，它
 *      才有可能被cpu所执行。
 *      从宏观的角度来看，cpu高效运转时，这些线程都好像被同时在运行，
 *      单是从微观的角度看，cpu在具体的某个时刻是只执行单独的某个任务的，
 *      总是走走停停。
 */
public class Demo06 {
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		/*
		 * start()启动线程。
		 * 	  注意： 启动线程是start()
		 * 
		 *  在执行的过程中会发现多个任务是不规律交替执行，
		 *  因为执行过程，线程获取时间片不规律导致的，原因如下：
		 *  	1、cpu将时间片分配给哪个线程是不确定的
		 *      2、cpu分的时间片的长短也是不固定的。
		 *      
		 *  线程它只能被动去等待cpu分配时间片，不能主动索取	，
		 *  也无法强制干涉cpu对线程调度。
		 */
		th1.start();
		th2.start();
		
	}
}
/*
 * 线程的创建：
 * 	1、继承Thread 类，并重写run方法
 * 
 *  此种方式的使用缺点：
 *  	1、java是单继承的，继承Thread就不能去继承别的类，导致开发不灵活
 *  	2、当前线程和任务之间具有强耦合的关系，导致线程的复用性很差
 */
class MyThread1 extends Thread {
	//在run方法中书写线程需要执行的任务
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("执行任务1....."+i);
		}
	}
}

class MyThread2 extends Thread {
	//在run方法中书写线程需要执行的任务
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("执行任务2....."+i);
		}
	}
	
}