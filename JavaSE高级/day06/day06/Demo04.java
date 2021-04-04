/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

import java.util.HashMap;
import java.util.Map;

/**  
 *  Map ：以key-value的形式来存放数据，并且存储时map要求key不可以重复，
 *		   其会自动调用 key的equals方法来进行检测。
 *	其有两个常见实现类：
 *		HashMap   线程不安全的， 适合单线程情况下使用，效率高
 *		HashTable 线程安全，适合在多线程情况下使用，效率低
 */
public class Demo04 {
	public static void main(String[] args) {
		Map<String,Integer> score=new HashMap<>();
		/*
		 * 1、put(K key,V value)
		 * 		向map中存入一组键值对，
		 * 		此时key不可以重复，如果重复，则进行的是对应的value值的替换操作，
		 * 		
		 * 		返回值： 如果key不重复返回null，如果重复返回的是被替换的value
		 * 	
		 * 	    获取返回的值的时候要注意，如果我们使用基本数据类型去接收，
		 * 	    需要注意主动拆箱机制带来的NullPointerException
		 */
		score.put("语文", 99);
		score.put("数学", 130);
		Integer english1=score.put("英语", 100);		
		Integer english2=score.put("英语", 60);
		
		System.out.println(score);
		System.out.println("english1 :"+english1);
		System.out.println("english2 :"+english2);
		
		/*
		 * 2、 get(K key)
		 * 		通过指定的key来获取对应的value值
		 * 		如果key不存在，则返回null
		 */
		int value=score.get("语文");
		System.out.println("value: "+value);
		
		/*
		 *3、  containsKey(K key)     
		 *    containsValue(V value) 
		 *  查看当前map中是否存在给定的key 或者 value，存在则返回true
		 */
		boolean isTrue=score.containsKey("数学");
		System.out.println("isTrue:"+isTrue);
		
		/*
		 * 4、remove(K k)
		 * 		根据指定的key删除对应的元素，并将相应的元素返回
		 */
		Integer english3=score.remove("英语");
		System.out.println("english3:"+english3);
		System.out.println(score);
		
		/*
		 * isEmpty() 判断当前Map是否为空
		 * clear()   清空当前Map
		 * putAll(Map map) 将给定的Map的源加入当前map中
		 */
		score.clear();
		System.out.println("当前map是否为空map： "+score.isEmpty());
		
		Map<String,Integer> score1=new HashMap<>();
		score1.put("化学", 98);
		score1.put("物理", 88);
		score.putAll(score1);
		System.out.println(score);
	}
}
