import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime date1 = LocalDateTime.now();
		
		System.out.println("date1 with current zone = "+date1);
		
		LocalDateTime newDate = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		
		System.out.println("new date with zone America/Los_Angeles = "+newDate);
	}

}
