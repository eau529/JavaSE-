/**
 * <p>Title: Demo12.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**  
 *  sleep() 让执行当前方法的线程沉睡指定的毫秒数，
 *		     经过指定的毫秒数以后，
 *		  当前线程会重新回到 就绪续状态，等待被cpu执行。
 */
public class Demo12 {
	public static void main(String[] args) {
		System.out.println("程序开始执行。。。");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("程序结束。。。");
		
	}
}
