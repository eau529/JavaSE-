/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo03 {
	public static void main(String[] args) {
		System.out.println("程序开始。。。。");
		
		String strDate="1989-12-21";
		/*
		 * finally 块
		 * 	  常跟在异常捕获机制的后面，
		 *   finally中代码一定会被执行（不管try中出不出现异常）,
		 *   一般在finally块中去定义释放资源的操作（关闭流，关闭连接...）
		 */
		try {
			System.out.println("进入到try中");
			new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally中代码被执行。。。。");
		}
	}
}
