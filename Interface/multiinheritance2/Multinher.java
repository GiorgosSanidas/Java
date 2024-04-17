package interfaces.multiinheritance2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multinher {
	final static int size = 2;

	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Horse Ranch[] = new Horse[size];
	    iBird Aviary[] = new iBird[size];
    	int choice, i;
    	
    	for (i=0; i<size; i++) {
    		System.out.print("\n1: Horse \t2: Pegasus: ");
    	    choice=Integer.parseInt(br.readLine());
        	if (choice==1) 
        		Ranch[i]= new Horse();
        	else 
        		Ranch[i]= new Pegasus();
     	}	
		
    	for (i=0; i<size; i++) {
    		System.out.print("\n1: Bird \t2: Pegasus: ");
			choice=Integer.parseInt(br.readLine());
        	if (choice==1) 
        		Aviary[i]= new Bird();
        	else 
        		Aviary[i]= new Pegasus();
		}
    	
		for (i=0; i<size; i++) {
			System.out.print("\nRanch[" + i + "]: ");
        	Ranch[i].whinny();
		}
    		
		for (i=0; i<size; i++) {
			System.out.print("\nAviary[" + i + "]: ");
			Aviary[i].chirp();
		}	
    }
}
