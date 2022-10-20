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
		
		int current = 0;			// 각 정착역에서 사람이 내리거나 탔을 때 수
		List<Integer> lists = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int out = Integer.parseInt(st.nextToken());			// 내린 사람의 수
			int in = Integer.parseInt(st.nextToken());			// 탄 사람의 수
			
			current -= out;
			current += in;
			lists.add(current);		// 각 정착역에서 사람의 수를 lists에 담는다
		}
		
		Collections.sort(lists, Collections.reverseOrder()); 		// ArrayList를 내림차순으로 정렬
																	// 오름차순은 Collections.sort(lists);
		System.out.println(lists.get(0));
		
    }
}
