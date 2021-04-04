/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.io.File;
import java.io.IOException;

/**  
 *  文件的创建和删除
 */
public class Demo07 {
	public static void main(String[] args) {
		File file = new  File("src/day07/day07.data");
		
		//1、文件的创建
		try {
			//exists() 判断当前文件是否存在，存在则返回true，否则返回false
			if(!file.exists()) {
				/*
				 * isSuccess() 创建file所表示的文件，创建成功返回true
				 */
				boolean isSuccess = file.createNewFile();
				System.out.println("isSuccess: "+ isSuccess);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//2、delete()文件的删除,删除成功返回true，否则返回失败
		boolean isDelete=file.delete();
		System.out.println("isDelete: "+isDelete);
		
		
	}
}
