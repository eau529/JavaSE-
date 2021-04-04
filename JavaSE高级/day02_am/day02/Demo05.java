package day02;
/**
 * 包装类和 String的相互转换
 */
public class Demo05 {
	public static void main(String[] args) {
		/*
		 * 	字符串转包装类：
		 * 		包装类都提供了对应的静态方法 parseXX(),
		 * 		 可以将字符串转成对应的基本类型，
		 * 		使用的时候需要注意： 给定的字符串数据必须和 当前基本类型兼容，
		 * 		否则会报转换异常 NumberFormatException
		 */
		String str="123";
		int i=Integer.parseInt(str);
		System.out.println("i:"+i);
		
		String str1="123.5";
		//此处报错：NumberFormatException 
		int i1=Integer.parseInt(str1);
		System.out.println("i1:"+i1);
		
		
		/*
		 * 包装类转字符串：
		 * 		本身的toString()可以实现
		 * 		String 提供的valueOf(Object obj)也可以实现
		 */
		String str2=Integer.toString(19);
		
	}
}
