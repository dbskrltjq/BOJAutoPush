import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> prizes = new ArrayList<>();		// 개개인의 상금을 저장할 변수
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int num1, num2, num3;
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			num3 = Integer.parseInt(st.nextToken());
			
			int prize = 0;
			if(num1 == num2 && num2 == num3 && num1 == num3) {
				prize = 10000 + num1*1000;
			} else if(num1 == num2) {
				prize = 1000 + num1*100;
			} else if(num2 == num3) {
				prize = 1000 + num2*100;
			} else if(num1 == num3) {
				prize = 1000 + num1*100;
			} else {
				prize = Math.max(num1, Math.max(num2, num3))*100;
			}
			prizes.add(prize);
		}
		Collections.sort(prizes, Collections.reverseOrder());
		System.out.println(prizes.get(0));
		
		
    }
}
