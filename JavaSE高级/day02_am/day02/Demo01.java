/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 3、String substring(int start,int end)
		 * 		截取当前的字符串，start为起始位置，end为结束位置，
		 * 		注： 截取的时候，含头不含尾
		 * 
		 * 	 String substring(int start)
		 * 		从当前位置一直截取到末尾	
		 */
		String str="hhfudx";
		String subStr1=str.substring(1, 4);
		System.out.println("subStr1:"+subStr1);
		
		String subStr2=str.substring(2);
		System.out.println("subStr2:"+subStr2);
		
		/*
		 * 4、trim() 去取字符串两边的空格,并将去除空格的字符串返回
		 */
		String strx="    djfis";
		System.out.println("strx:"+strx);
		strx=strx.trim();
		System.out.println("strx:"+strx);
		
		/*
		 *5、 boolean startWith(String regxStr)
		 * 	  boolean endstWith(String regxStr)
		 * 判断当前字符串是否是以给定的字符串开头或则结尾，
		 * 是则返回true，否则返回false
		 */
		String strs="hlleo World";
		boolean isTrue1=strs.startsWith("hl");
		System.out.println("isTrue1:"+isTrue1);
	
		boolean isTrue2=strs.endsWith("hl");
		System.out.println("isTrue2:"+isTrue2);
		
		/*
		 * 6、charAt(int index) 取出当前字符串中满足下标的字符
		 * 	  toCharArray() 将当前字符串变成字符数组并返回
		 */
		
		/*
		 * 7、toUpperCase()
		 *    toLowerCase()
		 *   将当前字符串转成全都大写或者全小写
		 */
		String stru="sdfsdUYT";
		stru=stru.toUpperCase();
		System.out.println("stru:"+stru);
		
		stru=stru.toLowerCase();
		System.out.println("stru:"+stru);
		
		/*
		 * 8、String 提供了多个重载的valueOf()
		 * 	  作用是为了可以将java的其他类型的数据转成字符串
		 */
		int x=1778;
		String strv=String.valueOf(x);
		System.out.println("strv:"+strv);
	}
}
