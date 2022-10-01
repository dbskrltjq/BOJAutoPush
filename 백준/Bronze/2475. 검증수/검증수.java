import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int total = 0;
		for(int i = 0; i < 5 ; i++) {
			int n = Integer.parseInt(str[i]);
			total += Math.pow(n, 2);
		}
		System.out.println(total%10);
	}
	
	// 다른 방법
	/*
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			int a = scan.nextInt();
			sum += a*a;
		}
		scan.close();
		System.out.println(sum%10);
	}	
	*/
}
