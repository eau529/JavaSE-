/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

public class Demo04 {
	public static void main(String[] args) {
		int[] arrInt=null;
		/*
		 * 当复合数据类型的引用变量的值为 null时， 
		 * 不能使用该变量调用方法和属性，
		 * 否则会报 NullPointerException空指针异常的错误
		 */
		int length=arrInt.length;
		System.out.println(length);
	}
}
