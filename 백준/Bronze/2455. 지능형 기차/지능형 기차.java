import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;				// 사람이 가장 많을 때의 수를 저장할 변수
		int current = 0;			// 각 정착역에서 사람이 내리거나 탔을 때 수
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int out = Integer.parseInt(st.nextToken());			// 내린 사람의 수
			int in = Integer.parseInt(st.nextToken());			// 탄 사람의 수
			
			current -= out;
			current += in;
			max = Math.max(max, current);
		}
		
		System.out.println(max);
		
    }
}
