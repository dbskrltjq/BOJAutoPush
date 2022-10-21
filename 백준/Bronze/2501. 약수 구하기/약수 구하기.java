import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int result = 0;
		int num = 0;			// 약수들 중 몇번째로 작은 수인지
		for(int i = 1; i <= N; i++) {
			
			if(N%i == 0) {
				num++;
				if(num == K) {
					result = i;
				}
			} 
		}
		if(num < K) {
			result = 0;
		}
		
		System.out.println(result);
    }
}
