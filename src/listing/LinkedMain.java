package listing;

import java.util.LinkedList;

public class LinkedMain {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.addFirst("wolxvagen");
		System.out.println(cars);
		}

}
