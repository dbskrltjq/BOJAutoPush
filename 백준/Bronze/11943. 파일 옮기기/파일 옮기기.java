import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int A, B, C, D;
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine(), " ");
		C = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		
		System.out.println(Math.min(A + D, B + C));
		
    }
}
