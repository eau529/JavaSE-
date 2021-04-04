package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *Comparable的缺点： 
 * 	  使用Comparable接口来实现排序规则时，会对已经写好的代码造成一定的的侵入性，
 * 	  因为在使用它时，会强制要求我们实现指定的CompareTo()。
 * 	  侵入性： 指定的是我们要使用某个程序提供的功能，需要对已经定义好的类进行改变。
 * 
 * 使用自定义比较器：
 * 	  Collections的sort()有一个重载方法，在我们进行元素排序时，
 * 	   允许我们单独传一个自定义的比较器，且此时集合中的元素不用实现Comparable接口
 */
public class Demo01 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("fewfrw");
		list.add("w");
		list.add("dfsdfw");
		list.add("aaw");
//		Collections.sort(list, new MyCompartor());
//		System.out.println(list);
		
		//通过匿名内部类来实现自定义排序规则
		Comparator<String> myComparator=new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		Collections.sort(list,myComparator);
		System.out.println(list);
	}
}

//针对 String 自定义排序规则
class MyCompartor implements Comparator<String>{
	/*
	 * 该方法的比较也是和  CompareTo()是一样的，只关心返回的int的取值范围
	 */
	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
}



