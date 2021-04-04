/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03_test;

import java.util.Calendar;
import java.util.Date;

/**   
 *  Calendar:日历类， 专门用实现对时间日期的操作，提供了丰富的操作时间的API
 *			该类本身为抽象， 其实子现类为GregorianCalendar（公历历法类），	
 */
public class Demo02 {
	public static void main(String[] args) {
		
		/*
		 * Calendar提供了一个静态方法getInstance()来获取其子实例，
		 * 该方法会根据当前系统所在地来返回合适的GregorianCalendar对象
		 */
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		
		/*
		 * Calendar-----> Date
		 * 		Date getTime()用来返回当前Calendar所代表的具体Date
		 */
		Date date=calendar.getTime();
		System.out.println("date: "+date);
		
		
		/*
		 * Date----->Calendar
		 * 		void setTime(Date date) 将当前Calendar设置成给定Date时间
		 */
		Date date1=new Date();
		date1.setTime(date1.getTime()+1000*24*3600);
		calendar.setTime(date1);
		System.out.println(calendar);
	}
}
