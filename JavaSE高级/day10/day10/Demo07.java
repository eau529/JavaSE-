/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**  
 *  线程的使用方式二：
 *		通过实现Runnable接口，
 *		此种方式使用线程，它避免了 线程和任务之间会出现强耦合的关系。
 */
public class Demo07 {
	public static void main(String[] args) {
		MyRunnable1  run1 = new MyRunnable1();
		MyRunnable2  run2 = new MyRunnable2();
		
		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);
		
		th1.start();
		th2.start();
	}
}

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("任务1");
		}
	}
}

class MyRunnable2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("任务2");
		}
	}
	
}