/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.ArrayList;
import java.util.Collection;

//集合中的批量操作方法
public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 1、removeAll(Collection c)
		 * 		删除当前集合中   与给定的集合相匹配的所有元素
		 */
		Collection c1=new ArrayList(); 
		c1.add("一");
		c1.add("二");
		c1.add("三");
		c1.add("三");
		Collection c2=new ArrayList(); 
		c2.add("三");

		c1.removeAll(c2);
		System.out.println(c1);
		
		/*
		 * 2、addAll(Collection c)
		 * 	 将给定元素中所有的元素 都添加到当前集合中
		 */
		Collection c3=new ArrayList(); 
		c3.add(1);
		c3.add(2);
		c3.add(3);
		c1.addAll(c3);
		System.out.println(c1);
		
		/*
		 *3、containsAll(Collection c)
		 *		判断给定集合中的元素是否都在当前集合中
		 *		
		 */
		Collection c4=new ArrayList();
		c4.add(1);
		c4.add("一");
		boolean isTrue=c1.containsAll(c4);
		System.out.println(isTrue);
	}
}
