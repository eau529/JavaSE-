/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;
public class Demo01 {
	public static int k=0;
	public static Demo01  d1=new Demo01("d1");
	public static Demo01  d2=new Demo01("d2");
	public static int i = print("i");  
	public static int n = 99;
	public int j = print("j");
	static{  
		print("静态块");  
	}
	{   
		print("构造块");       
	
	}
	public Demo01(String str) {
		System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
	    ++n;
	    ++i;
	}		
	public static int print(String str) {
	    System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
	    ++i;
	    return ++n;
	}
	public static void main(String[] args) {
		Demo01 demo=new Demo01("创建对象");
	}   
}
