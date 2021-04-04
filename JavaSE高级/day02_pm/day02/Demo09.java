/**
 * <p>Title: Demo09.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

import java.math.BigDecimal;

public class Demo09 {
	public static void main(String[] args) {
		/*
		 * 大精度工具类：  BigDecimal
		 * 		专门用来解决浮点数类型的 数据不精确的问题	
		 */
		double b=0.3;
		System.out.println(0.3*3);
		
		/*
		 * BigDecimal提供了多个构造函数，
		 * 		使用的时候需要注意，如果构造函数中传入为一个  浮点数，
		 * 		那么最终得到是这个浮点数的   实际存储的值，
		 * 		如下所示：  new BigDecimal(0.3)
		 * 			最终得到的是： 0.299999999999999988897769753748434595763683319091796875
		 * 		
		 * 	所以我们想要使用准确的 浮点时，应用其 字符串的形式
		 */
		BigDecimal bigDec1=new BigDecimal(0.3);
		System.out.println("bigDec1:"+bigDec1);
		
		BigDecimal bigDec2=new BigDecimal("0.3");
		System.out.println("bigDec:"+bigDec2);
		
		/*
		 * BigDecimal的数学计算，都是调用具体的方法来实现的
		 * 	  add() 加法
		 * 	  subtract() 减法
		 * 	  multiply() 乘法
		 */
		BigDecimal bigDec3=new BigDecimal("11.3");
		BigDecimal bigDec4=new BigDecimal("5");
		BigDecimal addValue=bigDec3.add(bigDec4);
		System.out.println("addValue:"+addValue);
		BigDecimal subValue=bigDec3.subtract(bigDec4);
		System.out.println("subValue:"+subValue);
		BigDecimal multiplyValue=bigDec3.multiply(bigDec4);
		System.out.println("multiplyValue:"+multiplyValue);
		
		
		/*
		 * divide()除法操作：
		 * 		1、BigDecimal divide(BigDecimal divisor)	
		 * 		    能除的尽就用此方法，除不尽则抛出异常ArithmeticException
		 * 		
		 * 		2、divide(BigDecimal divisor, RoundingMode roundingMode)
		 * 				divisor要除的数据
		 * 				roundingMode表示舍入模式， 根据BigDecimal提供静态常量值来确定
		 * 						常见如： ROUND_HALF_DOWN 和 ROUND_HALF_UP 
		 * 						 都是进行四舍五入，对于 ROUND_HALF_DOWN，如果舍弃的部分的值 等于5，不就不进位
		 * 	 										 ROUND_HALF_UP，  如果舍弃的部分的值等于5，要进位 
		 * 						ROUND_HALF_EVEN：  如果舍弃部分左边的数字为奇数，则舍入行为与 ROUND_HALF_UP 相同；如果为偶数，
		 * 											则舍入行为与 ROUND_HALF_DOWN 相同
		 * 
		 * 		3、public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode)
		 * 				divisor要除的数
		 * 				scale 指定保留的位数
		 * 				roundingMode舍入模式
		 */
		BigDecimal divideValue=bigDec3.divide(bigDec4);
		System.out.println("divideValue:"+divideValue);
		
		
		BigDecimal bigDec5=new BigDecimal("10");
		BigDecimal divideValue1=bigDec3.divide(new BigDecimal("3"),3,BigDecimal.ROUND_HALF_UP);
		BigDecimal divideValue2=bigDec5.divide(new BigDecimal("3"),2,BigDecimal.ROUND_HALF_UP);
		System.out.println("divideValue1:"+divideValue1);
		System.out.println("divideValue2:"+divideValue2);
	}
}
