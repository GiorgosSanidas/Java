package interfaces.multiinheritance1;

public class Adventure {
	static void s(Hero x) { 
		x.fight(); 
	}
	
	static void t(CanFight x) { 
		x.fight(); 
	}

	static void u(CanSwim x) { 
		x.swim(); 
	}

	static void v(CanFly x) { 
		x.fly(); 
	}

	static void w(ActionCharacter x) { 
		x.fight(); 
	}
	   
	public static void main(String[] args) {
		Hero h = new Hero(); 
		s(h);
		t(h); // Treat it as a CanFight
		u(h); // Treat it as a CanSwim
		v(h); // Treat it as a CanFly
		w(h); // Treat it as an ActionCharacter
	}
}
