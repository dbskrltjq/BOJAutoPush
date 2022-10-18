import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int branch = 1;		// 가짓수. 가지는 처음에 1개로  시작.
			
			// 0이 입력되면 반복문 종료
			if(a == 0) {
				break;
			} 
			
			for(int i = 0 ; i < 2*a ; i++) {
				int m = Integer.parseInt(st.nextToken());
				
				if(i%2 == 0) {
					branch *= m;
				} else {
					branch -= m;
				}
			}
			sb.append(branch + "\n");
		}
		System.out.println(sb);
    }
	
}
