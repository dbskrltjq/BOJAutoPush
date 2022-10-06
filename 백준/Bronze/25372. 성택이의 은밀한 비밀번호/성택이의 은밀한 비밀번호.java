import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());				
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n ; i++) {
			
			String password = bf.readLine();
			if(password.length() >= 6 && password.length() <= 9) {
				sb.append("yes" + "\n");
			} else {
				sb.append("no" + "\n");
			}
		}
		
		System.out.println(sb);
	}
}
