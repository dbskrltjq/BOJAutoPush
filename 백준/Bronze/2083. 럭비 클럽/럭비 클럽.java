import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String[] inputDatas = bf.readLine().split(" ");
			
			if("#".equals(inputDatas[0])) {
				break;
			}
			
			String name = inputDatas[0];
			int age = Integer.parseInt(inputDatas[1]);
			int weight = Integer.parseInt(inputDatas[2]);
			
			if(isSenior(age, weight)) {
				sb.append(name + " " + "Senior" + "\n");
			} else {
				sb.append(name + " " + "Junior" + "\n");
			}
		}
		System.out.println(sb);
       
    }
	
	public static boolean isSenior(int age, int weight) {
		
		if(age > 17 || weight >= 80) {
			return true;
		} else {
			return false;
		}
	}
}
