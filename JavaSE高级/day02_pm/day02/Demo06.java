/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;
public class Demo06 {
	public static void main(String[] args) {
		/*
		 * byte short int long float double 
		 * 	 这几个数值类型的包装类都继承至 Number抽象类，
		 * 	 该类中定义了一系列的 允许这些数值之间相互转换的方法
		 */
		Integer in=18;
		double b=in.doubleValue();
		System.out.println("b:"+b);
		
		Double d=12.3;
		int x=d.intValue();
		System.out.println("x:"+x);
	}
}
