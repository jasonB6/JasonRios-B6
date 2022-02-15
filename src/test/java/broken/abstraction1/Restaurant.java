
package broken.abstraction1;

public abstract class Restaurant {
	public double DISCOUNT = 20.00;// based on how discount is used in the other classes, i dont think its meant to
									// be final, removed 'final' keyword
	public int luckyNumber = 12;
	public int waitTime = 20;
	public String name;

	public Restaurant(String name, int luckyNumber, int waitTime) {

		this.name = name; // initialized Restaurant constructor with class variable
		this.luckyNumber = luckyNumber; // initialized Restaurant constructor with class variable
		this.waitTime = waitTime; // initialized Restaurant constructor with class variable

		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}

	public abstract void location();

	public void setOperationTime() { // removed static keyword so setOperationTime() in child class can override
		System.out.println("Monday-Friday");
	}

	public final void specialMenu() {// replace semicolon with open/close curly brackets for method body

	}

	abstract void rating();

	public abstract void breakfastMenu();

	public abstract void lunchMenu();

	public abstract void dinnerMenu();
}