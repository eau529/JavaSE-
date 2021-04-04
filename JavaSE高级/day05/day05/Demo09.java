/**
 * <p>Title: Demo09.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  集合遍历的3种方式：
 *  	for循环， 
 *  	foreach  (底层是通过迭代器实现的)
 *  	迭代器
 */
public class Demo09 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
//		list.add(4);
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
//		System.out.println(list);
		
		
		/*
		 * 快速失败（fail-fast）
		 * 		指的是在使用迭代器对集合进行遍历时，
		 * 		在遍历的过程中通过集合提供的方法对
		 * 		集合进行了 线性结构修改（增删元素），则会抛出 ConcurrentModificationException异常。
		 * 
		 * 	在集合的遍历过程中会使用到modCount变量，如果集合在被遍历期间发生变化，
		 *  该值都会改变， 同时我们在使用迭代器的时候， 该值会同时被赋值给迭代器中expectedModCount变量，
		 *  当我们使用迭代器通过hasnext和next进行遍历下一个元素时，
		 *  都会先检查modCount 和 expectedModCount 是否不相等，如果不相等则抛出异常，
		 *  相等就继续遍历
		 *  
		 *  使用expectedModCount的目的是为了保证在使用迭代器期间，
		 *  对集合元素的操作只能通过迭代器来实现，并且保证只能是当前迭代器进行，
		 *  所以 java.util包的迭代器都只能在单线程下使用。
		 *  
		 */
		for (Integer in:list) {
			list.remove(0);	
			System.out.println(in);
		}
		
	}
}
