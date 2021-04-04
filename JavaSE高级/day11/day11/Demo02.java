/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

/**  
 *  synchronized除了能使用在指定的方法上外，
 *		                还可以加到某个代码段中，我们称其为 同步代码块
 */
class MySql{
	int money = 1000;
	public synchronized void excuteSql(int money) {
		System.out.println(Thread.currentThread().getName()+"开始执行数据库操作，先进行数据库连接");
		try {
			System.out.println("数据库连接中。。。。。");
			Thread.sleep(3000);
			System.out.println("数据库连接成功。。。。。............................");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*
		 * 合理的使用同步块 ，
		 * 可以更准确的指定需要同步的代码的范围，
		 * 提升多线程执行的效率
		 * 
		 * 同步块在使用时，需要指定 “上锁的对象”
		 */
		synchronized(this) {
			System.out.println("修改数据库数据");
			this.money = this.money-money;
			System.out.println("数据库数据修改完毕");	
		}
	}
}
public class Demo02 {
	
	public static void doMethod() {
		MySql ms = new MySql();
		Thread th1 = new Thread() {
			public void run() {
				long startTime = System.currentTimeMillis();
				ms.excuteSql(100);
				long endTime = System.currentTimeMillis();
				System.out.println(Thread.currentThread().getName()+"执行时间： "+ (endTime-startTime));
			}
		};	
		
		Thread th2 = new Thread() {
			public void run() {
				long startTime = System.currentTimeMillis();
				ms.excuteSql(100);
				long endTime = System.currentTimeMillis();
				System.out.println(Thread.currentThread().getName()+"执行时间： "+ (endTime-startTime));
			}
		};	
		
		Thread th3 = new Thread() {
			public void run() {
				long startTime = System.currentTimeMillis();
				ms.excuteSql(100);
				long endTime = System.currentTimeMillis();
				System.out.println(Thread.currentThread().getName()+"执行时间： "+ (endTime-startTime));
			}
		};
		th1.start();
		th2.start();
		th3.start();
	}
	
	public static void main(String[] args) {
		 doMethod(); 
	}
}

