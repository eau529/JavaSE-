/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day01;

//String 中的常见方法
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 1、int index(String subStr)
		 * 	   查看给定子字符串在当前字符串中第一次出现的位置,下标从0开始,
		 * 	 如果未找到，则返回-1
		 */
		String str="good good study";
		int index1=str.indexOf("od");
		System.out.println("index1:"+index1);
		index1=str.indexOf("xyy");
		System.out.println("index1:"+index1);
		
		/*
		 * 该方法提供了多个重载的方法：
		 * 		int index(String subStr,int startIndex)
		 * 		从给定起始位置startIndex处开始找起，子字符串第一次出现的位置
		 */
		int index2=str.indexOf("od",3);
		System.out.println("index2:"+index2);
		
		/*
		 * 2、int lastIndexOf(String str)
		 * 		返回子字符串最后一次出现的位置
		 */
		int index3=str.lastIndexOf("od");
		System.out.println("index3:"+index3);
		
		/*
		 * indexOf(int ch)
		 * 		参数ch为 char类型的int值，
		 * 		返回此字符在当前字符串中出现的第一次的位置
		 */
		int xs=str.indexOf(2);
		System.out.println("xs:"+xs);
		

	}
}
