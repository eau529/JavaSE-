/**
 * <p>Title: Demo01.java</p>  
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

import day08.CloseIOUtlis;

/**  
 * IO流： 简单来说就是对指定文件的进行读写操作的类  
 * 	分类：
 *		1、字节流，以字节为单位读写数据
 *		   inputStream ： 所有字节输入流的父类
 *		   outputStream ： 所有字节输出流的父类
 *
 *		2、字符流，以字符为单位操作文本数据（比如 html,xml.txt,text,dat...）
 */
public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 1、FileOutputStream   文件字节输出流
		 * 	  FileInputStream    文件字节输入流
		 *都属于低级流
		 */
		
		/*
		 * FileOutputStream常见构造器：
		 * 	   FileOutputStream(File file)
		 *     FileOutputStream(String filePath)
		 *     否是覆盖写操作
		 *     
		 *     FileOutputStream(String filePath,boolean append)
		 *     当append的值为true时，表示进行的是追加写操作
		 */
		FileOutputStream fos = null;
		
		
		/*
		 * FileInputStream  常见构造器
		 * 		FileInputStream(File file)
		 * 		FileInputStream(String filePath)
		 */
		FileInputStream fis = null;
		
		try {
			//----输出-------------------------------
			fos = new FileOutputStream("src/day09/cf_test.dat",true);
			String str = "写入数据";
			byte bs[] = str.getBytes();
			fos.write(bs);
			System.out.println("写入完毕。。");
			
			
			// ------输入 ------------------------------------
			fis = new FileInputStream("src/day09/cf_test.dat");
			byte[] inputBys = new byte[100];
			
			int len = fis.read(inputBys);
			
			String inputStr = new String(inputBys,0,len,"utf-8");
			System.out.println("读到的数据为： "+ inputStr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseIOUtlis.closeOutputStream(fos);
		}
	}
}
