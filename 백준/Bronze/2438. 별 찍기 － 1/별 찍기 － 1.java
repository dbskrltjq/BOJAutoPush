import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		scan.close();
		
	}
	
	/*
	BufferedWriter 
	- 한번에 모았다가 출력이 가능하다.
	- System.out.println() 처럼 자동개행 기능이 없기 때문에 개행이 필요한 경우 \n 을 통해 따로 처리해 주어야한다.
	
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언
	  String sr = "abcdefg"; 	//출력할 문자열
	  bw.write(sr); 		//출력
	  bw.newLine();			//줄바꿈
	  bw.flush(); 			//남아있는 데이터를 모두 출력시킴
	  bw.close(); 			//스트림을 닫음
	
	*/
	/* 다른 방법
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				bw.write('*');		// write("출력할 내용") 으로 출력할 내용을 담는다.
			}
			bw.newLine();
		}
		bw.flush();				// write로 담은 내용 출력 후, 버퍼를 비운다.
		bw.close();				// 스트림 닫기
	}
	*/
}
