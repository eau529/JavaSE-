/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**  
 * 字符缓冲流 ： 内部维护字符数组，可以以 行 为单位对字符数据进行操作
 *
 *  	BufferedWriter ---- 字符缓冲输出流
 */
public class Demo02 {
	public static void main(String[] args) {
		String str="dsfdsfsdf,好好学习，天天向上";
		FileOutputStream fos;
		OutputStreamWriter osw;
		BufferedWriter bw;
		try {
			fos = new FileOutputStream("src/day10/cf2.txt",true);
			osw = new OutputStreamWriter(fos,"utf8");
			bw  = new BufferedWriter(osw);
			bw.write(str);
			bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
