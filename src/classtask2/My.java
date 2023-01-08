package classtask2;

public class My {

	public static void main(String[] args) {

		Dog.myMethod();
		Dog mydog = new Dog("Tony" , "German Shepherd", 5);
		
		Person myperson = new Person("Jhon", 20, mydog);
		myperson.greet();
				
		System.out.println("Hello, my name is " + myperson.name+" and this is my dog " +mydog.Name);
		
		
	}

}


class Dog{
	

	String Name,Bread;
	int age;
	
	
	static void myMethod() {
		    System.out.println("Woof!");
		  }
	
	public Dog(String Name, String Bread, int age) {
		
		this.Name = Name;
		this.Bread = Bread;
		this.age = age;
		
	}
	
}


class Person{
	
	String name;
	int age;
	Dog dog;
	
	public Person(String name, int age, Dog dog) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public void greet() {
		
		System.out.println("Hello, my name is " + name + "and this is my dog "+ dog.Name);
		
	}
	
}