import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int[] levels = new int[4];
		for(int i = 0; i < 4; i++) {
			levels[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(levels);		// 오름차순 정렬
		
		int gap = (levels[0] + levels[3]) - (levels[1] + levels[2]);
		System.out.println(Math.abs(gap) );
    }
}
