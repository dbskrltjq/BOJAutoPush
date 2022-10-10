import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(bf.readLine());
		String numbers = bf.readLine();
		
		int total = 0;
		for(int i = 0; i < count; i++) {
			total += (int)numbers.charAt(i) - 48;			// 아스키코드 빼주기(0의 아스키코드는 48)
		}
		System.out.println(total);
    }
}
