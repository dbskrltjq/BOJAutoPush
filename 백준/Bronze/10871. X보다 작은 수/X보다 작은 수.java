import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();		// 주어진 정수의 개수
		int X = scan.nextInt();		// 비교 기준 정수
		
		for(int i = 0; i < N; i++) {
			int A = scan.nextInt();
			
			if(A < X) {
				System.out.print(A + " ");
			}
		}
	}
}
