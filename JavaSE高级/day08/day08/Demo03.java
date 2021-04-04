/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo03 {
	public static void main(String[] args) {		
		RandomAccessFile raf=null;
		try {
			raf = new RandomAccessFile("src/day08/cf.dat","rw");
			String str="好好学习，天天向上";
			
			byte[] bs = str.getBytes();
			
			/*
			 * write(byte[] bytes)  重载方法，
			 * 	允许我们向指定文件中写入一个字节数组的数据
			 */
			raf.write(bs);
			System.out.println("写入数据完毕。。。。");
			
			raf.seek(0);
			
			/*
			 * read(byte bytes)
			 * 	 将读到的内容写入byte数组中
			 */
			byte[] bys = new byte[(int)raf.length()]; //raf.length()为当前文件大小
			raf.read(bys);
			
			String strRead = new String(bys);
			System.out.println("读到数据为：  "+strRead);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseIOUtlis.closeRandomAccessFile(raf);

		}
	}
}
