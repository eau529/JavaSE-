/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

/**  
 * 构造器/构造函数:
 *    用来创建对象，且同时进行一些初始化操作
 * 
 *	语法：   权限修饰词 + 类名(){ }
 *
 *	分类： 无参数构造器
 *			可以不写，一般编译器在编译时会自动检测类中是否存在构造器，
 *			如果不存在，则默认添加一个无参构造器
 *			
 *			但是需要注意的是，如果自己手写了有参数构造器，
 *			那么编译器不再会自动添加无参构造器，
 *			一般建议手写了有参构造器，也将无参构造器加上
 *
 *		    有参数构造器   : 一般多用来进行属性值的初始化
 */
public class Demo03 {
	
	int x;
	int y;
	
	public Demo03() {
		System.out.println("无参构造器");
	}
	
	public Demo03(int x,int y) {
		System.out.println("有参数构造器");
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args) {
		Demo03 demo=new Demo03();
		System.out.println(demo.x);
		
		Demo03 demo1=new Demo03(1,3);
		System.out.println(demo1.x);
	}
}
