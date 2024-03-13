import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle:");
		double radius = scanner.nextDouble();
		System.out.println("Please enter the central angle of the circle sector in degrees:");
		double Angle = scanner.nextDouble();
		scanner.close();
		
		double circumference = 2*Math.PI*radius;
		double area = Math.PI*radius*radius;
		double AreaOfSector = (Math.PI*radius*radius*Angle)/360;
		
		System.out.printf("The circumference of the circle is %f.\n",circumference);
		System.out.printf("The area of the circle is %f.%n",area);
		System.out.printf("The area of the circle sector is %f.",AreaOfSector);

	}

}
