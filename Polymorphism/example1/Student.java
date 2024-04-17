package polymorphism.example1;

public class Student extends Person {

	private int aem;

	// O default δομητής της Student καλεί πάντα το default
	// της υπαρκλάσης ασχέτως αν δε γράψουμε super()
	public Student() { aem=19; }

	public Student(int aem) {
		// Καλείται όπως και να έχει ο default δομητής
		// super("Nick");    
		this.aem = aem;
	}

	public Student(int aem, String name) {
		// Ο default δομητής καλείται εάν 
		// παραλείψουμε τη παρακάτω γραμμή
		super(name);  
		this.aem = aem;
	}

	public int getAem() {
		return aem;
	}

	public void setAem(int aem) {
		this.aem = aem;
	}
	// @Override - Δεν είναι απαραίτητο να βάλουμε το annotation
	
/*
 *  // Error. Όταν έχουμε override μίας μεθόδου πρέπει ο τύπος επιστροφής να είναι ο ίδιος
	public int print() {
		System.out.println("Aem="+aem);
		return 1;
	}
*/	
	// Περίπτωση override (υπερκάλυψη)
	public void print() {
		// Εάν θέλουμε να καλέσουμε και την print της πατρικής κλάσης
		super.print(); 
		System.out.println("Aem="+aem+"\n");
	}
	
	// Περίπτωση overloading (υπερφόρτωση)
	public void print(int a) {
		System.out.println("Aem="+aem+"\n");
	}

}
