/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

import java.util.LinkedList;
import java.util.Queue;

/**  
 * 队列(管状结构)：
 *		Queue: 存储一组元素，元素存取按照 先进先出的原则，
 *			    元素只能够通过队尾进， 队首出，所以对于队列来说总是首位增删元素。
 *			队列的常见实现子类是 LinkedList
 */
public class Demo02 {
	public static void main(String[] args) {
		Queue<String>  queue=new LinkedList<>();
		/*
		 * 1、向队列中添加元素：
		 * 		add()    向队列末尾追加一个元素，当队列已满时，则抛出一个异常
		 * 		offer()  向队列末尾追加一个元素，队列已满，则抛出false
		 */
		queue.add("1");
		queue.offer("2");
		queue.offer("3");
		queue.offer("4");
		System.out.println(queue);
		
		/*
		 * 2、取出队列中的元素
		 * 	   2.1 poll() 从队列中取出元素，并且删除
		 * 				    如果队列为空，则返回null
		 * 	   2.2 peek() 从队列中取出元素，不删除
		 * 				   如果队列为空，则返回null
		 * 	   2.3 remove()  移除队首的元素并返回，但是如果队列为空则抛出异常。
		 */
		String str1=queue.poll();
		String str2=queue.peek();
		String str3=queue.remove();
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		
	}
}
