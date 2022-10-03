import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int c = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < c; i++) {
			String inputData = br.readLine();
			sb.append(inputData.charAt(0));
			sb.append(inputData.charAt(inputData.length() - 1));
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
