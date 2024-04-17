package interfaces.example2;

class Woodwind extends Wind {
    
	public void play() {
		super.play();
        System.out.println("Woodwind.play()");
    }
    
	public String what() { 
		return "Woodwind"; 
	}
}
