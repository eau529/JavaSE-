/**
 * <p>Title: HomeWork.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

import java.util.Arrays;

public class HomeWork {
	
	/*
	 * 编写一个程序，实现从命令行参数中输入一字符串，
	 * 要求此字符串的格式为”xxxxx,yyyy,zzzz,hhhh”，即字符串用逗号隔开。
	 * 然后处理字符串中各逗号之间的部分并输出。
	 * 并要求每一隔开的字符串中如果出现字母”s”，进行进行用”*”屏蔽。
	 */
	public static void work01() {
		String str="abcd,dfs,shjgs,ewrh";
		String[] newStr=str.split(",");
		
		StringBuffer strBuffer=new StringBuffer();
		for (int i = 0; i < newStr.length; i++) {
			strBuffer.append(newStr[i]);
		}
		str=new String(strBuffer);
		str=str.replaceAll("s","*");
		System.out.println(str);
	}
	
	/*
	 * 1、需求： 将“我我我、、、我我、、我要要、、、
	 * 要要要、、要要、、学学学、、、、学学编、、、学编编编、、
	 * 编编编程、、程程”还原成：我要学编程
	 */
	public static void work02() {
		String str="我我我、、、我我、、我要要、、、要要要、、要要、、学学学、、、、学学编、、、学编编编、、编编编程、、程程";
		str=str.replaceAll("、{1,}", "");
		System.out.println(str);
		str=str.replaceAll("(.)\\1+", "$1");
		
//		str=str.replaceAll("我+", "我");
//		str=str.replaceAll("要+", "要");
//		str=str.replaceAll("学+", "学");
//		str=str.replaceAll("编+", "编");
//		str=str.replaceAll("程+", "程");
//		str=str.replaceAll("我要我要", "我要");
//		str=str.replaceAll("学编学编", "学编");
		System.out.println(str);
	}
	
	/*
	 * 3、检验email地址
	 */
	public static void work03() {
		String str="12313@163.com";
		String regex="\\w+@[a-zA-Z0-9]+\\.(cn|com)";
		System.out.println(str.matches(regex));
	}
	
	/*
	 * 4、172.25.27.1 3.25.118.32 105.38.225.12，
	 * 把所给的ip地址切割出来进行排序。
	 */
	public static void work04() {
		String str="172.25.27.1 3.25.118.32 105.38.225.12";
		// 先对 ip地址中，长度不足3的部分补0
		str=str.replaceAll("(\\d{1,})","00$1");
		
		// 将多余的0去除
		str=str.replaceAll("0*(\\d{3})", "$1");
		System.out.println(str);
		
		//将ip地址按空格拆分
		String[] strs=str.split(" ");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		//排序
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
		
	}
	
	
	
	public static void main(String[] args) {
//		work01();
		work02(); 
//		work03();
//		work04();
	}
}
