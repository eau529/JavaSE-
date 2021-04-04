/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

import day10.test01.Student;
public class Demo05 {
	public static void main(String[] args) {
		
		/*
		 * 包： 即源文件的路径，主要是用来解决类名冲突问题，
		 * 		当当前源程序引用了其他类时，jvm会先从当前包中去查找对应的类，
		 *   	如果没有则需要根据import关键字指定的路径去查询。
		 *   
		 * 包的取名：  一般建议是  公司域名反写+项目模块名
		 * 				cn.goktech.xxx.user
		 */
		Student student=new Student();
		
		/*
		 * 如果在同一个类中，引用了两个同名类,
		 * 需要通过全类名的方式来区分（包名+类名）
		 */
		day10.test02.Student s1=new day10.test02.Student();
		
		/*
		 * 无包名的类，可以访问有包名类，但是反过来不可以
		 */
//		Day10_test dt=new Day10_test();
	}
}
