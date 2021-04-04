/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

/**  
 * @ClassName: Demo01  
 * @Description: TODO 
 * @author: chenfan  
 * @date: 2018年10月12日  
 *  
 *面向对象：  一种思想，是我们审视问题的一种角度
 * 
 *程序中的面向对象：
 * 		类     ：对具有相同 属性 和 行为（方法）的对象（个体） 的抽象描述就是类
 * 		对象 ：对象就是类的具现化
 *
 */
public class Demo01 {
	
	//定义一个方法用来打印学生的信息
	public static void printStudentInfo(Student student) {
		System.out.println("studentName:"+student.studentName+",age:"+
				student.age+",classNo:"+student.classNo+",money:"+student.money+"，schoolName:"+student.schoolName);
	}
	
	public static void studentService(Student student) {
		System.out.println("进行一定的业务逻辑处理。。。。。");
		printStudentInfo(student);
	}
	
	public static void main(String[] args) {
		//假装这个4个数据是从数据库中取出
		System.out.println("-----从数据库获取数据-------");
		String studentName="lxy";
		int age=16;
		String classNo="SE1808";
		double money=1.8;
		System.out.println("-----数据取出完毕-------");
		
		// 调用studentService()需要一个学生对象，我们就给一个
		//通过new 关键字来创建学生实体， 然后将该实体对象  赋值给引用变量student
		Student student=new Student();
		
		//对学生对象的属性进行初始化赋值操作
		student.studentName=studentName;
		student.age=age;
		
		student.classNo=classNo;
		student.money=money;
		student.schoolName="协和";
		
		student.run();
			
		//调用指定的方法进行学生信息打印
		studentService(student);
	}
}
