import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] count = new int[26];
		String inputData = bf.readLine();
		
		for(int i = 0; i < inputData.length(); i++) {
			char alphabet = inputData.charAt(i);
			int index = (int)alphabet - 97;				// 소문자 a의 아스키코드는 97
			count[index]++;
		}
		for(int i = 0; i < count.length; i++) {
			sb.append(count[i] + " ");
		}
		
		System.out.println(sb);
    }
}
