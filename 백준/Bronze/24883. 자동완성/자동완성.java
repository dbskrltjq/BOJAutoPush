import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String input = bf.readLine().toLowerCase();
		
		if("n".equals(input)) {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}
    }
}
