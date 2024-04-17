package erg1_ask1_2023;
import java.util.Scanner;
public class Ask1 {
	public static void main(String[] args) {
	    double kostos = 0;
	    double xiliometra;
	    double sinolika_xiliometra=0;
	    double sinolika_katanalosh=0;
	    double megaliteri_apostash=0;
	
		do {
		
            Scanner in = new Scanner(System.in); 
            System.out.print("ΔΩΣΕ ΧΙΛΙΟΜΕΤΡΙΚΗ ΑΠΟΣΤΑΣΗ Η 0 ΓΙΑ ΝΑ ΤΕΡΜΑΤΙΣΕΙ Η ΔΙΑΔΙΚΑΣΙΑ: ");
            xiliometra = in.nextDouble();
            	    
            if (xiliometra<0) {} //Αγνόηση αρνητικών αριθμών
            if (xiliometra>-1&&xiliometra!=0)	{
                
    		    double katanalosh = (xiliometra/100)*6.3; 
    		    kostos = katanalosh*1.873; // υπολογισμος κοστους
    		    sinolika_xiliometra = sinolika_xiliometra+xiliometra;
    		    sinolika_katanalosh = sinolika_katanalosh+katanalosh;
    		    
    		    
    		    if (megaliteri_apostash<xiliometra) {
    		    	megaliteri_apostash=xiliometra;
    		    }
            	
            }
           
	}while (xiliometra!=0);
    System.out.println("Διανύθηκαν συνολικά : "+sinolika_xiliometra+" χιλιόμετρα");
    System.out.println("Η συνολικά κατανάλοση είναι : "+sinolika_katanalosh+" λίτρα");
    System.out.println("Η μεγαλύτερη απόσταση που διανύθηκε είναι : "+megaliteri_apostash+ " χιλιόμετρα");

}}
