/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

import java.util.ArrayList;
import java.util.Collection;

/**  
 *  集合（容器）： 用来存放多个数据，相对数组而言，牺牲一定性能上的优势，
 *		  换取我们对集合中的元素的简便操作，即对元素的增删操作
 *
 *  所有集合的父类Collection,该类是一个抽象类
 */
public class Demo01 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		//1、 add(Object obj) 向集合中添加元素
		c.add("one");
		c.add(1);
		c.add(1);
		c.add(true);
		c.add(true);
		
		//2、size()获取集合大小 
		System.out.println("当前集合大小："+c.size());
		
		/*
		 * 3、remove(Obeject obj)删除元素,会自动调用equal方法来进行判断，
		 *    注意删除时，只会删除第一个匹配到的元素
		 */
		c.remove(true);
		System.out.println(c);
		
		/*
		 * 4、contains(Object obj)
		 * 		判断给定的元素 是否在集合中存在， 存在则返回true。
		 * 		判断时会自动调用equals方法来判断
		 */
		boolean b=c.contains("one");
		System.out.println("b:"+b);
		
		/*
		 *5、 isEmpty() 判断当前集合是否为空
		 *   clear() 清除当前集合中所有的元素
		 */
		c.clear();
		System.out.println("c.isEmpty():"+c.isEmpty());
		
	}
}
