import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int date = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(date == Integer.parseInt(st.nextToken())) {
				count++;
			}
		}
		
		System.out.println(count);
    }
}
