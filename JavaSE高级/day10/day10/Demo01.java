/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**  
 * FileReader  是InputStreamReader的子类
 * FileWriter  是OutputStreamWriter 的子类
 * 
 *它两都是属于读取字符串的便捷类， 
 *	他们两个的构造器都有默认的 字符编码以及 默认的字节缓冲区。
 *
 *
 *FileReader 和 FileWriter用于读写字符流，
 *如果我们想能够读取原始的字节流，
 *并且同时指定字符的编码格式应当使用它们的父类InputStreamReader和OutputStreamWriter。
 *一般来说使用它们的父类会更多些，因为FileReader 和FileWriter都是默认字符编码格式，可能会造成乱码问题。
 */
public class Demo01 {
	public static void main(String[] args) {
		String str = "好好学习，天天向上";
		
		try {
			FileWriter  fw = new FileWriter("src/day10/cf.txt");
			fw.write(str);
			fw.flush();
			System.out.println("写出字符串完毕");
			
			FileReader fr = new FileReader("src/day10/cf.txt");
			char[] ch = new char[100];
			int len = fr.read(ch);
			
			String getStr = new String(ch,0,len);
			System.out.println("读到的数据为： " + getStr);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
