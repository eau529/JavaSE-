/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

import java.util.Stack;

/**  
 *  Vector : 和ArrayList一样,底层也是基于数组实现，	
 *			  只不过该类是线程安全的，
 *			 即在单线程操作集合情况下我们是使用ArrayList
 *			 在多线程情况下操作集合，我们使用Vector
 *	
 *	其子类为stack栈：
 *		  在stack中提供了五个额外的方法，可以使得Vector当做栈来使用，
 *		  基本方法为 push  pop  peek  empty  serach
 */
public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 栈： 桶装结构， 原则是先进后出，设计比较古老，不怎么推荐使用
		 */
		Stack<Integer> stack=new Stack<>();
		//1、push向栈中压入元素 
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		
		//2、访问栈的中元素（栈是没有迭代器）
		/*
		 * 2.1 pop 查看栈顶的元素，并且会将栈顶的元素删除,
		 * 			如果没有元素则抛出 EmptyStackException 
		 */
		int x=stack.pop();
		System.out.println("栈顶的元素为： "+x);
		
		/*
		 * 2.2 peek() 查看栈顶的元素并返回，但是不会将栈顶的元素删除
		 * 			如果没有元素则抛出 EmptyStackException 
		 */
		int x1=stack.peek();
		int x2=stack.peek();
		System.out.println("栈顶的元素为：x1= "+x1);
		System.out.println("栈顶的元素为：x2= "+x2);
		
		/*
		 *3、判断当前stack栈是否为空
		 */
		boolean isEmpty=stack.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		
		/*
		 * 4、search(Object obj)返回给定的元素在栈中的位置 
		 */
		int index=stack.search(1);
		System.out.println("1在栈中的位置:"+index);
		
	}
}
