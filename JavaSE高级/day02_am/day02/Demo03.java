/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

public class Demo03 {
	/*
	 *包装类：
	 *	为了解决  基本类型的数据不能参数 面向对象开发的问题，
	 *	比如说 将String str="123"转成整数的 123，或者集合中只能存放Object数据，
	 *	此时我们就需要使用到包装类
	 *
	 *	每个对应的基本数据类型都有其对应的包装类，
	 *	除了 int的包装类为 Integer ，char的包装类为 Character，
	 *	其余基本类型的包装类都是 首字母大写
	 */
	public static void main(String[] args) {
		Integer in=new Integer(1);
		System.out.println(in);
		Long lo=new Long(124);
		System.out.println(lo);
		
		
		/*
		 * 将包装类转成对应的基本类型
		 * 		通过包装类提供额xxValue()实现
		 */
		int x=in.intValue();
		
		/*
		 * 将基本数据类型转成包装类:
		 * 	每个包装类都提供了对应的valueOf()，
		 * 	可以将基本数据类型转成对应的包装类
		 */
		boolean b=false;
		Boolean bs=Boolean.valueOf(b);
		
	}
}
