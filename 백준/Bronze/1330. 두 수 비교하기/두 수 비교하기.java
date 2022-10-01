import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] st = br.readLine().split(" ");
		
		int A = Integer.parseInt(st[0]);
		int B = Integer.parseInt(st[1]);
		
	/* if문 사용
	 
		if(A > B) {
			System.out.println(">");
		} else if(A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	*/
	
		String result = (A > B) ? ">" : ((A < B) ? "<" : "==") ;
		
		System.out.println(result);
		
	}
}