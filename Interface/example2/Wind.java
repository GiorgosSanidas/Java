package interfaces.example2;

class Wind implements Instrument {

	public void play() {
        System.out.println("Wind.play()");
    }
    
	public String what() { return "Wind"; }
    
	public void adjust() { }
}
