import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		long[] locations = new long[4];
		for(int i = 0; i < 4; i++) {
			locations[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(bf.readLine(), " ");
		long x = Long.parseLong(st.nextToken());
		//long y = Long.parseLong(st.nextToken());
		//long r = Long.parseLong(st.nextToken());
		
		int index = 0;
		for(long location : locations) {
			index++;
			if(location == x) {
				// 충돌한 사람의 번호를 찾으면 출력하고 메소드 종료.
				System.out.println(index); 
				return;
			}
		}
		// 사과와 충돌하는 사람이 없는 경우
		System.out.println(0);
    }
}
