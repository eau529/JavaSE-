/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day01;

/**  
 * 字符串的常见使用方式：
 * 		字符在创建时，一般推荐使用字面量的形式创建字符串，
 * 		 即 String str="abc" 的形式，
 * 
 * 		该种方式创建的字符串会存在于字符串常量池中，
 * 		常量池中的同一个字符串只会存在一份，
 * 		即 当我们创建字符串时，程序会先去字符串常量池检测该字符串是否已经存在，
 * 		如果存在，则重用该字符串对象，即把此字符串也赋值给新的变量,从而减少内存开销
 * 
 * 		所以，字符串子在常量池一旦被创建，就不可再被更改
 */
public class Demo03 {
	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		System.out.println("str1==str2:"+(str1==str2));
		
		str2="abcd";
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		
		//会在堆中和 字符串常量池中 都创建abc 字符串
		String str3=new String("abc");
		System.out.println("str1==str3:"+(str1==str3));
		
		//此处编译器会自动将"ab"+"c"先拼接成 abc
		String str4="ab"+"c";
		System.out.println("str1==str4:"+(str1==str4));
	
		
		/*
		 *   此处代码在运行时，  因为str5为变量，  
		 *   所以 str5+"c" 的具体值肯定在 编译期是无法确定的，
		 *   
		 *   那么在程序运行时，jvm会先创建一个StringBuilder对象，
		 *   然后调用他的append() 将 str5  和  "c"进行字符串的合并，
		 *   然后再调用StringBuilder的toString将得到的新的字符串"abc"，在堆中创建String对象并存入。
		 *   然后在把这个地址赋值  str6。
		 *   
		 */
		String str5="ab";
		String str6=str5+"c";
		System.out.println("str1==str6:"+(str1==str6));
	}
}
