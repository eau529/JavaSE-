/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

/*
 * break ：  表示打破当前循环，整个循环直接结束
 * continue:  忽略当前这一次循环， 接着进行下一次循环，指导循环结束
 */
public class Demo02 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("---------------------------");
		
		for(int i=0;i<5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
	}
}
