/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

import java.util.Scanner;

public class Demo01 {
	/*
	 *  do{
	 *  	循环体 
	 *  }while(循环条件)
	 *  
	 *  和while循环用法类型，不过该循环不管是否满足循环条件，
	 *  至少会都被执行一次循环体
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 用户输入的数据必须是在 10~40之间的数字，否则 重新输入
		int num;
		do {
			System.out.println("请输入一个整数：");
			num=sc.nextInt();
		}while(num<10||num>40);
	}
}
