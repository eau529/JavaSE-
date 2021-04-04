/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator 双向迭代器，只有list集合才有
 */
public class Demo08 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("一");
		list.add("二");
		list.add("三");
		list.add("四");
		ListIterator<String> listiIt=list.listIterator();
		
		//从前向后正序遍历
		while(listiIt.hasNext()) {
			System.out.println("游标位置："+listiIt.nextIndex());
			System.out.println(listiIt.next());
		}
		System.out.println("-------------------------");
		
		
		/*
		 *  从后向前逆序遍历
		 *  	hasPrevious() 判断是否还有上一个元素
		 *  
		 *  注意：在访问迭代器的游标处于初始位置0，
		 *		如果逆序访问，游标的位置先需要向下移动
		 */
		while(listiIt.hasPrevious()) {
			String str=listiIt.previous();
			
			System.out.println("游标位置："+listiIt.previousIndex());
			// 取出上一个元素
			System.out.println(str);
			
			/*
			 * 在ListIterator除了对元素的访问操作的方法，
			 * 
			 * 		还提供了额外的set(E e)  用指定元素替换 next 或 previous 返回的最后一个元素（可选操作）。
			 * 					 add(E e)  将指定的元素插入列表（可选操作）。
			 */
			if("三".equals(str)) {
				listiIt.set("3");
				listiIt.add("叁");	
			}
		}
		System.out.println(list);
	}
}
