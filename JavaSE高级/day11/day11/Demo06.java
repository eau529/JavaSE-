/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

/**  
 * 生产者消费者模型：
 *       它是多线程中一个比较经典的设计模式，为多线程协作提供良好的方案，
 *       
 *       举个例子： 有两个线程，线程A 负责产生数据，线程B负责处理，
 *       		      但是两个线程对数据运作的效率不一致，
 *                 可能A线程产生的 的数据快，  B处理的慢，
 *                 如果此时A不管B，一直产生数据，就会出现问题。
 *                 
 * 需要的对象：
 * 		1、生成者线程
 * 		2、消费者线程
 * 		3、数据缓冲区，用于    生成者 和 消费者共享资源
 *  	      其实就一个对象，方便 生成者 和 消费者操作同一个数据
 */
public class Demo06 {
	public static void main(String[] args) {
		Product p = new Product();
		
		Createer c = new Createer(p);
		Consumer co= new Consumer(p);
		
		c.start();
		co.start();
	}
}

//定义缓冲区
class Product{
	
	String productName;
	/*
	 *标志灯法：
	 *		flag =true 生成者开始生产，消费者等待
	 *		flag = false  生成者等待，消费者消费
	 *
	 *wait() ： Obeject提供的此方法，
	 *		       在某个方法中调用了wait方法，
	 *         则会使得调用该方法的 线程   把对象的控制权交出去（即释放锁），
	 *         然后处于等待状态
	 *notify() ： 该方法会通知 某个正在等待这个对象
	 *           的控制权的的线程可以继续运行,即唤醒前一个被wait的线程
	 */
	private boolean flag = true;
	
	//生成者生产，消费者等待
	public synchronized void creat(String productName) {
		if(!flag) { //  flag值为fasle时，生成者暂停
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("生成者线程"+Thread.currentThread().getName()
				+"开始生产产品。。。。");
		this.productName = productName;
		System.out.println("产品"+this.productName+"生产完毕。。。。");
	
		//唤醒消费者
		this.notify();
		
		//将标志位设置为false，此时生产者会陷入等待状态
		this.flag=false;
	}
	
	//消费者消费，生成者停止
	public synchronized void consume() {
	
		if(flag) { // falg为true消费者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("消费者线程"+
				Thread.currentThread().getName()+"消费"+productName);
		System.out.println("消费完毕。。。。。");
		System.out.println("------------------------");
		
		//唤醒生产者线程
		this.notify();
		
		//将标志位设置为true，消费者停止
		flag = true;
	}
	
		
	
}


//生成者
class Createer extends Thread{
	private Product product;

	public Createer(Product product) {
		super();
		this.product = product;
	}
	
	public void run() {
		for (int i = 0; i <10; i++) {
//			System.out.println("生成者已经生产第"+i+"个产品");
//			product.productName="产品"+i;
			
			product.creat("产品"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} 

//消费者
class Consumer extends Thread{
	private Product product;

	public Consumer(Product product) {
		this.product = product;
	}
	
	public void run() {
		for (int i = 0; i <10; i++) {
//			System.out.println("消费者消费 "+product.productName);
			
			product.consume();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} 