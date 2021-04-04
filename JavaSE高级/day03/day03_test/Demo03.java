/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03_test;

import java.util.Calendar;

// 对时间分量的获取和设置
public class Demo03 {
	public static void main(String[] args) {
		/*
		 * 在Calendar中，大部分对时间日期的操作都是基于时间分量来的。
		 * 时间分量即Calendar表示时间类型的一系列常量，
		 * 		比如：  	DATE 指示一个月中的某天
		 * 		       	DAY_OF_MONTH  指示一个月中的某天 
		 *				DAY_OF_WEEK   指示一个星期中的某天。
		 *				DAY_OF_WEEK_IN_MONTH  指示当前月中的第几个星期。
		 *				DAY_OF_YEAR   指示当前年中的天数。
		 */
		Calendar ca=Calendar.getInstance();
		/*
		 * int  get(int field)
		 * 	根据指定的时间分量值，来获取对应的数值
		 */
		int year=ca.get(Calendar.YEAR);
		System.out.println("year:"+year);
		
		/*
		 *注意： 月份是从0开始
		 */
		int month=ca.get(Calendar.MONTH);
		System.out.println("month:"+(month+1));
		
		int day_month1=ca.get(Calendar.DATE);
		System.out.println("day_month1:"+day_month1);
		int day_month2=ca.get(Calendar.DAY_OF_MONTH);
		System.out.println("day_month2:"+day_month2);
		
		/*
		 * 算一周的第几天时，是按照 星期天  是本周的第一天来算的，
		 * 数值从1开始
		 */
		int day_week=ca.get(Calendar.DAY_OF_WEEK);
		System.out.println("day_week:"+day_week);

		//输出汉字的星期几
		String[] str= {"日","一","二","三","四","五","六"};
		System.out.println("今天是星期"+str[day_week-1]);
		
		
		/*
		 * 通过对应的set(int field, int value)
		 * 		对指定的时间分量进行值的设置
		 */
		ca.set(Calendar.YEAR, 2020);
		System.out.println(ca);
	}
}
