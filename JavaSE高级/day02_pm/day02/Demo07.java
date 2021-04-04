/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo07 {
	public static void main(String[] args) {
		/*
		 * 正则表达式：
		 * 		正则表达式的英文是regular expression，
		 * 		意思是符合某种规则的表达式，
		 * 		可以将其理解为一种对文字进行模糊匹配的语言。
		 * 
		 *  作用：正则表达式是通过模式匹配实现对字符的查询，提取，替换，分割;
		 *  	    从而简化操作对字符的处理;主要功能如下
		 *  
		 *  语法规则：
		 *  	1、边界符号：
		 *  		^: 以什么开头，比如 ^ab ,表示匹配的字符串以ab开头
		 *  		$: 以什么结尾，比如 f$, 表示匹配的字符串以f结尾
		 *  		\b: 出现左边就表示以什么开头，右边就表示以什么结尾
		 *  	
		 *  	2、描述普通的字符：
		 *  		可以写abcd..... ,   [a-z]表示a到z中的任意一个字母
		 *  		可以写ABCD..... ,   [A-D]表示A到Z中的任意一个字母
		 *  		可以写0123.....,    [0-9]表示0到9之间的任意数字
		 *  		[a-d],表示只在 a到d之间的任意字母
		 *  	
		 *  	3、 转义，需要加 \，表示对特殊的符号转成其原本的意思
		 *  		\. \-  \+ \?   \*   \\  
		 *  		
		 *  		.表示任意一个字符
		 *  		-表示  区间，比如a-z，表示a到z之间
		 *  		剩余的都是表示数量
		 *  	
		 *  	4、数量的限定,跟在那个字符后面，就限定谁的个数
		 *  		(1) a{3},表示3个a
		 *  		(2) a{1,} 表示1到多个a
		 *  		(3) [a-z]{4,20} 表示4到20个 小写字母
		 *  	  特殊符号表示 数量限定：
		 *  		? 等价  {0,1}
		 *  		+ 等价 {1,}
		 *  		* 等价 {0,}
		 *  	
		 *  		^abc{1,} 表示此字符串满足ab开头,c是1到无穷多个
		 *  		
		 *  		^adf*  表示以ab开头，f有0到无穷个
		 *  
		 *  	5、 | 表示或则的意思
		 *  	
		 *  		a|b 表示此字符串可以是a也可以是b
		 *  		(a|b)c 表示此字符串为 ac或bc
		 *  
		 *  	6、[] 表示某些字符允许在一个字符串中的某一特定位置出现
		 *  		
		 *  	   [abc] 此位置处有 abc中的任意一个字符
		 *  	   [a-z]
		 *  	   [A-Z]  
		 *  	   
		 *  	   ^[a-zA-Z] 以任意字母开头
		 *  	   ^[a-zA-Z0-9] 以任意字母和数字开头
		 *  
		 *  	7、()表示子字符串
		 *  		
		 *  		(ab)+c 表示有1到多个ab的子字符串，最后在有一个c
		 *  		ab+c   表示字符串开头一个a，中间有1到多个b，最后有一个c
		 *  	
		 *  	8 [^]   ^边界符写在[]里面表示，没有指定的字符
		 *  	  ^[]    放在外面，表示以[]给定的字符开头
		 *  
		 *  
		 *  	9、一些正则表达式的简洁写法：
		 *  	\w 匹配包括下划线的任何单词字符。等价于'[A-Za-z0-9_]'。  
				\W 匹配任何非单词字符。等价于 '[^A-Za-z0-9_]'。 
				\d 匹配一个数字字符。等价于 [0-9]。  
				\D 匹配一个非数字字符。等价于 [^0-9]。
		 */			
		
		//定义一个正则表达式
		String regex="^ab[a-z]{1,}f$";
		System.out.println("abajdji".matches(regex));
		
		String regex1="^a(bc){0,}";
		System.out.println("abcbcbc".matches(regex1));
		
		String regex2="^ab|a";
		System.out.println("a".matches(regex2));
		
		String regex3="[^a-z].*";
		System.out.println("A".matches(regex3));
		
		String regex4="\\w{4,20}";
		System.out.println("chenfan".matches(regex4));
		
		/*
		 * 从jdk1.4开始，有一个java.util.regex 正则表达式的工具包
		 * 其提供了两个对类 Pattern和Matcher进行正则验证。
		 * 此方法不常用
		 */
		//通过Pattern定义正则表达式
		Pattern regexp=Pattern.compile("^1(3|5|7|8|9)\\d{9}$"); 
		Matcher matcher=regexp.matcher("13900701678");
		boolean isTrue=matcher.matches();
		System.out.println("isTrue:"+isTrue);
		
	}
	
}
