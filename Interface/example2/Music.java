package interfaces.example2;

public class Music {
 
	static void tune(Instrument i) { 
		i.play(); 
	}
    
	static void tuneAll(Instrument[] e) {
         for(int i = 0; i < e.length; i++) 
        	 tune(e[i]);
    }
    
	public static void main(String[] args) {
         Instrument[] orchestra = new Instrument[5];
         int i = 0;
         // Upcasting during addition to the array:
         orchestra[i++] = new Wind();
         orchestra[i++] = new Percussion();
         orchestra[i++] = new Stringed();
         orchestra[i++] = new Brass();
         orchestra[i++] = new Woodwind();
         tuneAll(orchestra);
         
         Wind w = new Wind();
         boolean b = w instanceof Instrument;
         System.out.println("b="+b);
         
         Woodwind ww = new Woodwind();
         boolean b1 = ww instanceof Wind;
         System.out.println("b1="+b1);

         boolean b2 = ww instanceof Instrument;
         System.out.println("b2="+b2);

    }
}