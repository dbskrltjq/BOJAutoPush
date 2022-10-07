import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		
		
		for(int i = n; i != 0 ; i--) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb);
    }
}
