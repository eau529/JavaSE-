package day08;

public class Demo01 {
	
	public static void main(String[] args) {		
		/*
		 * 类中的属性（变量）分类：
		 * 		1、局部变量 ：
		 * 			只在某个代码段中使用的变量，比如在方法、if ，循环的某个局部代码段中生效,
		 * 			使用的时候不能超过其作用域范围，同时在进行运算时需要手动初始化赋值操作
		 * 
		 * 		2、全局变量
		 * 			直接定义在类中的变量，作用域 可以是整个类体乃至包括类外，
		 * 			使用时可以不手动初始化，有对应的数据类型的默认值
		 * 			
		 * 			全局变量的分类：
		 * 				2.1  实例变量（成员变量）
		 * 					 不被static修饰的变量都是实例变量， 
		 * 					  它表示当前对象私有的属性
		 * 				  调用： 对象.属性名
		 * 
		 * 				2.2  静态变量（类变量）
		 * 					  所有被static修饰的变量 都是静态变量，
		 * 					  它表示该变量被当前类的所有对象所共有
		 */
		
		Student  student1=new Student();
		student1.studentName="cf";
		student1.money=1200;
		
		Student  student2=new Student();
		student2.studentName="lxy";
		student2.money=120;
		
		student2.money=student2.money-100;
		
		System.out.println("student1.money:"+student1.money);
		System.out.println("student2.money:"+student2.money);
		
		//--------------------------------------------------------
		
		//测试静态变量
		System.out.println("student1.schoolName:"+student1.schoolName);
		System.out.println("student2.schoolName:"+student2.schoolName);
		
		//一般来说调用静态变量，不建议使用 对象.静态变量名   的方式调用
		// 建议使用     类名.属性名
//		student1.schoolName="大协和";
		Student.schoolName="大协和";
		
		System.out.println("student1.schoolName:"+student1.schoolName);
		System.out.println("student2.schoolName:"+student2.schoolName);
		
		// 测试局部变量的作用域
		if(true) {
			int x=10;
		}
		
		if(true) {
			int y=20;
//			int z=x+y; // x为局部变量，不在同一作用域上，不能直接使用
		}
	}
}
