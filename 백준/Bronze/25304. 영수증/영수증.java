import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int totalPriceOnReceipt = Integer.parseInt(bf.readLine());				// 영수증에 적힌 총금액
		int productCount = Integer.parseInt(bf.readLine());						// 구매한 물건의 종류 수
		
		int price = 0;															// 각 물건의 가격
		int numberOfProduct = 0;												// 해당 물건의 구매 수량
		int totalPrice = 0;														// 실제 총금액
		
		for(int i = 0; i < productCount; i++) {
			
			String[] lists = bf.readLine().split(" ");
			price = Integer.parseInt(lists[0]);
			numberOfProduct = Integer.parseInt(lists[1]);
			
			totalPrice += price*numberOfProduct;
		}
		
		System.out.println(totalPriceOnReceipt == totalPrice ? "Yes" : "No");
	}
}
