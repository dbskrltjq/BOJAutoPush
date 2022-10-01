import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 입력 조건: 10진수로, 1000자리를 넘지 않는 수
		// int 타입으로는 부족하므로 문자열 타입이며 숫자의 범위가 무한인 BigInteger 사용
		BigInteger A = scan.nextBigInteger();
		BigInteger B = scan.nextBigInteger();
		
		scan.close();
		
		// BigInteger은 문자열 형태로 이뤄져 있어, 사칙연산이 불가능하다. 따라서 클래스 내부의 함수를 사용한다.
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
		
	}
}
