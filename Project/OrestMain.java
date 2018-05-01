import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class OrestMain {

	public static void main(String[] args) {
				
		List <Fruit> listOfFruits = new LinkedList<Fruit>();
		try {
			Fruit.input(listOfFruits);
		} catch (IOException e) {
						e.printStackTrace();
		}
		Fruit.output(listOfFruits);
		
	}

}
