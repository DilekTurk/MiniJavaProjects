import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Physics grade: ");
		int physics = scanner.nextInt();
		System.out.print("Math grade: ");
		int math = scanner.nextInt();
		System.out.print("Turkish grade: ");
		int Turkish = scanner.nextInt();
		System.out.print("Chemistry grade: ");
		int chemistry = scanner.nextInt();
		System.out.print("Music grade: ");
		int music = scanner.nextInt();
		System.out.print("History grade: ");
		int history = scanner.nextInt();
		scanner.close();
		
		double Average = (double)(physics + math + Turkish + 
			           	  chemistry + music + history)/6;
		
		System.out.println("Your average: "+Average);
		
		String Message = (Average>=60) ? "You pass!!!":"You failed.";
		
		System.out.println(Message);
	}

}
