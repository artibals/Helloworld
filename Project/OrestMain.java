
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class OrestMain {

	public static void main(String[] args) {

		List<Fruit> listOfFruits = new LinkedList<Fruit>();
		listOfFruits.add(new Fruit());
		listOfFruits.add(new Citrus());
		listOfFruits.add(new Citrus());
		listOfFruits.add(new Fruit());
		listOfFruits.add(new Fruit());
		for (Fruit fruit : listOfFruits) {
			try {
				fruit.input();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println("List of your fruits");
		for (Fruit fruit : listOfFruits) {
			fruit.output();
		}
		System.out.println();

		listOfFruits.sort(new CompareFruitName());
		System.out.println("Sorted by name");
		for (Fruit fruit : listOfFruits) {
			System.out.println(fruit);
		}
		System.out.println();
		for (Fruit yellowfruit : listOfFruits) {
			if (yellowfruit.getFruitColor().equalsIgnoreCase("yellow")) {
				System.out.println("Fruit: " + yellowfruit.getFruitName() + " is yellow.");
			}
		}
	}
}
