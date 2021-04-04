/**
 * <p>Title: Demo02.java</p>  
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
 *  在RandomAccessFile中提供了对指针的操作
 */
public class Demo02 {
	public static void main(String[] args) {
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile("src/day08/cf.dat","rw");
			raf.write(98);
			System.out.println("文件写入完毕。。。。");
			/*
			 * long getFilePointer()获取当前指针的位置
			 */
			System.out.println("此时指针的位置： "+ raf.getFilePointer());
			
			/*
			 * 要求： 写入一个int的最大值
			 * 		01111111 11111111 11111111 11111111
			 * --------------------------------------------------
			 * 		00000000 00000000 00000000 01111111  write(maxIntValue>>>24)
			 * 		00000000 00000000 01111111 11111111  write(maxIntValue>>>16)
			 * 		00000000 01111111 11111111 11111111  write(maxIntValue>>>8)
			 * 		01111111 11111111 11111111 11111111  write(maxIntValue)
			 */  
			int maxIntValue=Integer.MAX_VALUE;
//			raf.write(maxIntValue>>>24);
//			raf.write(maxIntValue>>>16);
//			raf.write(maxIntValue>>>8);
//			raf.write(maxIntValue);
		
			/*
			 *在RandomAccessFile提供了读写基本数据类型值的所有方法
			 * 	比如  writeInt(int value)  写入一个int数据，写入时会连续写入4字节数据
			 * 		 readInt()            读取一个int数据，会连续读取4个字节
			 */
			raf.writeInt(maxIntValue);
			System.out.println("此时指针的位置： "+ raf.getFilePointer());
			
			raf.writeDouble(12.4);
			
			/*
			 *seek(long index)设定指针的位置值
			 */
			raf.seek(0);
			int getByte=raf.read();
			System.out.println("读到的数据为getByte： "+ getByte);
			
			int i=raf.readInt();
			System.out.println("读到的数据为i： "+ i);
			
			double d=raf.readDouble();
			System.out.println("读到的数据为d： "+ d);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
