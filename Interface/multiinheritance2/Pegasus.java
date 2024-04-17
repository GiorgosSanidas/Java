package interfaces.multiinheritance2;

class Pegasus extends Horse implements iBird {

	Pegasus() { 
		System.out.println("Pegasus constructor ..."); 
	}
	
	public void chirp() { 
		whinny(); 
	}
	
	public void fly() { 
		System.out.println("I can fly ...");
	}

}
