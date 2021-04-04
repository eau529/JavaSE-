/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**   
 *缓冲字节流（高级流）：
 *	   内部维护一个缓冲区（字节数组），可以快对文件的读写效率
 *
 *分类：   1、BufferedOutputStream  缓冲输出流
 *		 2、BufferedInputStream   缓冲输入流
 *  	
 *注意： 高级是依赖于低级流存在的， 其不能够独立存在。
 *		使用高级一般是为了解决某些读写操作的复杂度问题，简化代码书写，
 *		最终实际的文件读写 还是要靠低级流来完成。
 */
public class Demo02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("src/day09/cfmp3.mp3");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("src/day09/cf_copy.mp3");
			bos = new BufferedOutputStream(fos);
			
			long startTime = System.currentTimeMillis();
			
			int d=-1; //存放一字节的数据
			/*
			 * 当我们调用BufferedInputStream的 read方法时，
			 * 该缓冲输入流 会一次性的读取若干个数据存入其内部的缓冲区（字节数组），
			 * 然后 read方法会将第一个字节数据返回， 
			 * 当我们再次调用read方法时，会将第二个字节数据返回 ，依次返回第 3、4、5。。。
			 * 直到整个缓冲区的全部数据被取出，才会再次发生真实的读操作。
			 * 
			 * 当读到文件末尾返回-1。 
			 * 
			 */
			while((d=bis.read())!=-1) {
				
				/*
				 * 当使用BufferedOutputStream的时候，
				 * 也是先将数据写入缓冲区，当缓冲区被写满以后，
				 * 才会将数据真实写入指定的文件
				 */
				bos.write(d);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("复制完毕， 耗时"+(endTime-startTime));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
