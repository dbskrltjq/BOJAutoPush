import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a == b && b == c) {
			// 3개 모두 같은 수의 경우
			System.out.println(10000+a*1000);
		} else if(a == b || a == c) {
			// 2개의 수가 같은 경우
			System.out.println(1000+a*100);
		} else if(b == c) {
			// 2개의 수가 같은 경우
			System.out.println(1000+b*100);
		}  else {
			// 3개 모두 다른 수인 경우
			System.out.println(Math.max(Math.max(a, b), c)*100);
		}
		scan.close();
		/*
		 *  Math.max(파라미터 1, 파라미터 2) : 인자1과 인자2 중 큰 값을 리턴 
		 *  Math.min(파라미터 1,파라미터 2) : 인자1과 인자2 중 작은 값을  리턴 
		 */
    }
}
