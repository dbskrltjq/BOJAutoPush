import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 굳이 String 변수를 생성하지 않고 입력과 동시에 구분자로 분리해줘도 된다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger totalMoney = new BigInteger(st.nextToken());
		BigInteger numberOfLife = new BigInteger(st.nextToken());
		
		System.out.println(totalMoney.divide(numberOfLife));
		System.out.println(totalMoney.remainder(numberOfLife));
		
		/* 다른 풀이 
		 Scanner scan = new Scanner(System.in);
		
		BigInteger totalMoney = scan.nextBigInteger();		// Scanner는 nextBigInteger를 지원한다.
		BigInteger numberOfLife = scan.nextBigInteger();
		
		scan.close();
		
		System.out.println(totalMoney.divide(numberOfLife));
		System.out.println(totalMoney.remainder(numberOfLife));
		 */
	
	}
}
