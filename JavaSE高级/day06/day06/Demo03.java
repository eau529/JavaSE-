/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

import java.util.Deque;
import java.util.LinkedList;

/**  
 *  双端队列Deque： 两端都可以实现元素进或者出的队列，
 *				      更多的时候我们会用双端队列来实现栈
 */
public class Demo03 {
	public static void main(String[] args) {
		Deque<String> stack=new LinkedList<>();
		/*
		 * 1、push() 向栈中压入元素,压入成功则返回true
		 */
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		System.out.println(stack);
		
		/*
		 * 2、pop() 出栈操作，从栈首取出元素
		 * 	
		 * 	  peek()只是获取栈首元素，但是不删除
		 */
		String str=stack.pop();
		System.out.println("str:"+str);
		System.out.println(stack);
		
		String str1=stack.peek();
		System.out.println("str1:"+str1);
		System.out.println(stack);
		
	}
}
