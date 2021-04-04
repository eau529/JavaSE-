/**
 * <p>Title: Demo04.java</p>  
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
 * 截取List子集合
 */
public class Demo04 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i <10; i++) {
			list.add(i);
		}
	
		/*
		 * list.subList(int fromIndex, int toIndex)
		 * 		截取当前集合中子集，fromIndex起始下标，toIndex结束下标
		 * 		注意： 截取时含头不含尾
		 * 
		 * 	subList截取时，它截取的是 原来父集合中fromIndex~toIndex这一段的视图，
		 * 		    即子集合是靠父集合支撑显示的。
		 * 		 所以当截取以后，我们可以对子集合做 线性结构修改 和 非线性结构修改，
		 * 					       但是只能对 父集合做非线性结构修改
		 *  	
		 *  	线性结构修改： 会涉及到集合长度大小的修改
		 *  	非线性结构修改：只是修改值， 不涉及到集合长度大小的修改
		 */
		List<Integer> subList=list.subList(3, 6);
		System.out.println(subList);
		
		// 将子集合中的元素扩大10倍
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i,subList.get(i)*10);
		}
		System.out.println("subList："+subList);
		System.out.println("list: "+list);
		
		//删除子集合中的某个元素
		subList.remove(1);
		System.out.println("subList："+subList);
		System.out.println("list: "+list);
		
		//向子集合中增加元素
		subList.add(1000);
		System.out.println("subList："+subList);
		System.out.println("list: "+list);
		
		//修改父集合中的元素
		list.set(3, 300);
		System.out.println("subList："+subList);
		
		//删除父集合中的元素
//		list.remove(3);
//		System.out.println("subList："+subList);
		
		//增加父集合中的元素
//		list.add(100000);
//		System.out.println("subList："+subList);
	}
	
}
