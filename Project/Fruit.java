import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Fruit {

	protected static String fruitName;
	protected static String fruitColor;

	public Fruit(String fruitName, String fruitColor) {
		Fruit.fruitName = fruitName;
		Fruit.fruitColor = fruitColor;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		Fruit.fruitName = fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		Fruit.fruitColor = fruitColor;
	}

	public static void input(List <Fruit> listOfFruits) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i<5; i++) {
		System.out.println("Please enter your fruitname");
		fruitName = br.readLine();

		System.out.println("Please enter your fruitColor");
		fruitColor = br.readLine();
		
		listOfFruits.add(new Fruit(fruitName, fruitColor));
		
		}
		
	}

	public static void output(List <Fruit> listOfFruits) {
		for (Fruit list : listOfFruits) {
            System.out.println("NAME " + list.getFruitName() + ", PRICE " + list.getFruitColor());
        }
	}

}
