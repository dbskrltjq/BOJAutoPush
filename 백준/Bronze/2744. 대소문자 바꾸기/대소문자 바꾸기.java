import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputData = br.readLine();
		
		for(int i = 0; i < inputData.length(); i++) {
			char c = inputData.charAt(i);	// charAt() : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해준다.
			
			if(Character.isUpperCase(c)) {  // 인자가 대문자인 경우 true, 소문자면 false 값 리턴
				System.out.print(String.valueOf(c).toLowerCase());
			} else {
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}
	}
	
	// isUpperCase() 함수는 입력받은 인자가 영문 대문자인지 여부를 판단하여 true 또는 false 값을 리턴한다.
	
	/* 문자열 형 변환 메서드인 String.valueOf()와 Object.toString()의 차이는?
	 * 
	 * toString() : null 값을 형 변환 시 NullPointerException(NPE)이 발생한다. Object의 값이 String이 아니여도 출력
	 * String.valueOf() : 파라미터로 null이 오면 "null"이라는 문자열을 출력한다.
	 * -- toString()은 null값을 형변환하면 NPE가 발생하므로, 이를 방지할 수 있는 String.valueOf()를 사용하는 것이 좋다
	*/	
}
