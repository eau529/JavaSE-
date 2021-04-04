/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

import java.util.Scanner;
public class Demo10 {
	public static void main(String[] args) {
		User user = new User();
		user.setName("cf");
		System.out.println(user.getName());
		user.setPassword("defsf");
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			user.setAge(age);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
/**  
 * javaBean : java程序中一个可复用的公共组件，一般用来不同类之间的数据传输
 *  
 *	javaBean的一般定义规则：
 *		1、javaBean类必须为一个公共类，即类的修饰词为public
 *		2、其所有属性为private
 *		3、对于属性的操作，需要通过一组对应的setXXX(Object obj) 和 getXXX() 来实现操作
 *		4、javaBean必须有一个无参构造函数
 *		5、建议实现反序列化接口
 *
 *java的三大特征： 封装，继承，多态
 *		
 *		封装： 将数据和对数据的操作放在一起，形成一种新的数据类型，
 *			    以实现对代码的复用
 *
 */
class User{
	private String name;
	private String password;
	private String gedner;
	private double money;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the gedner
	 */
	public String getGedner() {
		return gedner;
	}
	/**
	 * @param gedner the gedner to set
	 */
	public void setGedner(String gedner) {
		this.gedner = gedner;
	}
	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception{
		if(age>10&&age<60) {
			this.age=age;
		}else {
			throw new Exception();
		}
	}
	
	
	
}