/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

/**   
 *  字符流：
 *		Reader  字符输入流的父类，以Reader结尾的基本都是字符输入流
 *		Writer  字符输出流的父类，以Writer结尾的基本都是字符输出流
 */
public class Demo05 { 
	public static void main(String[] args) {
		String str = "ewfhuewirheiwjrioew";
		
//		StringWriter sw = new StringWriter("src/day09/cf_test3.txt"); 
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		/*
		 *转换流（实现字节数据和 字符数据的转成）：
		 * 	OutputStreamWriter   写出时，会自动将字符数据转成字节数据，再输出
		 * 	InputStreamWriter    读文件时，会自动将字节数据转成字符数据，再写入
		 * 
		 */
		OutputStreamWriter osw = null;
		InputStreamReader isr = null;
		try {
			//------输出-------------------
			fos = new FileOutputStream("src/day09/cf_test3.txt");
			osw = new OutputStreamWriter(fos);
			/*
			 * write(String str) 将给定的字符数据输出
			 */
			osw.write(str);
			osw.flush();
			System.out.println("写出完毕");
			fis = new FileInputStream("src/day09/cf_test3.txt");
			isr = new InputStreamReader(fis);
			
			
			//------输入-------------------
			char[] ch = new char[100];
			/*
			 * int read()  ; 读一个字符数据，并以int的形式返回
			 * read(char[] ch); 将读到的数据存入字符数组中
			 */
			int len = isr.read(ch);
			String inputStr = new String(ch,0,len);
			System.out.println(inputStr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
