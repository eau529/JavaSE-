/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**  
 *  Map的遍历，常用有三种遍历方式：
 *		1、遍历所有的key
 *		2、遍历所有的value
 *		3、遍历所有的key-value
 */
public class Demo05 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("语文", 99);
		map.put("数学", 130);
		map.put("英语", 100);		
		
		/*
		 * 1、  Set keySet() 遍历当前map所有的key，并以set集合的形式返回
		 */
		Set<String> keys=map.keySet();
		for (String key : keys) {
			Integer value=map.get(key);
			System.out.println(key + " = "+ value);
		}
		
		/*
		 * 2、 Collection values() 遍历所有的value值并存入集合中
		 */
		Collection<Integer> values=map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		/*
		 *3、遍历所有的 key-value
		 *	Set<entry>	entrySet()
		 *		在map中，每一组键值对都是由一个Entry实例来保存的，
		 *		该Entry类为Map中的内部类，
		 *		该类中有key 和value两个属性值，
		 *		且有对应的getKey和getValue方法 来获取他们
		 *
		 *	entrySet()相当于将若干的entry实例存入set集合并返回	
		 */
		Set<Entry<String, Integer>> entrySets=map.entrySet();
		
		for (Entry<String, Integer> entry : entrySets) {
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(key+"="+value);
		}	
	}
	
	
}
