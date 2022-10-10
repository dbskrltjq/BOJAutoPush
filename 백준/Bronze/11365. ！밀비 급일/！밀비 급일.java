import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		
		while(true) {
			String inputData = bf.readLine();
			
			if("END".equals(inputData)) {
				break;
			}
			
			StringBuffer buffer = new StringBuffer(inputData);
			// 문자열 거꾸로 출력해주는 java.lang.StringBuffer 클래스의 reverse() 메소드
			String reverseInput = buffer.reverse().toString();		
			builder.append(reverseInput + "\n");
		}
		
		System.out.println(builder);
		
    }
}
