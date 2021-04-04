/**
 * <p>Title: Demo03.java</p>  
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
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**   
 *  PrintWriter : 具有自动行刷新功能的字符输出流
 */
public class Demo03 {
	public static void main(String[] args) {
		String str="dsfdsfsdf,好好学习，天天向上";
		FileOutputStream fos;
		OutputStreamWriter osw;
		PrintWriter pw;
		try {
			fos = new FileOutputStream("src/day10/cf2.txt",true);
			osw = new OutputStreamWriter(fos,"utf8");
			/*
			 * 在创建时，多传一个boolean类型的参数，调用输出语句println时，
			 * 会自动将缓冲区的数据flush出去。
			 * 
			 * 注意：print不可以 
			 */
			pw  = new PrintWriter(osw,true);

			pw.print(str);
			pw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
