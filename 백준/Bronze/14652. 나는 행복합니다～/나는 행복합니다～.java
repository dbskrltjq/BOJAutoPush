import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputData = br.readLine().split(" ");
		
		int m = Integer.parseInt(inputData[1]);			// 열의 개수
		int k = Integer.parseInt(inputData[2]);			// 자리 번호
		
		System.out.println((k/m) + " " + k%m);
	}
}
