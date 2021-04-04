/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**  
 * 迭代器实现集合元素的遍历
 *  	Iterator  ：迭代器接口，所有的集合类都实现了该接口，
 *					并且带有iterator(), 作用是返回一个对应类型的迭代器。
 *			  
 */
public class Demo07 {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		
		/*
		 * 获取迭代器：
		 * 		
		 */
		Iterator<Integer> iterator=set.iterator();
		
		/*
		 * hasNext() 判断还有下一个元素能被取出
		 */
		while(iterator.hasNext()) {
			
			
			//next()取出下一个元素
			Integer in=iterator.next();
			
			System.out.println(in);
			
			/*
			 * 在使用迭代器遍历元素的过程中，一般不建议使用
			 * 集合自带的remove()来进行元素的删除，否则会抛出异常。
			 * 
			 * 想要删除元素，建议使用Iterator提供的删除元素的方法
			 */
			if(new Integer(3).equals(in)) {
				//调用迭代器的方法进行删除元素
				iterator.remove();
				
				//调用集合方法进元素的增删都不可以
//				set.remove(3);
//				set.add(8);
			}
		}
		
		System.out.println(set);
	}
}
