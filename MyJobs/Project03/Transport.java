package erg3;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.Map;
import java.util.TreeMap;
//import erg3.*;

public class Transport {
public static void main(String[] args) {
		
		// Store vehicles in hash map
		HashMap<String,Vehicle> vehicles = new HashMap<String,Vehicle>();

		// System.out.println(vehicles);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Do you want to insert a new vehicle?");
		String input = scanner.nextLine();
		System.out.println(input);

		while (input.equals("yes") || input.equals("y")) {
				System.out.print("Dwse Onoma Idioktiti: ");
				String idioktitis = scanner.nextLine();
				// ... make user enter all data: arKykloforias, etosKat, kyvismos, ippodynami
				System.out.print("Dwse Arithmo Kykloforias: ");	
				String input2 = scanner.nextLine();
				final String arKykloforias=input2;
				
				System.out.print("Dwse Arithmo Etos Kykloforias: ");	
			    int etosKat = scanner.nextInt();
				
				System.out.print("Dwse Kyvismo: ");	
			    int kyvismos = scanner.nextInt();								

				System.out.print("Dwse Ippodynami: ");	
			    int ippodynami = scanner.nextInt();
				
				// create all objects for Vehicle:
				Mihani eng = new Mihani(kyvismos, ippodynami);
				SystimaDieythynsis sysdief = new SystimaDieythynsis();
				Vehicle v = new Vehicle(idioktitis, arKykloforias, etosKat, sysdief, eng);
				
				// add new vehicle to hashmap:
				vehicles.put(v.getArKykloforias(), v);

				// Clear input stream
				scanner.nextLine();
				System.out.print("Do you want to insert a new vehicle? ");
				input = scanner.nextLine();
		}


		// Carry on with the rest of what is asked 
	    int sel=5;

		while (sel !=0) {
		switch (sel) {
           case 1:
        	   System.out.print("Dwse Arithmo Kykloforias: ");	
        	   String input7 = scanner.nextLine();
        	   final String arKykloforias=input7;
			   // vehicles.get(arKykloforias) returns the Vehicle object
        	   System.out.println("O Kyvismos Einai :"+vehicles.get(arKykloforias).getEng().getKyvismos());
        	   sel=5;
        	   
       	   break ;
        
   	       case 2:
   	    	System.out.print("Dwse Etos Kykloforias: ");
			int etosKat = scanner.nextInt();

			// Kratise tin ippodynami kai to plithos autokinhtwn
			HashMap<Integer, Integer> ippodMap = new HashMap<Integer, Integer>();

			for (var e : vehicles.entrySet()) {
				Vehicle v = e.getValue();

				if (etosKat == v.getEtosKat()) {
					int key = v.getEng().getIppodynami();
					// System.out.println(key);

					if (ippodMap.containsKey(key)) {
						ippodMap.put(key, ippodMap.get(key) + 1);
					} else {
						ippodMap.put(key, 1);
					}

					// System.out.println("Ippodynami: " + v.getEng().getIppodynami());
					// System.out.println(ippodMap);
				}
			}
			// Gia taxinomisi
			TreeMap<Integer, Integer> sortedIppod = new TreeMap<>();
			sortedIppod.putAll(ippodMap);

			// Display
			for (var e : sortedIppod.entrySet()) {
				System.out.println("Ippodynami: " + e.getKey() + " - Plithos Autokinhtwn: " + e.getValue());
			}
			sel=5;
			break;

			    
			    

     	   
           case 3:
        	   System.out.print("Dwse Arithmo Kykloforias: ");	
        	   String arKykloforias2 = scanner.nextLine();
        	   System.out.println("Idioktitis Einai O :"+vehicles.get(arKykloforias2).getIdioktitis());
        	   System.out.println("To etos Kataskevis Einai  :"+vehicles.get(arKykloforias2).getEtosKat());
        	   
        	   sel=5;
        	  
           break;
        
           case 4:
				printMethods();
				int method = scanner.nextInt();
				scanner.nextLine();

				switch (method) {
					case 1:
						for (var e : vehicles.entrySet()) {
							Vehicle v = e.getValue();
							System.out.println("Ektelesi gia autokinhto: " + v.getArKykloforias());
							v.getEng().leitourgia();
						}
						break;
					case 2:
						for (var e : vehicles.entrySet()) {
							Vehicle v = e.getValue();
							System.out.println("Ektelesi gia autokinhto: " + v.getArKykloforias());
							v.getEng().kinisi();
						}
						break;
					case 3:
						for (var e : vehicles.entrySet()) {
							Vehicle v = e.getValue();
							System.out.println("Ektelesi gia autokinhto: " + v.getArKykloforias());
							v.getEng().svisimo();
						}
						break;
					case 4:
						for (var e : vehicles.entrySet()) {
							Vehicle v = e.getValue();
							System.out.println("Ektelesi gia autokinhto: " + v.getArKykloforias());
							v.getSysdief().vazeiEmpros();
						}
						break;

					case 5:
						for (var e : vehicles.entrySet()) {
							Vehicle v = e.getValue();
							System.out.println("Ektelesi gia autokinhto: " + v.getArKykloforias());
							v.getSysdief().svinei();
						}
						break;

					case 6:
						for (var e : vehicles.entrySet()) {
							Vehicle v = e.getValue();
							System.out.println("Ektelesi gia autokinhto: " + v.getArKykloforias());
							v.getSysdief().striveiAristera();
						}
						break;

					case 7:
						for (var e : vehicles.entrySet()) {
							Vehicle v = e.getValue();
							System.out.println("Ektelesi gia autokinhto: " + v.getArKykloforias());
							v.getSysdief().striveiDexia();
						}
						break;
					default:
						System.out.println("Not valid input!");
						break;
				}
				sel=5;
				break;
				
       //    case 5:       	   
       		//	System.out.print("Dwse Enan Arithmo Apo To 0 Eos To 4: ");	
       		//	sel = scanner.nextInt();
       		//	scanner.nextLine();
    	//   break;

			default: sel=5;
			//	System.out.println("Wrong Input!");
				break;
		}
		printMenu();
		sel = scanner.nextInt();
		scanner.nextLine();
	}
	System.out.print("The program has been terminated !");
	scanner.close();
}

public static void printMenu() {
	System.out.println("***************************************************************");
	System.out.println("0: Exodos apo to programma");
	System.out.println("1: Vres Kyvismo Autokinhtou");
	System.out.println("2: Vres Ippodynami Autokinhtwn");
	System.out.println("3: Vres Idioktiti kai Etos kataskeuis autokinhtou");
	System.out.println("4: Ektelesi energeias");
	System.out.print("Dwse Enan Arithmo Apo To 0 ews To 4: ");

}

public static void printMethods() {
	System.out.println("------------------------------------------------------------------");
	System.out.println("Energeies: ");
	System.out.println("\t1. Minahi - leitourgia");
	System.out.println("\t2. Minahi - kinisi");
	System.out.println("\t3. Minahi - svisimo");
	System.out.println("\t4. SystimaDieythynsis - vazeiEmpros");
	System.out.println("\t5. SystimaDieythynsis - svinei");
	System.out.println("\t6. SystimaDieythynsis - striveiAristera");
	System.out.println("\t7. SystimaDieythynsis - striveiDexia");
	System.out.print("Dwse mia energeia (1-8): ");
}
}
