/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

/**  
 * 静态锁：
 *		在静态方法上添加synchronized关键字
 *
 *  特点：静态方法是属于类的，所以当静态方法上锁，就只是对这个方法上锁，
 *  	   和对象无关。 
 *  	  比如   两个线程去访问  不同对象的相同  synchronized静态方法，
 *  	             执行不会并发执行，会同步执行。
 */
public class Demo04 {
	public static void main(String[] args) {
		ClassB calssB1 = new ClassB();
		ClassB calssB2 = new ClassB();
		
		Thread th1 = new Thread() {
			public void run() {
				calssB1.method1();
			}
		};
		Thread th2= new Thread() {
			public void run() {
				calssB2.method1();
			}
		};
		th1.start();
		th2.start();
	}
}

class ClassB{
	public synchronized static void method1() {
		System.out.println("staticMethod1()执行");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized static void method2() {
		System.out.println("staticMethod2()执行");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
