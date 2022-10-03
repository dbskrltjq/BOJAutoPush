import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();		// 정수의 개수
		int[] arr = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = scan.nextInt();
		}
		
		int v = scan.nextInt();			// 찾으려는 정수
		int result = 0;
		for(int data : arr) {
			if(data == v) {
				result++;
			}
		}
		scan.close();
		System.out.println(result);
	}
}
