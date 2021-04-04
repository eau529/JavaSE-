/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**  
 * java.io.RandomAccessFile 随机文件读写流
 *     其是基于指针来实现对文件数据的读写操作，比较灵活  	
 */
public class Demo01 {
	public static void main(String[] args) {
		
		/*
		 * RandomAccessFile 提供了两个常用构造器
		 * 		RandomAccessFile(File file, String mode)
		 * 		RandomAccessFile(String filePath, String mode)
		 *  file 表示file对象， filePath表示文件路径
		 *  
		 * 	mode参数： 表示读写模式， 有两个值， "r" 表示只读模式 ，"rw" 读写模式
		 */
		RandomAccessFile writeRaf=null;
		
		RandomAccessFile readRaf=null;
		try {
			writeRaf = new RandomAccessFile("src/day08/cf.dat","rw");
			readRaf	= new RandomAccessFile("src/day08/cf.dat","r");
			
			/*
			 * 向指定的文件中写入一字节数据
			 * write(int d) : 将给定的字节数据写入到对应的文件中，
			 * 				  需要传入一个int值，但是只取该int值的低八位
			 * 00000000 00000000 00000000 01100001 
			 */
			writeRaf.write(97);
			System.out.println("写出完毕。。。");
			
			/*
			 * read() 读取一字节的数据，并且以int的形式返回。
			 *        如果读到文件的末尾返回-1。
			 *
			 *	需要注意的是，使用RandomAccessFile进行读写时，
			 *				 指针的位置会随之移动
			 */
			int getByte=readRaf.read();
			System.out.println("读取完毕。。。读到的数据为："+getByte);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseIOUtlis.closeRandomAccessFile(writeRaf);
			CloseIOUtlis.closeRandomAccessFile(readRaf);
		}
	}
}
