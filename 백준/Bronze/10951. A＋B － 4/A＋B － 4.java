import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			try {													// while문을 나가는 조건을 Exception이 발생했을 경우로 지정
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				sb.append((a + b) + "\n");
			} catch (Exception e) {
				break;
			}
		}
		System.out.println(sb);
	}
}

// 다른 풀이
/*
    Scanner sc = new Scanner(System.in);
   
	while (sc.hasNext()) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		
	}
 */
