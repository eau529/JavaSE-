/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * java异常的层次：
 * 		所有异常的父类： Throwable，其下有两个子类
 * 			1、error（错误）
 * 				表示整个程序在运行期间出现了十分严重的错误，
 * 				比如 系统崩溃，jvm内存溢出，像这种我们不能通过代码解决的问题
 * 				叫做错误，此种情况下只有终止整个程序。
 * 
 * 			2、exception（异常）
 * 				2.1非检测异常( RuntimeException)
 * 					我们书写完代码后，编译器在进行源码编译时，
 * 					不会提示和发现这些异常，因此在书写时也不需要我们去做相应的处理，
 *   				但是在运行时如果出现问题，整个程序还是会抛出对应的异常，
 *   				然后运行整个程序的线程强制结束。
 *   
 *   				一般来说发生此种类型的异常，是因为我们代码书写有问题，
 *   				对于这种异常我们应该做的是去修正自己的代码，
 *   				而不是期望通过异常处理机制来修正此bug，
 *   				比如说：空指针，数组越界
 * 
 * 				2.2 检查异常（checked-exception）
 * 				    我们书写代码，编译器在编译源码时，会发现此类异常，并且要求我们
 * 				    做出相应的处理（1、同throws抛出，2、try{}catch捕获），
 * 				    编译器也会做出相应的检查，如果没做处理则编译报错。
 * 
 * 				  一般来说此种类型的异常都是由于程序的运行环境所导致的，
 * 				 我们的程序会运行在各种未知的环境中，而我们也无法干预使用者如何使用我们的程序，
 * 
 * 				比如： 1、该异常发生以后是可以被回复的，
 * 						  如一个internet连接中断以后发生的异常，
 * 						 我们可以通过异常处理机制尝试再次连接网络
 * 					  
 * 					  2、程序依赖了不可靠的外部条件，
 * 						 比如说IO读写文件，但是根据使用书写的路径根本找不到路径，
 * 						 此时我们应通过异常机制告知使用者路径有问题
 * 				
 * 					  3、该异常发生以后，不会导致整个程序运行处错，
 * 						 不会对后续的程序数据造成影响
 * 						 我们进行一些后续操作还是可以继续执行。	
 */
public class Demo02 {
	
	/*
	 *1、异常捕获机制 ，try{
	 *					}catch(Exception e){ } 
	 *
	 *	 当程序中出现 RuntimeException时 ，执行程序的当前线程会被强制终止，后续代码都不会执行。
	 *	
	 *	 我们对检测异常通过try catch进行处理时，
	 *	 在try块中，如果某段代码出现异常，则程序从该位置跳出，
	 *	 try块的后续代码不在被执行，并且将相应的异常封装成一个实例对象抛出，
	 *	 再和catch中的异常类型进行匹配，然后进如到指定到catch块中进行相应的异常处理，
	 *   异常处理完毕后，整个try catch代码段后面还有代码，
	 *   那么程序将会继续得到执行，直到结束
	 */
	public static void main(String[] args) {
		System.out.println("程序开始。。。。");
		String str="fd";
	
		try {
//			System.out.println("进入到try中。。。。。");
//			str.charAt(3);
//			System.out.println("try中代码后续操作执行。。。。。");
			
			String strDate="1989-12-21";
			new SimpleDateFormat("yyyy/MM/dd").parse(strDate);
		/*
		 *一个try后面可以接多个catch块，可以针对多种异常，
		 *但是这多个异常只会有一个被执行， 
		 *当try中抛出的异常实和 catch中相对应的最近的异常类型匹配以后，
		 *后续的catch都不会再被执行。
		 *
		 * catch中的两个或者多个异常出现继承关系时，父类型异常永远在子类异常的下面，
		 * 否则编译报错。
		 */
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			
			System.out.println("捕获到StringIndexOutOfBoundsException");
		} catch (ParseException e) {
			//e.printStackTrace()打印异常信息到控制台
			e.printStackTrace();
			System.out.println("捕获到ParseException");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("捕获到Exception");
		}
		System.out.println("程序结束。。。。");
	}
}
