import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(st.nextToken());
		int space = Integer.parseInt(st.nextToken());
		
		int totalNumber = cnt*space;
		
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i < 5; i++) {
			int gap = Integer.parseInt(st.nextToken()) - totalNumber;
			sb.append(gap + " ");
		}
		System.out.println(sb);
    }
}
