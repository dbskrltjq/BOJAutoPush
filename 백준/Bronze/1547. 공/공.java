import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(bf.readLine());
		String num = "1"; 		// 최초의 공의 위치
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			String X = st.nextToken();
			String Y = st.nextToken();
			
			if(num.equals(X)) {
				num = Y;
			} else if(num.equals(Y)) {
				num = X;
			}
		}
		System.out.println(num);
    }
}
