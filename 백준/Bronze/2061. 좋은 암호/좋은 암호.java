import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger K = new BigInteger(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int bad = 0;
		for(int i = 2; i < L; i++) {
			if(K.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) {		// BigInteger.valueOf(i)는 int -> BigInteger로 변환
				bad = i;																	// BigInteger -> int는 BigInteger형 변수.intValue() 
				break;
			}
		}
		// 만약 인수분해값들이 모두 L보다 크면 변수 bad에는 위에서 초기화한 값인 0이 담겨있다.
		String result = (bad > 0) ? "BAD " + bad : "GOOD";
		
		System.out.println(result);
    }
	
}
