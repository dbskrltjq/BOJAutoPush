import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		
		for(int i = 0; i < 5; i++) {
			result += scan.nextInt();
		}
		System.out.println(result);
	}
}
