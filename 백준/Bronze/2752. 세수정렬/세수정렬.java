import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int[] inputDatas = new int[3];
		
		for(int i = 0; i < 3; i++) {
			inputDatas[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(inputDatas); 			// 오름차열 정렬해주는 메소드
		
		System.out.println(inputDatas[0] + " " + inputDatas[1] + " " + inputDatas[2]);
    }
}
