/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * set集合
 * 		常见实现类：
 * 				HashSet ： 基于hashcode机制存放数据，
 * 						     当我们想快速访问set集合中的元素时，用HashSet
 * 				TreeSet ： 对set集合中的元素按照了从小到大的自然排序方式进了排序，
 * 						     对于这个被排序元素需要实现排序接口，自定义排序规则，否则报错。
 * 				LinkedHashSet ：按照元素存放顺序来 存储数据
 * 		 在添加元素时，不允许元素重复，它存放元素时，
 * 		会通过存入对象的equals方法来检查该元素是否已经存在，
 * 		不存在，则添加，否则不添加。
 * 		因此，存入set集合中的元素一般都要求重写equals()
 */
public class Demo05 {
	public static void main(String[] args) {
		Student stuent=new Student("cf",21);
		List<Student> list=new ArrayList<>();
		list.add(stuent);
		list.add(stuent);
		System.out.println("list"+list);
	
		Set<Student> set=new HashSet<>();
		set.add(stuent);
		Student stuent1=new Student("cf",21);
		set.add(stuent1);
		
		set.add(new Student("waermazi",18));
		set.add(new Student("张二狗",38));
		set.add(new Student("李四",25));
		
		System.out.println("set:"+set);
		
	}
}
class Student{
	private String name;
	private int age;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

