import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());			// 테스트 케이스의 개수
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #" + i + ": " + (a + b) + "\n");
		}
		System.out.println(sb);
	}
}
