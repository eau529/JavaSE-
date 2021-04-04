/**
 * <p>Title: HomeWork.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

/**  
 * @ClassName: HomeWork  
 * @Description: TODO 
 * @author: chenfan  
 * @date: 2018年10月17日  
 *  
 */
public class HomeWork {
	public static void main(String[] args) {
		Stdudent s1=new Stdudent();
		s1.setAge(19);
		System.out.println(s1.getAge());
		
	}
}
class Stdudent{
	int age;
	String name;
	final String calssNo="SE1808";
	int score;
	public Stdudent() {
		
	}

	public Stdudent(int age, String name, int score) {
		super();
		this.age = age;
		this.name = name;
		this.score = score;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the calssNo
	 */
	public String getCalssNo() {
		return calssNo;
	}
	
	
	
}