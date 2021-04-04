/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**  
 * 字符缓冲输入流： BufferedReader
 *  
 */
public class Demo04 {
	public static void main(String[] args) {
		FileInputStream fis;
		
		
		InputStreamReader isr;
		BufferedReader br;
		try {
			fis = new FileInputStream("src/day10/cf2.txt");
			isr = new InputStreamReader(fis,"utf-8");
			br = new BufferedReader(isr);
			
			/*
			 * readLine() 以行为单位读取字符数据，
			 * 	该方法会连续读取若干个字符串，直到遇到换行符为止，
			 *  读到文件末尾则返回null
			 */
			String readLine = null;
			while((readLine=br.readLine())!=null) {
				System.out.println(readLine);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
