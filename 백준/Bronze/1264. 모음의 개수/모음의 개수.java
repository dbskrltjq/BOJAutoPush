import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String inputData = bf.readLine();
			
			if("#".equals(inputData)) {
				break;
			}
			
			int vowelsCount = 0;
			for(int i = 0 ; i < inputData.length(); i++) {
				if(isVowels(inputData.charAt(i))) {
					vowelsCount++;
				}
			}
			sb.append(vowelsCount + "\n");
		}
		
		System.out.println(sb);
	}
	
	public static boolean isVowels(char oneData) {
		
		char alphabet = Character.toLowerCase(oneData);
		boolean result = false;
		
		switch (alphabet) {
			case 97: {
				result = true;
				break;
			}
			case 101: {
				result = true;
				break;
			}
			case 105: {
				result = true;
				break;
			}
			case 111: {
				result = true;
				break;
			}
			case 117: {
				result = true;
				break;
			}
		}
			return result;
		
	}
}
