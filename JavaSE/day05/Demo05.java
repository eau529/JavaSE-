/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.Arrays;
import java.util.Random;

/**  
 *  利用数组来模拟：  彩票的大乐透的号码产生
 *		规则： 01~35 个红色球中取出5个不重复的红色球
 *			  01~16 个蓝色球中取出 2个 不重复的蓝色球	
 *
 *		用数组来模拟球池，从中取出对应的数据 
 */
public class Demo05 {
	public static void main(String[] args) {
		String[] redPool={"01","02","03","04","05","06","07","08","09","10","11","12",
				"13","14","15","16","17","18","19","20","21","22","23","24",
				"25","26","27","28","29","30","31","32","33","34","35"};
		//用Random来产生随机的下标，从对应的pool取出相应球
		Random ra=new Random();
		
		String[] getBall=new String[5]; // 定义getBall数组来存放取出来的5个球
		
		//定义一个标记数组来实现 对redPool中对应下标的元素是否取出，进行标记
		boolean[] flags=new boolean[redPool.length];
		
		int getBallIndex=0;
		while(true) {
			int index=ra.nextInt(35);//产生随机下标		
			// 产生下标以后，先取出标记位的元素进行判断，
			//如果为true，则表示已经使用过
			if(flags[index]) {
				continue;
			}
			getBall[getBallIndex]=redPool[index]; // 将对应下标的球存入getBall中
			
			//将标记数组对应下标元素值改成true，记为redPool对应下标元素值已经被使用过
			flags[index]=true; 
			getBallIndex++;
			if(getBallIndex==5) {
				break;
			}
		}
		System.out.println(Arrays.toString(getBall));
		
	}
}
