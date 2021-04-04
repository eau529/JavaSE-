/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * 1、数组定义： 一种复合数据类型，是具有相同数据类型的有序数据集合
		 */
		int[] arr= {1,2,4,6};
		
		//2、定义了数组以后，可以通过数组的下标对数据进行访问
		System.out.println("arr[1]:"+arr[1]);
		arr[1]=19;
		System.out.println("arr[1]:"+arr[1]);
		
		/*
		 * 3、数组的内存结构：
		 * 
		 * 因为数组是复合数据类型， 其被创建后分为两部分
		 * int[] arr= {1,2,4,6};
		 * 	  arr 为引用变量，存放在栈中，其中值为 {1,2,4,6}在堆内存中的地址
		 */
		System.out.println("arr:"+arr);
		int[] arr1= {1,2,4,6};
		// 复合数据类型用 == 进行比较的时候，都比较的是地址值
		System.out.println("arr==arr1:"+(arr==arr1)); //false
		
		/*
		 * 4、数组的初始化
		 */
		// 4.1 数组的静态初始化
		int[] arr2= {1,45,67,8}; // 变量的声明 和 初始化都在同一行
//		int[] arr3;
//		arr3= {1,5,6,8};  此种方式，不可以事后进行初始化，否则编译报错
		
		
		// 4.2 动态初始化 ，即即通过new 关键字
		int[] arr3=new int[5]; //定义一个长度为5的数组，但是初始值未定义
		/*
		 * 通过数组的length属性获取数组的长度 
		 * 注意： 数组的长度一旦被确定，便不可以再改变
		 */
		System.out.println("arr3.length:"+arr3.length);
		arr3[3]=90;
		System.out.println("arr3[3]:"+arr3[3]);
		
		/*
		 * 4.3 第二种动态方式初始化， 在创建时指定初始值，但是不定义长度。
		 *     数组的长度即是  初始的元素的个数
		 */
		int[] arr4=new int[] {1,11,111,1111,11111};
		System.out.println("arr4.length:"+arr4.length);
		System.out.println("arr4[3]:"+arr4[3]);
		
		
		/*
		 * 5、数组的遍历
		 *     通过数组下标去访问数组元素时需要注意， 
		 *     因为数组下标是从0开始， 所以下标的最大值为：  数组的长度-1
		 *     
		 *     如果有操作： arr[数组长度]，
		 *     	运行时直接报ArrayIndexOutOfBoundsException 数组下标越界的异常
		 */
//		for(int i=0;i<arr4.length;i++) {
//			System.out.println(arr4[i]);
//		}
		
		/*
		 * 增强for循环（其底层是用迭代器实现）， 用来实现数组的遍历
		 * 		for(int x:arr4) ：  arr4表示要遍历的数组
		 * 						   int x 表示用x变量来存放遍历出的每一个元素
		 */
		for(int x:arr4) {
			System.out.println(x);
		}
		
		
	}	
}
