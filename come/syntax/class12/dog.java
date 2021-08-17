package come.syntax.class12;

public class dog {

	
	String name;
	String breed;
	String color;
	int age;
	double weight;
	char gender;
	double height;
	
	
	void bark() {
		System.out.println("Dog can bark");
	}
    void sleep() {
    	System.out.println("Dog can sleep");
    }	
    
    void run() {
    	System.out.println("Dog can run");
    }
	public static void main(String[] args) {
	
		dog dog1 = new dog();
		dog1.name = "Jack";
		dog1.color = "White";
		dog1.weight = 22.3;
		dog1.breed = "Poppy";
		dog1.gender = 'M';
		dog1.age = 3;
		
        dog1.bark();
        dog1.sleep();
       
        dog dog2 = new dog();
        dog2.name = "Khapray";
        dog2.color = "Brown";
        dog2.weight = 16.3;
        dog2.breed = "Grey";
        dog2.age = 5;
        dog2.gender = 'F';
        dog2.height = 2.4;
        dog2.sleep();
        
        
	}

}
