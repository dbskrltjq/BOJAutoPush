import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] firstMatrix = new int[n][m];
		int[][] secondMatrix = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < m; j++) {
				firstMatrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < m; j++) {
				secondMatrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 행렬 firstMatrix와 secondMatrix 더하기
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++ ) {
				sb.append(firstMatrix[i][j] + secondMatrix[i][j] + " ");
			}
			sb.append("\n");
		}
		
		String result = new String(sb);
		System.out.println(result);
	}
}
