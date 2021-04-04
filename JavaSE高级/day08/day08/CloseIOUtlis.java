/**
 * <p>Title: CloseIOUtlis.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

import java.io.IOException;
import java.io.RandomAccessFile;

/**  
 * @ClassName: CloseIOUtlis  
 * @Description: 用来进行流的关闭
 * @author: chenfan  
 * @date: 2018年11月26日  
 *  
 */
public class CloseIOUtlis {
	public static void closeRandomAccessFile(RandomAccessFile raf) {
		if(raf!=null) {
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
