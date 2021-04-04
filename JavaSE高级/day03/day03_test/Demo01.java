/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03_test;

import java.util.Date;

/**    
 * java.util.Date :时间日期工具类
 *		Date 的每一个实例都表示一个确切的时间点，在其内部维护着一个
 *		long值，我们称其为时间戳，表示1970年元旦到 当前系统时间所经过的毫秒数	
 */
public class Demo01 {
	public static void main(String[] args) {
		long lct= System.currentTimeMillis();
		System.out.println("lct: "+lct);
		
		Date date=new Date();
		System.out.println(date);
		
		/*
		 * 根据Date获取时间戳
		 * 		long getTime()
		 */
		long nowTime=date.getTime();
		System.out.println("nowTime:"+nowTime);
		
		/*
		 * void setTime(long time) 
		 * 		根据传入的毫秒数来设定当前Date的日期
		 */
		Date date1=new Date();
		date1.setTime(1000);
		System.out.println(date1);
		
		//计算 从此时算起  5天 4小时 36分后的具体时间为多少
		Date date2=new Date();
		long endTime=(5*3600*24+4*3600+36*60)*1000l+date2.getTime();
		date2.setTime(endTime);
		System.out.println(date2);
		
		/*
		 * after(Date when)  测试此日期是否在指定日期之后。
		 * before(Date when) 测试此日期是否在指定日期之前。
		 */
		boolean isAfter=date2.after(date1);
		System.out.println("isAfter:"+isAfter);
		
		/*
		 * 注意： Date因为在一开始设计有缺陷，
		 * 		所以它当中的大部分方法已经被废弃，
		 * 		一般我们使用它只是用来获取当前系统时间，而不用于是时间的计算操作
		 */
		date2.getYear();
		date2.getDate();
	}
}
