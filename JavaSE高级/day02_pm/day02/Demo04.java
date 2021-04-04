/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

/*
 * 在jdk1.5以后，java推出了 自动拆装箱机制
 * 		它可以允许我们编程时实现   包装类和对应的基本数据类型 之间自由的转换。
 */
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 这里编译器在编译时帮我们实现了如下操作：
		 * 		先创建Integer对象
		 * 		然后调用x.valueOf(1)将基本类型转成包装类。
		 */
		Integer x=1;
		
		/*
		 *此处也是编译做了额外的操作：
		 *		调用对应包装类的  xxValue() 
		 *		实现将包装类转成对应的基本数据类型
		 */
		int i=new Integer(20);
		
		/*
		 * 注意：使用自动拆装箱机制，可能会带来空指针异常的风险。
		 * 		 所以一般在将 包装类直接赋值给 
				 基本数据类型的时候要进行非空判断
		 */
		Integer in=null;
		int i1=in;
		
	}
}
