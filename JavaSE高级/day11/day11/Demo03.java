/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

/**  
 * 同步锁的互斥：
 * 		
 * 	  在java中，没一个对象都一个lock，
 * 	  当线程去访问某个对象的synchronized的时候，
 *   那么该对象就被此线程上了锁（注意，锁的是对象，不是方法）。
 *   
 *   此时当这个对象中含有多个synchronized方法时，
 *   只要有一个synchronized方法被线程运行，
 *   那么其他synchronized方法均不可被被其他线程运行， 我们称之为同步锁的互斥，
 *   
 *   注：没有synchronized修饰的方法 不受影响。
 */
public class Demo03 {
	public static void main(String[] args) {
		ClassA calssA = new ClassA();
		Thread th1 = new Thread() {
			public void run() {
				calssA.method1();
			}
		};
		
		Thread th2= new Thread() {
			public void run() {
				calssA.method2();
			}
		};
		
		Thread th3= new Thread() {
			public void run() {
				calssA.method3();
			}
		};
		
		th1.start();
		th2.start();
		th3.start();
	}
}
class ClassA{
	
	public synchronized void method1() {
		System.out.println("method1()执行");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void method2() {
		System.out.println("method2()执行");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public  void method3() {
		System.out.println("method3()执行");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
