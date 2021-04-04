/**
 * <p>Title: HomeWork.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day12;
public class HomeWork {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.bark();
	}
}

class Animal{
	public Animal(){
		System.out.println("Animal构造器被调用");
	}
	public void bark(){
		System.out.println("bark()");
	}
}
class Dog extends Animal{
	public Dog() {
		System.out.println("Dog()");
	}
	
	public void bark(){
		super.bark();
		System.out.println("Dog.bark()");
	}
}
class Cat extends Animal{
	public void bark(){
		System.out.println("Cat.bark()");
	}
}
class Serpent extends Animal{
	public void bark(){
		System.out.println("Serpent.bark()");
	}
}