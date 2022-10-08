import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(bf.readLine());				// 방학일 수
		int A = Integer.parseInt(bf.readLine());				// 풀어야하는 국어 페이지
		int B = Integer.parseInt(bf.readLine());				// 수학 페이지
		int C = Integer.parseInt(bf.readLine());				// 하루에 풀 수 있는 국어 페이지
		int D = Integer.parseInt(bf.readLine());				// 하루에 풀 수 있는 수학 페이지
		
		int a = A/C;
		int b = B/D;
		
		if(a >= b) {
			System.out.println(A%C == 0 ? L - a : L - a - 1);
		} else {
			System.out.println(B%D == 0 ? L - b : L - b - 1);
		}
    }
}
