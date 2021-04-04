/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  
 *  java.io.File： 该类的每一个实例都表示当前操作系统上的一个文件或者目录
 *
 *		 注意：创建了该对象，不一定代表对应的文件或者目录就已经存在
 *
 *  File对象只能帮助我们  1、实现对文件属性的访问，比如 名字、大写
 *  					2、对文件或者目录实现     创建 和 删除
 *  					3、访问当目录下的子项
 *  	但是不可以实现对文件内容的访问。
 */
public class Demo06 {
	public static void main(String[] args) {
		/*
		 * File在创建时需要我们传入指定的文件或者目录路径，
		 * 
		 * 路径使用的两种方式：
		 * 		1、绝对路径：文件或者目录在 硬盘上的真实全路径（物理路径）
		 * 		比如： E:\\eclipse\\workspace\\Gok1808_SEapi\\src\\day07\\subtest\\c.txt
		 * 
		 * 			在实际的开发中，我们应当避免使用绝对路径，
		 * 			从而避免项目部署环境导致的文件路径不一致的问题。
		 * 		
		 * 
		 * 		2、相对路径：  文件相对于某个基准目录   的参考路径。
		 * 			" . "   :  表示当前程序的根目录
		 * 					比如：  E:\\eclipse\\workspace\\Gok1808_SEapi
		 *			 " .. " : 表示当前基准的目录的上层目录 
		 *
		 * 注意： 为了避免不同操作系统带来的文件目录分隔符的差异，
		 * 		实际开发中目录分隔符建议使用  file提供的常量 File.separator
		 */
//		File file=new File("E:\\eclipse\\workspace\\Gok1808_SEapi\\src\\day07\\subtest\\c.txt");
		
//		File file=new File("./src/day07/subtest/cf.txt");
		
		/*
		 * 在java中，普通项目的参照基准目录就是当前项目目录
		 */
//		File file=new File("src/day07/subtest/cf.txt");
		File file=new File(".."+File.separator+"se1808"+File.separator+"se1808.txt");
		
		/*
		 * 1、file.length()  获取当前文件的大小，单位是字节
		 */
		long fileSize=file.length();
		System.out.println("当文件大小为： "+fileSize);
		
		/*
		 * 2、获取当前文件对象所表示的文件名
		 */
		String fileName=file.getName();
		System.out.println("fileName： "+fileName);
		
		/*
		 * 3、 isDirectory()  判断当前File对象 是否表示一个目录
		 * 	  isFile()       判断当前File对象 是否表示一个文件
		 */
		boolean isDirectory=file.isDirectory();
		System.out.println("isDirectory:"+isDirectory);
		
		/*
		 * 4、判断当文件文件对象能否读 或则写
		 */
		boolean canWrite = file.canWrite();
		boolean canRead = file.canRead();
		System.out.println("canWrite: "+ canWrite);
		System.out.println("canRead: "+ canRead);
		
		/*
		 * 5、判断File对象所表示当前目录下是否含有隐藏文件
		 */
		boolean isHidden = file.isHidden();
		System.out.println("isHidden :" +isHidden);
		
		/*
		 * 6、 获取当前文件的最后修改
		 */
		long lastMofify=file.lastModified();
		Date date=new Date();
		date.setTime(lastMofify);
		String lastDate=new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(date);
		System.out.println("lastDate :"+ lastDate);
	}
}
