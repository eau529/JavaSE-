/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day01;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * String 字符串：
		 * 		其提供了丰富的构造函数，方便我们构建字符串。
		 * 	
		 * 注：	String 中已经重写了  toString()以及 equals()
		 */
		//字符串创建方式1
		String str1=new String("abc");
		System.out.println("str1:"+str1);
		//字符串创建方式2
		String str2=new String(new char[] {'a','b','c'});
		System.out.println("str2:"+str2);
		
		//字符串创建方式3
		String str3=new String(new byte[] {97,98,99});
		System.out.println("str3:"+str3);
		
		/*
		 * 字符串创建方式4:
		 * 	String(byte[] bytes, int offset, int length) 
		 * 		bytes: 要转成字符串的字节数组
		 * 		offset: 从字节数组指定的位置开始，转成对应的字符串，下标从0开始
		 * 		length： 要转码的字节的个数
		 */
		byte[] bytes= {99,100,101};
		String str4=new String(bytes,1, 2); 
		System.out.println("str4:"+str4);
	}
}
