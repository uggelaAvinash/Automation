package OOPS;
class Animal {
	void eat() {
	    System.out.println("animal is eating");
	    
	}
}   
class Dog extends Animal {
	    void bark() {
	    System.out.println("Dog is barking");
	    }
	 
}

public class Inheritance {

	public static void main(String[] args) {
	   Dog obj=new Dog();
	   obj.eat();
	   obj.bark();
	   

	}

}

