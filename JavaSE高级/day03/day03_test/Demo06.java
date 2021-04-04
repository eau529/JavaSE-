/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03_test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**   
 *  数字格式化类：
 *		NumberFormat  是所有数值格式的抽象基，常用来对数值进行格式化操作，
 *					     其常用子类为 DecimalFormat 
 */
public class Demo06 {
	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getInstance();
		double d=345312343.5;
		
		//设定数值小数部分的最大位数，超出则直接去除,会四舍五入
		nf.setMaximumFractionDigits(4);
		//设定数值小数部分的最小位数，如果不足则补0
		nf.setMinimumFractionDigits(2);
		////设定数值整数部分的最大位数，超出则直接去除
		nf.setMaximumIntegerDigits(5);
		//设定数值整数部分的最小位数，如果不足则补0
		nf.setMinimumIntegerDigits(3);
		
		String str=nf.format(d);
		System.out.println("str:"+str);
	
		/*
		 * 直接使用DecimalFormat，可以在使用定义好转换的规则
		 * 	占位符： # 表示此处的数字可有可无
		 * 	        0 表示此处的数字必须要有，否则补0	
		 * 			,表示对数字分组
		 * 			.表示小数点
		 */
		String pattern="###,###.000";
		DecimalFormat  df=new DecimalFormat(pattern);
		double d1=12343.5;
		System.out.println(df.format(d1));
		
		double money=123213213.65;
		DecimalFormat  df1=new DecimalFormat("###,###,###.00$");
		System.out.println(df1.format(money));
		
		/*
		 *使用的注意事项：
		 *		用在整数部分时， #不能在0的左边，比如 ###,000,###
		 *		用在小数部分时， #不能用在0的左边，比如##000
		 *否则抛出IllegalArgumentException异常
		 */
		DecimalFormat df2=new DecimalFormat("###,000,###.000");
		DecimalFormat df3=new DecimalFormat("###.##000");
		System.out.println(df2.format(money));
	}
}
