import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int defencePoint = Integer.parseInt(st.nextToken());							// 몬스터 방어율 수치
		int defencePenetrationPercentage = Integer.parseInt(st.nextToken());			// 유저의 방무
		
		boolean isDamage = false;
		
		if(defencePoint*(100 - defencePenetrationPercentage) >= 10000) {
			isDamage = false;
		} else {
			isDamage = true;
		}
		
		System.out.println(isDamage ? 1 : 0);
	}
}
