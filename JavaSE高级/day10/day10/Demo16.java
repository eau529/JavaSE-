/**
 * <p>Title: Demo16.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

public class Demo16 {
	
	int a=10;
	
	public static void main(String[] args) {
		Demo16 demo = new Demo16();
		
		Thread th1 = new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					int x= demo.a;
					x--;
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					demo.a=x;
					System.out.println("th1访问了demo.a以后a的值为："+demo.a);
				}
				
			}
		};
		Thread th2 = new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					int x= demo.a;
					x--;
	
					demo.a=x;
					System.out.println("th2访问了demo.a以后a的值为："+demo.a);
				}
			}
		};
		
		th1.start();
		th2.start();
	}
}
