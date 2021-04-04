/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03_test;

import java.util.Calendar;

/**   
 *  对时间分量的加减计算
 */
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * add(int field, int amount) 
		 * 	对当前Calendar的指定时间分量进行加减计算，
		 * amount为正表示加，  为负表示减
		 */
		Calendar ca=Calendar.getInstance();
		System.out.println(ca.getTime());

		//计算从此时算起    5年零4个月 10天 4小时的 具体时间
		ca.add(Calendar.YEAR, 5);
		ca.add(Calendar.MONTH, 4);
		ca.add(Calendar.DAY_OF_YEAR, 10);
		ca.add(Calendar.HOUR_OF_DAY, 4);
		
		System.out.println(ca.getTime());
	}
}
