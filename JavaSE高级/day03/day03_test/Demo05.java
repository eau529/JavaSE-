/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  
 *  时间日期格式化：SimpleDateFormat 
 *	    允许将Date 和 String 按照指定的时间日期格式相互转换
 */
public class Demo05 {
	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println(date);
		
		/*
		 * 先指定时间日期格式
		 * 	y-表示年    M-月  d-表示天
		 * 	H 表示时    m表示分   s表示秒
		 *  w-年中的周数         W-月份中的周数 
		 *  E-星期中的天数 
		 */
//		String pattern="yyyy年MM月dd日 HH时mm分ss秒  E";
		String pattern="yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat sf=new SimpleDateFormat(pattern);
		/*
		 *Date------->String
		 * 
		 * String format(Date date) 
		 * 将给定的Date时间按照指定的时间格式转化，并以字符串的形式返回
		 */
		String nowTime=sf.format(date);
		System.out.println(nowTime);
		
		
		/*String ------------>Date
		 *   将字符串按照指定的规则 转成对应的Date类型
		 *   
		 *   需要注意,使用时指定的日期转换格式  必须和  String中代表的日期格式一致，
		 *   否则抛出转换异常ParseException
		 */
		String dateInput="2018-12-22 12:33:44";
		String pattern1="yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sf1=new SimpleDateFormat(pattern1);
		
		Date date1=sf1.parse(dateInput);
		System.out.println("date1:"+date1);
	}
}
