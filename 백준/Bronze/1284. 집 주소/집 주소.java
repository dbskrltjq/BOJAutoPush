import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String N = bf.readLine();
			if("0".equals(N)) {
				break;
			}
			int width = 0;
			for(int i = 0; i < N.length(); i++) {
				if(N.charAt(i) == '1') {
					width += 2;
				} else if(N.charAt(i) == '0') {
					width += 4;
				} else {
					width += 3;
				}
			}
			width += (N.length() - 1) + 2;		// 숫자 사이의 여백 + 왼쪽, 오른쪽 경계 여백
			sb.append(width + "\n");
		}
		System.out.println(sb);
		
    }
}
