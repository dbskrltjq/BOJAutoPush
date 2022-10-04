import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		
		/*
		 *  ZonedDateTime 클래스
		 *  	- ZonedDateTime = LocalDateTime + 시차/타임존
		 *  	- 타임존 또는 시차 개념이 필요한 날짜와 시간 정보를 나타내기 위해서 사용된다.
		 *  	- Public 생성자를 지원하지 않기 때문에, now(), of() 라는 정적 메서드를 이용하여 객체를 생성한다.
		 */
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(zonedDateTime.getYear());
		System.out.println(zonedDateTime.getMonthValue());
		System.out.println(zonedDateTime.getDayOfMonth());
	}
}
