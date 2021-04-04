/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 *不同数据类型的数组的默认值
		 */
		
		//1、 整数类型 0
		int[] arrInt=new int[3];
		// Arrays.toString()  将数组中的内容转成字符串并返回
		System.out.println(Arrays.toString(arrInt));
		
		//2、浮点数 0.0
		double[] arrD=new double[3];
		System.out.println(Arrays.toString(arrD));
		
		//3、boolean类型  false
		boolean[] arrB=new boolean[8];
		System.out.println(Arrays.toString(arrB));
		
		// 4、char字符类型 ： 空字符
		char[] arrCh=new char[4];
		System.out.println(Arrays.toString(arrCh));
		
		// 5、复合数据类型：   null
		String[] arrStr=new String[4];
		System.out.println(Arrays.toString(arrStr));
		
		
	}
}
