import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int month = Integer.parseInt(bf.readLine());
		int date = Integer.parseInt(bf.readLine());
		
		if(month > 2) {
			System.out.println("After");
		} else if(month == 2) {
			
			System.out.println(date == 18 ? "Special" : date > 18 ? "After" : "Before");
			
		} else {
			System.out.println("Before");
		}
    }
}
