/**
 * <p>Title: HomeWork01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day11;

public class HomeWork01 {
	public static void main(String[] args) {
		Student student=new Student();
		student.id=1001;
		student.name="cf";
		student.special=true;
		Score score=new Score(80,89,90);
		
		student.score=score;
		
		if(student.special) {
			System.out.println(student.name+"的总成绩为："+(student.score.getTotalScore()+10));
		}else {
			System.out.println(student.name+"的总成绩为："+student.score.getTotalScore());
		}
	}
}

class Student{
	public int id;
	public String name;
	public boolean special;
	public Score score;
	
	
	
}

class Score{
	public double english;
	public double chinese;
	public double math;

	public Score(double english, double chinese, double math) {
		super();
		this.english = english;
		this.chinese = chinese;
		this.math = math;
	}
	
	
	// 求总分的方法
	public double getTotalScore() {
		double totalScore=english+chinese+math;
		return totalScore;
	}
	// 求平均成绩
	public double average() {
		double avgScore=getTotalScore()/3;
		return avgScore;
	}
}