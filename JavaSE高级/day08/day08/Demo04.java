/**
 * <p>Title: Demo04.java</p>  
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
 * @ClassName: Demo04  
 * @Description: 实现文件的复制
 * @author: chenfan  
 * @date: 2018年11月26日  
 *  
 */
public class Demo04 {
	
	/*
	 * 采用一字节一字节的方式去复制文件，效率偏低
	 */
	public static void copyMethod1() {
		RandomAccessFile writeRaf=null;
		
		RandomAccessFile readRaf=null;
		try {
			readRaf	= new RandomAccessFile("src/day08/cfmp3.mp3","r");
			writeRaf = new RandomAccessFile("src/day08/cfmp3_copy.mp3","rw");
			
			long startTime=System.currentTimeMillis();
			
			int d=-1; //用来存放一字节的数据
			while((d=readRaf.read())!=-1) {
				writeRaf.write(d);
			}
			long endTime=System.currentTimeMillis();
			
			System.out.println("复制完毕，耗时 ："+(endTime-startTime));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseIOUtlis.closeRandomAccessFile(writeRaf);
			CloseIOUtlis.closeRandomAccessFile(readRaf);
		}
	} 
	
	public static void copyMethod2() {
		RandomAccessFile writeRaf=null;
		
		RandomAccessFile readRaf=null;
		try {
			readRaf	= new RandomAccessFile("src/day08/cfmp3.mp3","r");
			writeRaf = new RandomAccessFile("src/day08/cfmp3_copy2.mp3","rw");
			long startTime=System.currentTimeMillis();
			
			byte[] bys = new byte[10240];
			
			int len=-1;  //表示每次实际读到的字节量 
			
			/*
			 * int read(byte[] bytes) 
			 * 		会返回一个int值，表示实际读到的字节数
			 */
			while((len=readRaf.read(bys))!=-1) {
				
				/*
				 * write(byte[] b, int off, int len);  重载方法
				 * 	  将给定的字节数组b中的数据写入,
				 * 	 off表示字节数组的某个位置开始写数据
				 *   len表示写入到字节数
				 */
				writeRaf.write(bys,0,len);
			}

			long endTime=System.currentTimeMillis();
			System.out.println("复制完毕，耗时 ："+(endTime-startTime));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseIOUtlis.closeRandomAccessFile(writeRaf);
			CloseIOUtlis.closeRandomAccessFile(readRaf);
		}
	} 
	
	public static void main(String[] args) {
		copyMethod2();
		
		
	}
}
