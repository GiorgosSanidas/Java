package constructors;

class Person {
	
    private String name;
	
    public Person(String name) {
    	this.name = name;
    }
	
    public void speak(String s) {
    	System.out.println(name+": "+s);
    }
}

public class Conversation {
	
    public static void main(String[] args) {
		Person alice = new Person("Alice");
		Person bob = new Person("Bob");
		alice.speak("Hi Bob");
		bob.speak("Hi Alice");
    }
}