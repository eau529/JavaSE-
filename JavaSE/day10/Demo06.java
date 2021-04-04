/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/**  
 * 权限（访问）修饰词（共四个），用来修饰变量，方法，类:
 * 
 * 	public        公有的           被其修饰后，可以在任何地方被访问
 * 	protected	    受保护的       被其修饰后， 可以在本类、同包类、继承中被访问
 * 	默认                    默认权限        被其修饰，可以在本类，同包类中被访问
 * 	private       私有的           被其修饰后，只能在被类中被访问
 *  
 */
public class Demo06 {
	public String filed1="publicFiled";
	protected String filed2="protectedFiled";
	String filed3="filed3";
	private String filed4="privateFiled";
	
	public static void main(String[] args) {
		Demo06 demo=new Demo06();
		System.out.println(demo.filed1);
		System.out.println(demo.filed2);
		System.out.println(demo.filed3);
		System.out.println(demo.filed4);
	}
}




