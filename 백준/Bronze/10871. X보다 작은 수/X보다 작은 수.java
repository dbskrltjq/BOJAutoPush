import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());		// 주어진 정수의 개수
		int X = Integer.parseInt(st.nextToken());		// 비교 기준 정수
		st = new StringTokenizer(br.readLine());		// 정수 N개가 있는 수열 A
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(a < X) {
				sb.append(a + " ");
			}
		}
		System.out.println(sb);
	}
}
