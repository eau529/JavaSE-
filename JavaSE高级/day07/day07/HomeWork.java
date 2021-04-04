/**
 * <p>Title: HomeWork.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**  
 * @ClassName: HomeWork  
 * @Description: TODO 
 * @author: chenfan  
 * @date: 2018年11月21日  
 *  
 */
public class HomeWork {
	public static void main(String[] args) {
//		Vector<Integer> v = new Vector();
//		for (int i = 0; i < 10; i++)
//		v.add(new Integer(i));
//		//System.out.println(v);
//		Enumeration<Integer> e = v.elements();
//		while (e.hasMoreElements()) {
//			Integer i = (Integer) e.nextElement();
//			System.out.println(i );
//			v.remove(i);
//		}
//		System.out.println(v.size());
		
		
		
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		
//		List<String> list1=new ArrayList<>();
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		List subList=list.subList(2, 5);

		list.removeAll(subList);
		
		System.out.println(subList);
		System.out.println(list);
		
		
		
//		   HashMap<String,String> hm = new HashMap();
//			hm.put("1", "one");
//			hm.put("2", "two");
//			hm.put("3", "one");
//			hm.keySet().iterator();
	}
}
