/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day01;

public class Demo01 {
	int calssNo;
	String className;
	public Demo01(int calssNo, String className) {
		super();
		this.calssNo = calssNo;
		this.className = className;
	}
	
	//重写Object的toString方法
	@Override
	public String toString() {
		return "Demo01 [calssNo=" + calssNo + ", className=" + className + "]";
	}
	public static void main(String[] args) {
		/*
		 * java中所有的类都默认直接或者间接继承  Object类，
		 * 继承后即可以使用其提供的一些方法
		 */
		
		/*
		 * 1、toString() : Object提供的方法，其会返回一个字符串，
		 * 					默认格式为： 全类名@hashcode码,表示当前对象在堆内存中的地址。
		 * 			 其原本目的是为了返回一个能描述当前对象信息的一个字符串，
		 * 			  所以在使用时，一般需要我们对其重写
		 */
		Demo01 demo=new Demo01(1808,"javaSE");
		System.out.println(demo.toString());
		
		/*
		 * 2、euqals():  用来进行两个对象之间内容的比较，
		 * 				相等则返回true，否则返回false
		 * 		Object提供的该方法，内部默认实现是 对两个对象进行“==”比较，即还是比较的两个对象的地址，
		 * 				所以我们使用该方法时需要对其重写
		 */
		Point p1=new Point(1,1);
		Point p2=new Point(1,1);
		
		boolean isTrue=p1.equals(p2);
		System.out.println("isTrue:"+isTrue);
		
		/*
		 * 3、一般重写了euqals(), 也建议重写hashCode();
		 * 	  	该方法会返回当前对象一个散列码，
		 * 	  	目的是为了更好的支持基于Hash机制的java集合类，
		 *  如:Hashtable,HashMap,Hashset
		 * 	
		 * 	比如在  HashMap存在上百万的点坐标对象，
		 * 	现在我们给定一个坐标，要求从这百万个点中找出给定的坐标是否存在，
		 *  如果一个将给定的点坐标  和  HashMap中 的坐标一一通过euqals对比，
		 *  那么我们最快能在第一个点就比较出来，最慢就是比较完整个HashMap中的数据，数据查询效率很低。
		 *  
		 *  
		 *  hashCode()会为每一个对象生成对应的hashcode码，
		 *  在HashMap中存放数据时，会根据hashcode码将数据存在到相应的位置，
		 *  
		 *  有了这个码以后，从HashMap中找数据的时候，
		 *  比如给定new Point(1,1)点坐标，
		 *  那么程序先根据hashCode()得到此点的hashcode码，
		 *  然后会直接根据此码从 HashMap先定位具有相同的此码的 对象的位置，
		 *  然后再根据euqals()进行比较即可。
		 *  
		 *  注意： hashCode相等，两个对象不一定相等，
		 *  	  两个对象相等，那hashCode相等。
		 *  	
		 *  	一般我们定义的类的实例  在使用时，
		 *  	会被大量的存储和检索时，建议是重写 hashCode()
		 */
	}
}

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
//	重写Object提供的equals方法
	@Override
	public boolean equals(Object obj) {
		/*
		 * 注意： 1、传入参数为null返回false
		 * 		 2、如果传入的是自己，直接返回true
		 * 		 3、在向下塑型前进行类型判断 
		 * 		 4、自定义比较的内容
		 */
		if(obj==null) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		if(obj instanceof Point) {
			Point otherPoint=(Point)obj;
			if(this.x==otherPoint.x && this.y==otherPoint.y) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	
	
}



