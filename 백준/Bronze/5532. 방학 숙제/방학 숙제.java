import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(bf.readLine());				// 방학일 수
		double A = Integer.parseInt(bf.readLine());				// 풀어야하는 국어 페이지
		double B = Integer.parseInt(bf.readLine());				// 수학 페이지
		double C = Integer.parseInt(bf.readLine());				// 하루에 풀 수 있는 국어 페이지
		double D = Integer.parseInt(bf.readLine());				// 하루에 풀 수 있는 수학 페이지
		
		double a = A/C;
		double b = B/D;
		
		int homeworkDays = (int)Math.ceil(bigger(a, b));
		
		System.out.println(L - homeworkDays);
		
    }
	
	public static double bigger(double a, double b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
}
