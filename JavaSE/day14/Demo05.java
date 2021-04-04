/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day14;

/**  
 *代码设计的基石原则：   
 *		对修改关闭，对扩展开放 
 *		
 *		当我们将程序设计完成以后， 如果想进行功能上的扩展或者修改，
 *		那么尽最大可能的 不要取修改已经写好的源码
 *		
 *设计模式  —— 1、策略模式： 
 *	 			简单来说它定义了一个算法族，然后将他们分别封装起来，
 *				让他们之间可以相互替代， 此模式可以让算法的变化 
 *			 	独立于使用算法的客户			
 */
public class Demo05 {
	public static void main(String[] args) {
		Calculator ca=new Calculator();
		//指定加法计算
		ca.setOperation(new MulOperation());
		int x=ca.doOperation(1, 2);
		
		System.out.println("x:"+x);
	}
}
/*
 * 需求：  现在我们来定义一个计算器类，用来计算 加减乘除
 */

//先定义一个计算器的接口类，用来定义计算的方法
interface Operation{
	//定义一个用来计算的方法
	public int doOperation(int num1,int num2);
}

// 定义加法计算的类
class AddOperation implements Operation{
	@Override
	public int doOperation(int num1, int num2) {
		return num1+num2;
	}
}
//定义减法计算的类
class SubOperation implements Operation{
	@Override
	public int doOperation(int num1, int num2) {
		return num1-num2;
	}
}

//扩展乘法操作
class MulOperation implements Operation{
	@Override
	public int doOperation(int num1, int num2) {
		return num1*num2;
	}
}

// 定义一个 计算器实体类
class Calculator{
	private Operation operation;
	public void setOperation(Operation operation) {
		this.operation=operation;
	}
	
	public int  doOperation(int num1, int num2) {
		return operation.doOperation(num1, num2);
	}
}


