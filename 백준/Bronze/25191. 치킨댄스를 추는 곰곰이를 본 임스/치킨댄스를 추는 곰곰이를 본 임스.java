import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());			// 치킨집에 있는 치킨의 총 개수
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());			// 집에 있는 콜라 개수
		int b = Integer.parseInt(st.nextToken());			// 집에 있는 맥주 개수
		
		int cnt = a/2 + b;		// 먹을 수 있는 치킨의 총 개수
		
		if(n >= cnt) {
			// 치킨집에 있는 치킨의 개수가 먹을 수 있는 치킨 개수보다 많을 경우
			System.out.println(cnt);
		} else {
			// 치킨집에 있는 치킨의 개수가 먹을 수 있는 치킨 개수보다 적을 경우
			System.out.println(n);
		}
    }
}
