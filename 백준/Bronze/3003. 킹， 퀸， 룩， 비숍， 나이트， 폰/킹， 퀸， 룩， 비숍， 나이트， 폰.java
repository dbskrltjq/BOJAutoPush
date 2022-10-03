import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] origin = {1, 1, 2, 2, 2, 8};
		String[] datas = br.readLine().split(" ");
		
		for(int i = 0; i < 6 ; i++) {
			System.out.print((origin[i] - Integer.parseInt(datas[i])) + " ");
		}
	}
}
