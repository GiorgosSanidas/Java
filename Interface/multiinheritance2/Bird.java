package interfaces.multiinheritance2;

class Bird implements iBird {

	private int weight;
	
	public Bird() { 
		System.out.println("Bird constructor ..."); 
	}
	
	public void chirp() { 
		System.out.println("Chirp ..."); 
	}
	
	public void fly() { 
		System.out.println("I can fly ...");
	}
	
}
