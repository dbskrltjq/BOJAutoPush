import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextInt();
		long m = scan.nextInt();
	
		scan.close();
		
		System.out.println(Math.abs(n - m));
		
		/*
		 * Math.abs() : 절댓값 구하는 함수
		 * 4가지의 숫자 타입(int, long, float, double)을 모두 사용할 수 있다
		 */
	}
}

