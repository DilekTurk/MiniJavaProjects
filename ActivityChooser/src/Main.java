import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String key;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Please enter the temperature: ");
			double temperature = scanner.nextDouble();
			scanner.nextLine();
			Random random = new Random();
			if(temperature<5) {
				int number = random.nextInt(2);
				switch(number) {
				case 0: System.out.println("Skiing");
				break;
				case 1: System.out.println("Ice skating");
				break;
				}
			}
			else if(temperature>=5 && temperature<15) {
				int number = random.nextInt(2);
				switch(number) {
				case 0: System.out.println("Cinema");
				break;
				case 1: System.out.println("Theater");
				break;
				}
			}
			else if(temperature>=15 && temperature<25) {
				int number = random.nextInt(2);
				switch(number) {
				case 0: System.out.println("Barbecue");
				break;
				case 1: System.out.println("Shopping");
				break;
				}
			}
			else {
				int number = random.nextInt(2);
				switch(number) {
				case 0: System.out.println("Swimming");
				break;
				case 1: System.out.println("Surfing");
				break;
				}
			}
			System.out.println("Do you want to quit? Press Q. If you do not, press another key: ");
			key = scanner.nextLine();
			
		}while(!key.equalsIgnoreCase("Q"));
		System.out.println("Thanks for visiting!!!");
		scanner.close();
	}

}


