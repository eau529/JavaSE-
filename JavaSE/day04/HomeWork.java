/**
 * <p>Title: HomeWork.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class HomeWork {
	
	static Scanner sc=new Scanner(System.in);
	
	/*
	 * 1、用互从控制台输入 一个时间，为总秒数，  计算出其具体的   时 分 秒
	 */
	public static void homeWork01() {
		System.out.println("请输入一个时间");
		int time=sc.nextInt();
		int h=time/3600; // 计算秒数中有多少个3600，得出 小时数
		int m=time%3600/60; // 计算不不到3600 的秒数中有多少个分钟数
		int s=time%60;  // 计算 秒数
		
		System.out.println(h+"时"+m+"分"+s+"秒");
	}
	
	/*
	 * 利用三目运算符进行商品的分页计算：
	 * 		用户从控制台输入要显示的总商品数 num  和  每页显示的商品数rows 
     *  	根据这两个计算出 用多少页pageSize  来显示
	 */
	public static void homeWork02() {
		System.out.println("请输入商品的总数目：");
		int num=sc.nextInt();
		System.out.println("每页显示的商品数");
		int rows=sc.nextInt();
		int pageSize=num%rows==0?num/rows:num/rows+1;
		System.out.println("需要的页数为："+pageSize);
	}
	
	/*
	 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
		程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
		(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
		(2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。???
		(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
	 */
	public static void homeWork03() {
		System.out.println("输入一个正整数：");
		int num=sc.nextInt();
		int k=2;
		while(k<=num) {
			if(k==num) {
				System.out.println(num);
				break;
			}else if(num%k==0) {
				System.out.print(k+"*");
				num=num/k;
			}else {
				k++;
			}
		}
	}
	
	/*
	 * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
	 * 例如6=1＋2＋3.编程 找出1000以内的所有完数。
	 */
	public static void homeWork04() {
		//外层for循环负责取出 1~1000 的每一个数字
		for(int i=1;i<=1000;i++) {
			
			int temp=0;//用来存放 每个数字的因子之和
			// 在通过内层循环将取出来的每个数字进行因式分解并求和
			for(int j=1;j<i;j++) {
				//进行因子判断
				if(i%j==0) {
					temp=temp+j;
				}
			}
			if(temp==i) {
				System.out.println(i);
			}
		}
	}
	
	/*
	 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，
	 * 	请问该数是多少？（完全平方指用一个整数乘以自己例如1*1，2*2，3*3等，依此类推。
  	 *	若一个数能表示成某个整数的平方的形式，则称这个数为完全平方数）
	 */
	public static void homeWork05() {
		int n=0; //该数为要求的数
		
		int a; // 用来存放  n+100 然后开根号的整数
		int b; // 用来存放  n+100+168 然后开根号的整数
		while(true) {
			a=(int)Math.sqrt(n+100);
			b=(int)Math.sqrt(n+100+168);
			if(a*a==(n+100)&& b*b==(n+100+168)){
				System.out.println(n);
				break;
			}
			n++;
		}
	}
	
	public static void main(String[] args) {
//		homeWork01();
//		homeWork02();
//		homeWork03();
//		homeWork04();
		homeWork05();
	}
}
