/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

public class Demo01 {
	public static int[] method() {
		int age=19;
		int classNo=1808;
		int[] xx={age,classNo};
		return  xx;
	}
	
	
	public static void main(String[] args) {
		int[] xx=method();
		System.out.println(xx);
	}
}
