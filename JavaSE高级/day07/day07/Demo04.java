/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
/**  
 * 
 * try catch finally 的执行顺序：
 * 
 * 	1、finally中的代码总是会被执行
 * 	2、如果finally中有return,会将try catch中的return给覆盖
 * 
 * 	3、finally如果有return ，会屏蔽 catch中的异常输出
 * 	4、finally如果有异常 ，会屏蔽 catch中的异常输出	
 * 
 * 总的来说就是finally中不要有额外的代码操作，一般用来关闭资源即可
 */
public class Demo04 {
	static int x=10;

	public static int test1(){
		int i=1;
		try {
			i++;
			System.out.println("try i："+i);
		}catch(Exception e) {
			i++;
			System.out.println("catch i："+i);
		}finally {
			i=10;
			System.out.println("finally i:"+i);
		}
		return i;
	}
	
	/*
	 * 將return加在try { }中，执行结果：
	 * 			try i：2
	 *			finally i:10
	 *			test2() i:2
	 *	代码的执行顺序还从 try--->finally
	 *	 这里由于finally无论如何都会被执行，
	 *  所以当try中的代码执行到return的时候都不会被直接返回，
	 *  
	 *  在try中return返回变量 不是try之外定义的局部变量，
	 *  而是系统重新定义了一个try内的局部变量i' ,然后将对应的值赋给i' 并返回了，
	 *  finally用的还是try之外定义的局部变量i的，并且赋值为了10
	 *   
	 */
	public static int test2(){
		int i=1;
		try {
			i++;
			System.out.println("try i："+i);
			return i; //实际上是： int i'=i ; return i';
		}catch(Exception e) {
			i++;
			System.out.println("catch i："+i);
			return i;
		}finally {
			i=10;
			System.out.println("finally i:"+i);
		}
	}
	
	public static int test3(){
		try {
			x++;
			System.out.println("try x："+x);
			return x;
		}finally {
			x=100;
			System.out.println("finally x:"+x);
		}
	}
	
	/*
	 *  创建一个对象， 修改数据，返回结果  ： {1,2}  并不是{1}
	 *  执行顺序还是  try----> finally
	 *  在try 中的return 返回时还是新定义了一个list'去接收原来 的list值并返回，
	 *  但是这里的list是复合数据类型，给list'的是地址，所以list和 list'都指向同一个地址（对象），
	 *   那此时finally中操作list去添加数据， 实际上也对list'所表示的对象进行数据修改
	 */
	public static List test4(){
		List<Integer> list=new ArrayList<Integer>();
		try {
			list.add(1);
			return list;	
		}finally {  
			list.add(2);
		}
	}
	
	/*
	 * 在finally中也加 return
	 * 		执行顺序：  try----> finally
	 * 		返回结果： 	try i：2
	 *					finally i:10
 	 *					test5() i:10
 	 *      可以看到 finally中的return 将 try catch中的return给覆盖了
	 */
	public static int test5(){
		int i=1;
		try {
			i++;
			System.out.println("try i："+i);
			return i; 
		}catch(Exception e) {
			i++;
			System.out.println("catch i："+i);
			return i;
		}finally {
			i=10;
			System.out.println("finally i:"+i);
			return i; 
		}
	}
	
	
	public static String test6(){
		try {
			System.out.println("进入到try中");
			new SimpleDateFormat("yyyy-MM-dd").parse("1998/09/07");
//			return "abc";
		} catch (ParseException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally中代码被执行。。。。");
			try {
				int i=10;
				i=i/0;
			}catch(Exception e){
				e.printStackTrace();
			}
			return "abc";
		}
	}
	
	public static void main(String[] args) {
//		System.out.println("test1() i:"+test1());
//		System.out.println("test2() i:"+test2());		
//		System.out.println("test3() x:"+test3());
//		System.out.println("X: "+x);
//		System.out.println("test4() list:"+test4());
//		System.out.println("test5() i:"+test5());
		
		test6();
	}
}


