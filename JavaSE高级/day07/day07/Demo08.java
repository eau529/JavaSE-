/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.io.File;

/**  
 *  文件夹的创建和删除
 */
public class Demo08 {
	public static void main(String[] args) {
		File file1 = new File("src/a");
		/*
		 * mkdir()  在指定的路径下创建 单个文件夹
		 */
		boolean isSuccess1 = file1.mkdir();
		System.out.println("isSuccess1 :"+ isSuccess1);
		
		File file2 = new File("src/a/b/c/d/e/f/g");
		if(!file2.exists()) {
			boolean isSuccess2 = file2.mkdirs();
			System.out.println("isSuccess2 :"+ isSuccess2);
		}else {
			System.out.println("目录已存在");
		}
		
		
		/*
		 * 文件目录的删除
		 * 		src/a/b/c/d/e/f/g 表示删除g目录
		 *      删除目录时必须保证当前目录为空目录
		 */
		File file3 = new File("src/a/b/c/d/e/f/g");
		boolean isDelete=file3.delete();
		System.out.println("isDelete :"+ isDelete);
	}
}
