/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**  
 *  Collections的 sort排序原理:
 *		当我们使用sort对集合中的元素进行排序时，
 *		会要求当前集合中的元素是实现了Comparable排序接口的。
 *		然后sort排序时就会按照指定的排序规则来进行。
 */
public class Demo07 {
	public static void main(String[] args) {
		List<Point> list=new ArrayList<>();
		list.add(new Point(1,1));
		list.add(new Point(0,1));
		list.add(new Point(1,0));
		list.add(new Point(1,2));
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}

class Point implements Comparable<Point>{
	public int x;
	public int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * compareTo方法用来我们自定义排序规则，
	 * 	
	 * 	 该方法会将调用当方法的对象   和  传入的对象进行比较，
	 * 	 此方法在执行时会返回一个int值，但是我们不用去关心该的具体数值是多少，
	 *   只需关心该值的取值范围：
	 *   （1）当返回值  > 0   说明当前对象 大于  给定参数 ， sort排序时将当前对象向后排
	 *   （2）当返回值 = 0    说明当前对象 = 给定参数
	 *   （3） 当返回值 < 0   说明  当前对象 小于  给定参数， sort排序时将当前对象向前排
	 */
	@Override
	public int compareTo(Point o) {
		int thisLen=this.x*this.x + this.y*this.y;
		int otherLen=o.x*o.x+o.y+o.y;
		
		return thisLen-otherLen;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
