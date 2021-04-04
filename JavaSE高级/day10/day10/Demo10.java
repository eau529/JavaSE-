/**
 * <p>Title: Demo10.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**  
 * 获取线程相关信息的方法
 */
public class Demo10 {
	public static void main(String[] args) {
		Thread mainTh = Thread.currentThread();
		
		//1、获取线程名，getName()
		System.out.println("当前线程名为： "+mainTh.getName());
		
		//2、获取当前线程的id
		System.out.println("当前线程id为：  "+mainTh.getId());
		
		//3、查看线程的优先级
		int priority= mainTh.getPriority();
		System.out.println("当前线程的优先级：  "+priority);
		
		//4、isAlive() 判断当前线程是否处于活跃状态
		boolean isAlive = mainTh.isAlive();
		System.out.println("当前线程是否处于活跃状态：  "+isAlive);
		
		//5、isDaemon() 判断当前线程是否为守护线程
		boolean isDaemon = mainTh.isDaemon();
		System.out.println("当前线程是否为守护线程：  "+isDaemon);
	}
}
