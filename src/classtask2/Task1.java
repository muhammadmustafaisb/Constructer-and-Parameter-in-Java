package classtask2;

public class Task1 {

	public static void main(String[] args) {

		Dog1 mydog = new Dog1("Max", "German S" , 5);
		Person1 myperson = new Person1("Jhon" , 5, mydog);
		mydog.brack();
		myperson.greet();
		
		
	}

}

class Dog1{
	
	String name,breed;
	int age;
	
	public Dog1(String name, String breed, int age) {

		this.name = name;
		this.breed = breed;
		this.age = age;
		
	}
	
	public void brack() {
		
		System.out.println("Woof!");
	}
}

class Person1{
	
	
	String name;
	int age;
	Dog1 dog;
	
	public Person1(String name, int age, Dog1 dog) {
		
		this.name = name;
		this.age = age;
		this.dog = dog;
	}
	
	public void greet() {
		
		System.out.println("Hello, my is " + name + "and this is my dog, " + dog.name);
		
	}

}
