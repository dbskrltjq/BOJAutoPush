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
}
