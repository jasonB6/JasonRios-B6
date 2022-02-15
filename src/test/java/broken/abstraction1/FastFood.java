package broken.abstraction1;

public class FastFood extends Restaurant { // must inherit using "extends" keyword AND

	public FastFood(String name, int luckyNumber, int waitTime) {// added matching Child class Constructor to resolve
		super(name, luckyNumber, waitTime); // 'implicit call to no argument Parent Constructor;

	}

	public void location() { // child class method CANNOT be more restrictive than the parent class
								// method:changed access to publci
		System.out.println("Reston VA");
	}

	@Override // correct spelling 'Override'
	public void setOperationTime() {
		System.out.println("24/7");
	}

	@Override
	public void lunchMenu() { // changed visiblity to same level as reference method, removed paramter to
								// match abstract method in parent class
		System.out.println("Time: " + waitTime); // i think here, the waitTime variable was trying to be accessed?
	}

	@Override
	public void breakfastMenu() { // child class method CANNOT be more restrictive than the parent class
									// method:changed access to 'public' corect spelling of method name
		System.out.println("Not serving...");
	}

	@Override
	public void dinnerMenu() { // add return type 'void' and correct spelling of method name
		System.out.println("7PM-10PM");
	}

	public void display() {
		DISCOUNT = 30.00;

		luckyNumber = 22; // value must match declared datatype, gave an equivalent 'int' value

		waitTime = 0; // value must match declared datatype, gave an equivalent 'int' value
	}

	@Override
	void rating() { //rewrote to allow for implementation of abstract rating()
		System.out.println();
	}

	public void getInfo() { // concrete class CANNOT have abstract class, removed abstract keyword
		System.out.println("This is info");
	}

	public void setInfo() { // concrete class CANNOT have abstract class, removed abstract keyword and
							// closed method body

	}
}
