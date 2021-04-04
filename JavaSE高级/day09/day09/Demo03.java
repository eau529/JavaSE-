/**
 * <p>Title: Demo03.java</p>  
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

/*
 * 缓冲输出流的缓冲区问题：
 * 		缓冲流在输出数据时，会先将数据存入缓冲区，
 *      当缓冲区满了以后才将数据实际写出,如果不满，则不实际写出。
 */
public class Demo03 {
	public static void main(String[] args) {
		String str = "dsfhisfsff";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("src/day09/cf_test2.dat");
			bos = new BufferedOutputStream(fos);
			bos.write(str.getBytes());
			
			/*
			 *flush()强制将缓冲区的数据全部写出。
			 *       注意频繁使用会降低写文件的效率
			 */
			bos.flush();
			System.out.println("写出完毕。。。。");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
