/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/*
 * 引用传递：指的是在方法调用时，传递的参数将引用变量中的实际地址值传了过去,
 * 
 * 在java中，只有值传递，传递引用变量时，也是传递的引用变量所代表的值的拷贝
 */
public class Demo03 {
	public static void test1(ObjectA  objA) {
		objA=new ObjectA();
		objA.a=10;
		System.out.println("test(ObjectA  objA).a:"+objA.a);//10
	} 
	
	public static void test2(String str) {
		str="fgh";
		System.out.println("test2(String str).str:"+str);//fgh
	} 
	
	public static void main(String[] args) {
		ObjectA objA=new ObjectA();
		test1(objA);
		System.out.println("main().a:"+objA.a);//100
		
//		String str="abc";	
//		test2(str);
//		System.out.println("main().str:"+str);//abc
		
	}
}
class ObjectA{
	int a=100;	
}

