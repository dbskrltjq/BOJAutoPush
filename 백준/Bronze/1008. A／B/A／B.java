import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 굳이 String 변수를 생성하지 않고 입력과 동시에 구분자로 분리해줘도 된다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		
		System.out.println(A/B);
		
		/* 다른 풀이 
		 Scanner scan = new Scanner(System.in);
		 
		 double A = scan.nextDouble(); 
		 double B = scan.nextDouble();
		 
		 scan.close(); 
		 System.out.print(A/B);
		 */
	
	}
}