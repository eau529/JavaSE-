/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**  
 *  集合中的排序：
 *		我们可以使用集合工具类Collections提供的静态方法sort来实现自然排序，
 *		即元素从小到大排序
 */
public class Demo06 {
	public static void main(String[] args) {
		/*
		 * sort(List<T> list) 仅能实现对list集合进行排序
		 */
		List<Integer> list1=new ArrayList<>();
		list1.add(4);
		list1.add(7);
		list1.add(3);
		list1.add(8);
		Collections.sort(list1);
		System.out.println(list1);
		
		//对于字符串，是按照每个字符的Unicode的值大小排
		List<String> list2=new ArrayList<>();
		list2.add("hbcf");
		list2.add("cf");
		list2.add("abcf");
		list2.add("abhy");
		Collections.sort(list2);
		System.out.println(list2);
		
	}
}
