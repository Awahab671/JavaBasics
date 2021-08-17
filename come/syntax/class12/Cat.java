package come.syntax.class12;

public class Cat {

	String name;
	String color;
	int age;
    void eat() {
    	
    	System.out.println(name+" is eating.");
    }
    
    void sleep() {
    	System.out.println(name+" is sleeping.");
    }
	
	
	
	public static void main(String[] args) {
	
		Cat cat1 = new Cat();
		cat1.name = "Tom";
		cat1.color = "White and black";
		cat1.age = 8;
		cat1.sleep();
		cat1.eat();
		
		Cat cat2 = new Cat();
		cat2.name = "pishak";
		cat2.color = "Yellow";
		cat2.age = 15;
		cat2.sleep();
	}

}
