/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
 * 
 * ObjectInputStream    对象输入流，读取指定的对象文件，
 * 						  并以对应类的对象的形式返回。
 * 
 * ObjectOutputStream   对象输出流，将给定的对象存入对应的对象文件中。
 */
public class Demo04 {
	public static void write() {
		Student s1 = new Student("chenfan",18,"1808","13388881111");
		FileOutputStream fos = null ;
		ObjectOutputStream oos =null;
		try {
			fos = new FileOutputStream("src/day09/student.obj");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} 
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois =null;
		try {
			fis = new FileInputStream("src/day09/student.obj");
			ois = new ObjectInputStream(fis);
			
			Student s1= (Student)ois.readObject();
			System.out.println(s1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	} 
	public static void main(String[] args) {
//		write();
		read();
	}
}

/*
 *Serializable 序列化接口
 *		当我们使用对象流进行 对象 读写操作时，
 *		那么该对象的类则应当实现 序列化接口Serializable，
 *		同时指定当前类序列化版本号。
 */
class Student implements Serializable{
	/**
	 *序列化版本号：
	 * 	  当实例序列化接口时，应实现此序列化版本号，它觉得当前类的实例 是否能够反序列化成功。
	 * 	 当我们使用ObjectInputStream进行反序列化时，
	 *  会检测被反序列化的对象的 版本号  和 当前类的版本号是否一致，
	 *  一致则反序列化成功，并且即当前类的结构发生了一定的变化，则还是会采取兼容模式还原（即能用的属性都用）
	 *  如果不一致，则抛出异常。
	 */
	private static final long serialVersionUID = 8771893720949923906L;
	
	private String name;
	private int age;
	private String classNo;
	
	
	/*
	 * transient关键字： 修饰属性，作用是在对象进行序列化时，
	 *                  将该属性值忽略，从而达到对象“瘦身”的目的
	 */
	private transient String phoneNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, String classNo, String phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.classNo = classNo;
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", classNo=" + classNo + ", phoneNo=" + phoneNo + "]";
	}

}
