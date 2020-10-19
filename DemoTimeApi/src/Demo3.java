import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZonedDateTime date1 = ZonedDateTime.now();
		System.out.println("current date1 = "+date1);
		
		ZonedDateTime date2 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("date2 = "+date2);
	}

}
