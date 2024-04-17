package interfaces.multiinheritance1;

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    
	public void swim() {
         System.out.println("Hero.swim()");
    }
    
	public void fly() {
		System.out.println("Hero.fly()");
	}

}
