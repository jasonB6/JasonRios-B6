package broken.abstraction1;

public class RestaurantDemo {

	public static void main(String[] args) {// lowercase s to Uppercase S,remove semicolon

		Restaurant obj1 = new FastFood("Bob", 2, 99);// correct spelling in className, cannot create object of ABSTRACT
														// Restaurant class, but we can upcast here to call location()
		obj1.location();
		System.out.println(obj1.DISCOUNT);

		FastFood obj2 = new FastFood("Joe", 1, 15); // these methods only found in FastFood(), changed reference class
													// to FastFood
		obj2.getInfo();
		obj2.setInfo();

		FastFood obj3 = new FastFood("John Cena", 12, 0);

		obj3.DISCOUNT = 44.44;

		obj3.dinnerMenu();// removed redundant print statment; called method already has print statement
							// in body
		obj3.lunchMenu();// removed redundant print statment; called method already has print statement
							// in body

	}

}