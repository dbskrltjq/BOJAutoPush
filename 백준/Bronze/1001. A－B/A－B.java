import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");   // br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눠준 뒤 String 배열에 각각 저장
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		System.out.println(A - B);
	
		
		// 다른 방법
		/* 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		System.out.println(A-B);
 
		in.close();
		*/
	}
}
