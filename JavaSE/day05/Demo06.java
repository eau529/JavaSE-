/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

public class Demo06 {
	public static void main(String[] args) {
		int[][] arr= {{1,23},{11,13},{4,5}};		
		System.out.println(arr[1]);
		System.out.println(arr[1][1]);
		
		//动态方式创建1
		int[][] arr1=new int[2][3];
		
		//动态方式创建2
		int[][] arr2=new int[2][];
		System.out.println(arr2[1]);
		
		arr2[0]=new int[10];
		arr2[1]=new int[4];
	}
}
