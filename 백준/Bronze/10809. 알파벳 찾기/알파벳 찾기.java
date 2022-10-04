import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();		// 입력받은 단어
		
		int[] arr = new int[26];		// 알파벳에 해당하는 배열 생성
		for(int i = 0; i < 26 ; i++) {
			arr[i] = -1;				// 배열을 -1로 초기화
		}
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(arr[ch - 'a'] == -1) {	// 단어의 문자값에 해당하는 인코딩값을 -97 또는 -'a' 하여 알파벳 소문자 a가 0, z 가 25로 인덱스를 맞춰준다.
				arr[ch - 'a'] = i;
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}