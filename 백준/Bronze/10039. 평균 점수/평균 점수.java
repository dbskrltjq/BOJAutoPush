import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int totalScore = 0;
		
		for(int i = 0; i < 5; i++) {
			int score = Integer.parseInt(bf.readLine());
			if(score >= 40) {
				totalScore += score;
			} else {
				totalScore += 40;
			}
		}
		
		System.out.println(totalScore/5);
    }
}
