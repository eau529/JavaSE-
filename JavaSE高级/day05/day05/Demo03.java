/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.ArrayList;
import java.util.List;

/**  
 * Collection的子类：
 * 		 1、List集合   有序可重复集
 * 		 2、Set集合     无序不可重复集
 *
 * java.util.List  是 Collection的子类，其常见实现类有：
 * 			 ArrayList    底层基于数组实现，对元素遍历获取的效率最高
 * 			 LinkedList	    底层基于双向链表实现，对元素增删效率较高。
 *  
 */
public class Demo03 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		//add(Object obj)向当前元素的末尾追加元素
		list.add(1);
		list.add(2);
		list.add(3);

		/*
		 *1、 E get(int index) 通过指定的下标来获取对应的元素，
		 * 				        下标从0开始
		 */
		int i=list.get(2);
		System.out.println(i);
		
		/*
		 * 2、add(int index,Object obj)
		 * 		向指定的位置处插入元素
		 */
		list.add(1, 10);
		System.out.println(list);
		
		/*
		 * 3、E set(int index,Object obj)
		 * 			用户给定的元素替换当list集合中指定位置的元素，
		 * 			并且将被替换的元素返回
		 */
		int ii=list.set(1, 100);
		System.out.println(list);
		System.out.println("ii:"+ii);
		
		/*
		 *4、  E remove(int index) ，删除指定下标的元素
		 *	  E remove(Object obj)， 删除当前集合中给定元素
		 *
		 *	删除时会将被删除的元素返回
		 */
		list.remove(1);
		System.out.println(list);
		
		/*
		 *5、 int  indexOf(Object obj)
		 *			返回给定元素第一次出现的下标 ,不存在则返回-1
		 *
		 *	 int  lastIndexOf(Object o) 
		 *			返回给定的元素最后一次出现的下标，不存在则返回-1
		 */
		int index=list.indexOf(3);
		System.out.println(index);
	}
}
