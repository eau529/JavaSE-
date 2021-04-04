/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**  
 * 集合和数组之间的相互转换
 */
public class Demo06 {
	public static void main(String[] args) {
		/*
		 * 集合------------>数组
		 * 	  在集合Collection中提供集合转数组的相应方法，
		 *   所以任何集合都可以转成数组。
		 */
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		/*
		 * toArray() 用于返回一个Obeject 数组
		 * 
		 * toArray(T[] tArr) 返回一个指定类型的数组（常用）
		 */
		Integer[] intArr=list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(intArr));
		
		
		
		/*
		 * 数组--------->集合
		 * 		通过数组工具类Arrays提供的  asList(T[] arrT)实现
		 * 		数组转集合，只能转成对应的list集合
		 */
		String[] strArr= {"一","二","三"};
		List<String> listStr=Arrays.asList(strArr);
		System.out.println(listStr);
		
		/*
		 * 数组转集合以后， 对数组的操作就是对集合元素的操作，
		 * 				  同样对集合元素的操作也是  数组元素的操作
		 * 	
		 * 	但是此时该list集合不能新增元素。
		 */
		strArr[1]="2";
		System.out.println(listStr);
	}
}
