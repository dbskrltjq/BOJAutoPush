import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int width = Math.abs(findX(n) - findX(m));			// 동서방향거리 
		int height = Math.abs(findY(n) - findY(m));			// 남북방향거리
		
		System.out.println(width + height);
    }
	
	public static int findX(int num) {
		int x = 0;
		if(num%4 == 0) {
			x = num/4;
		} else {
			x = num/4 + 1;
		}
		return x;
	}
	public static int findY(int num) {
		if(num%4 == 0) {
			return 4;			// 4의 배수인 경우 4번째 열에 위치
		} else {
			return num%4;
		}
	}
}
