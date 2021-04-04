/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

/**  
 * 死锁：   同步方法使用不当会造成死锁
 *        比如：  有当前有两个线程去访问两个带有synchronized方法的 对象，
 *        
 *        		线程1需要  先要将对象 A锁好以后，再去锁对象B
 *        		线程2需要  先要将对象 B锁好以后，再去锁对象A
 *        
 *       	但是此过程中， 线程1先锁好了A ，去锁B时 发现线程2已经将B上锁，
 */
public class Demo05 {
	public static void main(String[] args) {
		Object goods = new Object();
		Object money = new Object();
		
		ClassF f = new ClassF(goods,money);
		ClassE e = new ClassE(goods,money);
		
		Thread th1 = new Thread(f);
		Thread th2 = new Thread(e);
		
		th1.start();
		th2.start();
	}
}

class ClassF implements Runnable{
	Object goods;
	Object money;
	
	public ClassF(Object goods,Object money) {
		this.goods = goods;
		this.money = money;
	}
	
	@Override
	public void run() {
		while(true) {
			//锁goods对象
			synchronized (goods) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("我手里有goods，请先把money给我。。。");
				synchronized (money) {
					
				}
				
			}
		}
		
	}
}

class ClassE implements Runnable{
	Object goods;
	Object money;
	
	public ClassE(Object goods,Object money) {
		this.goods = goods;
		this.money = money;
	}
	
	@Override
	public void run() {
		while(true) {
			//锁goods对象
			synchronized (money) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				
				System.out.println("我手里有money，请先把goods给我。。。");
				synchronized (goods) {
					System.out.println("锁定了goods。。。");
				}
				
			}
		}
		
	}
	
}

