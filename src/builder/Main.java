package builder;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		director director = new director();
		HouseBuilder builder = new HouseBuilder();
		House house = builder.getResult();
		HouseManualBuider manualBuider = new HouseManualBuider();
		Scanner in = new Scanner(System.in);
		String choose = in.next();
		System.out.println("Choose the type of house WithPool, WithGarden or WithGarage?");
		if(choose.equals("WithPool")) {
			director.constructPool(builder);
		}
		if(choose.equals("WithGarage")) {
			director.constructGarage(builder);
		}
		if(choose.equals("WithGarden")) {
			director.constructGarden(builder);
		}
		else{
			System.out.println("Sorry, there is no matches found :(");
		}

		System.out.println("House builded!");
		System.out.println("House manual: \n"+ manualBuider.getResult());

	}
}
