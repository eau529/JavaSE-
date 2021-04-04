/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day13;

public class Demo03 {
	public void serviceMethod1(ServiceInterface sif) {
		System.out.println("程序核心业务代码1");
		sif.method1();
	}
	public void serviceMethod2(ServiceInterface sif) {
		System.out.println("程序核心业务代码2");
		sif.method1();
	}
	public void serviceMethod3(ServiceInterface sif) {
		System.out.println("程序核心业务代码3");
		sif.method2();
	}
	
	public static void main(String[] args) {
		Demo03 demo=new Demo03();
		ServiceInterface sif=new B();
		demo.serviceMethod1(sif);
	}
}

interface ServiceInterface{
	public void method1();
	public void method2();
}

//class A implements ServiceInterface{
//	public void method1() {
//		System.out.println("A.method1()");
//	}
//	public void method2() {
//		System.out.println("A.method2()");
//	}
//}

class B implements ServiceInterface{
	@Override
	public void method1() {
		System.out.println("新功能method1()");
		
	}
	@Override
	public void method2() {
		System.out.println("新功能method2()");
	}
	
}


