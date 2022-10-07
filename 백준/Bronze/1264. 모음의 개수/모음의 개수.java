import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String inputData = bf.readLine();
			
			if("#".equals(inputData)) {			// 사용자가 "#"를 입력하면 무한반복문을 빠져나온다.
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
	
	public static boolean isVowels(char oneData) {			// 소문자 모음에 해당하는 아스키코드와 일치하면 true, 아니면 false를 반환
		
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


// 다른 방법
// 정적 메소드를 따로 만들어서 사용해보고 싶어서 위에 처럼 코드를 작성했더니 뭔가 더 코드가 길어져서 그런가 복잡해보이는건..
/*
public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	
        while (true) {
           String inputData = bf.readLine();

            if (inputData.equals("#")) {
                break;
            }

            char[] index = {'A','E','I','O','U','a','e','i','o','u'};			// 모음 대소문자
            int vowelsCount = 0;

            for (int i = 0; i < inputData.length(); i++) {
                char c = inputData.charAt(i);
                for (int j = 0; j < index.length; j++) {
                    if(c == index[j]) {
                        vowelsCount++;
                    }
                }
		sb.append(vowelsCount + "\n");
            }

            System.out.println(sb);
        }
    }
*/




















