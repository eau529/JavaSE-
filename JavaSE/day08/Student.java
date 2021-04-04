/**
 * <p>Title: Student.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

/*
 * 定义一个学生类数据
 *  
 */
public class Student {
	
	//定义实例变量
	String studentName;
	int age;
	String classNo;
	double money;
	String IdNo;
	static String schoolName="协和";
	
	
	public static void eat() {
		System.out.println("Student.eat()");
	}
	
	public void run() {
		System.out.println("学生的run方法");
	}
	
	
}
