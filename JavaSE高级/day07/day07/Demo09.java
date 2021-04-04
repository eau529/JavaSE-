/**
 * <p>Title: Demo09.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.io.File;
import java.io.FileFilter;

/**  
 * 查看当前目录下的子项（目录和文件夹）
 *  
 */
public class Demo09 {
	public static void main(String[] args) {
		File file = new File("src");
		/*
		 * 1、listFiles获取当前文件下的所有子项，并以File数组的形式返回
		 */
//		File[] subFiles=file.listFiles();
//		for (File subFile : subFiles) {
//			System.out.println(subFile.isFile());
//			System.out.println((subFile.isFile()?"文件：":"目录:")+subFile.getName());
//		}
		
		/*
		 *2、 文件过滤器可以帮助我们获取当前目录下满足指定条件的子项
		 */
		FileFilter  filter=new FileFilter() {
			@Override
			public boolean accept(File file) {
				
				//条件： 只要是问价加即可
				return file.isDirectory();
			}
		};
		
		/*
		 * 通过重载的listFiles将文件过滤器传入
		 */
		File[] subFiles=file.listFiles(filter);
		for (File subFile : subFiles) {
			System.out.println(subFile.getName());
		}
	}
}
