/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

import java.util.Arrays;

public class Demo08 {
	public static void main(String[] args) {
		/*
		 * 1、String[] split(regex) 
		 * 	将当前字符串 按照满足所给的正则表达式 进行拆分，
		 * 	然后将拆分后的字符串数组返回
		 */
		
		//将给定的字符串的大写字母全部去除
		String str="abcAAeruBDYehji";
		String regex="[A-Z]+";
		String[] stx=str.split(regex);
		System.out.println(Arrays.toString(stx));
		
		/*
		 * 2、String replace(oldChar, newChar)
		 * 		将给定的字符串中的   指定字符oldChar，用新给定的字符串newChar代替，
		 * 		不支持正则表达式
		 */
		String str1="good good study, day day up";
		String strr=str1.replace("good", "好");
		System.out.println("strr:"+strr);
		
		/*
		 * String  replaceAll(regex, replacement)
		 * 		将当前字符串满足给定正则表达式的子字符  
		 * 		用所给的 replacement字符替代
		 */
		String regex1="sb|cnm|cnnn|举报";
		String input="你就是个大sb";
		input=input.replaceAll(regex1, "**");
		
		
		System.out.println("input:"+input);
	}
}
