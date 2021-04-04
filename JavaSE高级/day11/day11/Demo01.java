/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

/**  
 *多线程并发安全问题 ：	
 *	当多个线程并发的去读写 某个相同的临界资源时，就会引发安全问题。
 *	多线程访问同一个资源时，可能会出现“抢资源的现象”吗，
 *  这是由于cpu在执行多个线程，时间片分配的不确定性导致的。  
 */
public class Demo01 {
	public static void main(String[] args) {
		BankUser bu = new BankUser();
		
		Thread th1 = new Thread() {
			public void run() {
				for (int i = 1; i<=10; i++) {
					if(bu.getMoney(100)) {
							System.out.println("线程1 取钱第"+i+"次成功。。");
							System.out.println("--------------------------------");
						}
					if(bu.money<=0 ) {
						break;
					}
				}
					
				
				
			}
		};	
		
		Thread th2 = new Thread() {
			public void run() {
				for (int i = 1; i<=10; i++) {
					if(bu.getMoney(100)) {
							System.out.println("线程2 取钱第"+i+"次成功。。");
							System.out.println("--------------------------------");
						}
					if(bu.money<=0 ) {
						break;
					}
				}
			}
		};	
		
		th1.start();
		th2.start();
	}
}

class BankUser{
	int money = 1000;
	
	/*
	 * 线程锁synchronized：
	 * 		作用在指定的方法上以后，那么该方法会变成一个同步方法，
	 * 		即不会出现多个线程 同时执行到该方法内部的情况。
	 * 
	 * 		多线程执行该方法时，会依次排队执行该方法，
	 *      即使某个线程在执行该方法的过程中，时间片耗尽，
	 *      其他线程也会等待 当前线程将此时运行完毕后，再去执行该方法。
	 */
	public synchronized boolean getMoney(int money) {
		if(this.money < money) {
			System.out.println("余额不足  ");
			return false;
		}else {
			this.money = this.money-money;
			System.out.println(Thread.currentThread().getName()
					+"取完钱以后，当前余额为："+this.money );
			return true;
		}
	}
	
	
}