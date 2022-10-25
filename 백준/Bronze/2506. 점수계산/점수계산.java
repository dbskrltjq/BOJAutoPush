import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// 문제의 개수
		int total = 0;		// 총 점수
		int addPoint = 0;	// 가산점
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int result = Integer.parseInt(st.nextToken());
			
			if(result == 0) {
				addPoint = 0;
			}
			if(result == 1) {
				addPoint += 1;
				total += addPoint;
			}
		}
		System.out.println(total);
		
    }
}
