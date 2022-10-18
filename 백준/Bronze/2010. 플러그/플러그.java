import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());		// 멀티탭의 개수
		int sum = 1;									// 플래그를 꽂을 자리 수의 총 합.
		
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(br.readLine());
			sum -= 1;					
		}
		System.out.println(sum);
    }
	
}
