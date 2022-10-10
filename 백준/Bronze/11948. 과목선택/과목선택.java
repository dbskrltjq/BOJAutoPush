import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int totalScore = 0;
		int[] arr1 = new int[4];
		for(int i = 0; i < 4; i++) {
			arr1[i] = Integer.parseInt(bf.readLine());
			totalScore += arr1[i];
		}
		
		int minScore = Math.min(Math.min(arr1[0], arr1[1]), Math.min(arr1[2], arr1[3]));
		totalScore -= minScore;
		
		int E = Integer.parseInt(bf.readLine());
		int F = Integer.parseInt(bf.readLine());
		System.out.println(totalScore + Math.max(E, F));
    }
}
