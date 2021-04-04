/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**  
 *  异常处理方式：throws 将异常向外抛出
 *				  需要注意的是，异常抛出以后，并没有得到解决，
 *				  它只是告诉当前方法的调用者 ，
 *				  调用此方法时需要解决对应类的异常（解决方式可以是try catch，也可以是继续throws向外抛出） 
 */
public class Demo05 {
	public static void main(String[] args) throws ParseException {
//		System.out.println("程序开始。。。。。");
//		
		new SimpleDateFormat("yyyy-MM-dd").parse("1998/09/07");
		
//		System.out.println("程序结束。。。。。");
		
		test3();
	}
	
	
	public static void test1() throws IllegalAgeException {
		Student stu=new Student();
		stu.setAge(180);
//		try {
//			
//		} catch (IllegalAgeException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
		
	}
	
	public static void test2() throws IllegalAgeException {
		test1();
	}
	
	
	public static void test3() {
		try {
			test2();
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class Student{
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * throws 表示当方法会抛出对应类型的异常
	 * throw  表示抛出指定的异常对象
	 */
	public void setAge(int age) throws IllegalAgeException{
		if(age>150 || age <0) {
			throw new IllegalAgeException("年龄输入不合法");
		}
		this.age = age;
	}
}

/*
 * 自定义异常：直接继承 exception即可，此时定义的是 检查性异常
 * 			    如果继承 RuntimeException，定义的是非检测异常
 */
class IllegalAgeException extends Exception{
	private static final long serialVersionUID = 8722879725892269749L;
	
	public IllegalAgeException() {
		super();
	}
	public IllegalAgeException(String messgae) {
		super(messgae);
	}
}

