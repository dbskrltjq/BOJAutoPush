import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = 1;
		while(count < 4) {
			int N = Integer.parseInt(bf.readLine());
			BigInteger sum = new BigInteger("0");
			
			for(int i = 0; i < N; i++) {
				BigInteger num = new BigInteger(bf.readLine());
				sum = sum.add(num);
			}
			
			if(sum.compareTo(BigInteger.ZERO) == 1) {		// 비교: 왼쪽이 크면 1, 같으면 0, 오른쪽이 크면 -1
				sb.append("+" + "\n");
			} else if(sum.compareTo(BigInteger.ZERO) == -1) {
				sb.append("-" + "\n");
			} else {
				sb.append("0" + "\n");
			}
			count++;
		}
		System.out.println(sb);
    }
}
