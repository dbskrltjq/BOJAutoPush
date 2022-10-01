import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		// 문자열 분리 방법 두 가지
		// 1. StringTokenizer 클래스를 이용하여 분리해주는 방법
		// 2. split() 을 이용하는 방법
		StringTokenizer st = new StringTokenizer(str, " ");	
		
		int A = Integer.parseInt(st.nextToken());	// st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A + B);
	
	}
}
