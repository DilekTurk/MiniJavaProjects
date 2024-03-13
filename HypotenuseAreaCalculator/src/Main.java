import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the perpendicular side lengths (cm) of the triangle: ");
		System.out.print("Side 1: ");
		double side1 = scanner.nextDouble();
		System.out.print("Side 2: ");
		double side2 = scanner.nextDouble();
		scanner.close();
		
		double hypotenuse = Math.sqrt((side1*side1)+(side2*side2));
		double area = (side1*side2)/2;
		
		System.out.printf("The length of the hypotenuse: %f cms.\n",hypotenuse);
		System.out.printf("The area of the triangle: %f cm^2.",area);

	}

}
