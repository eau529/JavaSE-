/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**   
 *  java 的自动垃圾回收机制
 *		 当一个对象没有被引用变量所指向时，此时jvm则认为该对象是被需要的，
 *		 其会被jvm当“垃圾”回收（释放它所占的内存空间），
 *		 垃圾回收机制由jvm自己进行，不需要人为操纵。
 *	
 */
public class Demo04 {
	/*
	 * 父类Object 提供的方法，当有垃圾被回收时会调用此方法
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		
		System.out.println(this+"被回收了");
	}
	
	
	public void test() {
		
	}

	public static void main(String[] args) {
		Demo04 demo=new Demo04();
		demo.test();
		
		System.out.println("demo:"+demo);
		demo=null;
		//System.gc() 当前强制进行垃圾回收
		System.gc();
	}
}
