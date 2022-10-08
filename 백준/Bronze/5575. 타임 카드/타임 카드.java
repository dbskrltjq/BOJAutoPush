import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 3; i++) {
			// 출퇴근 시간을 초로 환산해서 계산하기
			int timeToGo = 0;
			int timeToOff = 0;
			
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			for(int j = 0; j < 2; j++) {
				int hour = Integer.parseInt(st.nextToken());
				int minute = Integer.parseInt(st.nextToken());
				int second = Integer.parseInt(st.nextToken());
				
				if(j == 0) {
					timeToGo = (hour*3600) + (minute*60) + second;
				} else {
					timeToOff = (hour*3600) + (minute*60) + second;
				}
			}
			int workingTime = timeToOff - timeToGo;
			
			// 초를 다시 각 시, 분, 초로 전환해서 저장
			sb.append(workingTime/3600 + " " + (workingTime%3600)/60 + " " + (workingTime%3600)%60 + "\n");
		}
		System.out.println(sb);
    }
}
