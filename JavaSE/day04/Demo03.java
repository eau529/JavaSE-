/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

import java.util.Scanner;

/*
 *retrun 关键字， 常用在方法中，表示结束当前方法。
 *		一般来说用在需要有返回值的方法中。
 *
 *	void 关键字修饰的方法  和非void 关键字修饰的方法
 *
 *	1、当一个方法被void修饰时，表明此方法只需要运行即可，
 *	      不需要向 调用该方法的外界返回数据
 *	2、当一个方法被非void修饰时，表明此方法执行以后，需要通过return关键字 
 *	      向调用该方法的外界  返回一个对应的数据类型  的数据。
 *
 */
public class Demo03 {
	/*
	 * 方法的组成：
	 * public    +  static  +        void/double      +   getRush(double money,double price,int num)
	 * 权限修饰词 +  方法类型  +  无返回值/返回值数据类型   +   方法名( 方法参数 ){
	 * 
	 * 			方法体
	 * 	}
	 */
	
	/*
	 * 定义一个方法用来计算找零的业务逻辑
	 */
	public static double getRush(double money,double price,int num) {
		double rush=money-price*num;
		return rush;
	}
	
	public static void main(String[] args) {
		//定义一个程序来模拟  收银台收银的案例
		Scanner sc=new Scanner(System.in);
		
		System.out.println("商品的单价：");
		double price=sc.nextDouble();
		System.out.println("商品的数量：");
		int num=sc.nextInt();
		System.out.println("用户所给的钱：");
		double money=sc.nextDouble();
		
		// 通过调用定义好的 找零的方法来获得找零结果
		double rush=getRush(money,price,num);
		
		System.out.println("应当找零："+rush);
		
	}
}
