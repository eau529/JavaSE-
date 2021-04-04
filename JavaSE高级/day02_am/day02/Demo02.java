/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

/*
 * String
 * StringBuilder   线程不安全，效率高
 * StringBuffer    线程安全，    效率低
 * 
 * 上面三个都是字符串，只不过String创建的是不可变字符串，
 * 后面两个创建的是可变字符串。
 * 
 * 每次对String类型的字符串进行修改，
 * 实际上是在常量池中创建一个新的字符串，
 * 这样做，在会频繁的修改字符串的场景下，
 * 会带来很大的内存开销，拖慢系统性能
 * 
 * 所以在频繁的修改字符串的场景下，我们会使用StringBuilder或者StringBuffer来创建字符串。
 * 在他们的内部维护着一个长度可变的字符数组，每次的需改都是基于该数组来的
 */
public class Demo02 {
	public static void main(String[] args) {
		/*
		 * StringBuilder或者StringBuffer提供了一下常见api来实现对字符串编辑
		 *  增： append()
		 *  删： delete()
		 *  改： replace()
		 *  插： insert()
		 */
		StringBuilder  strBuilder=new StringBuilder("abcd");
		System.out.println("strBuilder:"+strBuilder);
		
		//向末尾添加给定的字符串
		strBuilder.append("TTZZ");
		System.out.println("strBuilder:"+strBuilder);
		
		//删除的时候，也是含头不含尾
		strBuilder.delete(4, 8);
		System.out.println("strBuilder:"+strBuilder);
		
		//修改指定位置的字符串，位置含头不含尾
		strBuilder.replace(1, 3, "BC");
		System.out.println("strBuilder:"+strBuilder);
		
		// 将给定的字符串插入到指定的位置处 
		strBuilder.insert(1, "中文");
		System.out.println("strBuilder:"+strBuilder);
		
		//将StringBuilder转成String
		String str=new String(strBuilder);
	}
}
