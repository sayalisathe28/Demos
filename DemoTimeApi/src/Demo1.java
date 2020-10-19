import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LocalDate today = LocalDate.now();
		
		LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 1);
	
		Period diff = today.until(date);
		
		System.out.println("diff is "+diff.getDays()+" days "+diff.getMonths()+" months"
				+diff.getYears()+" years");
		
		Period diff1 = Period.between(today, date);
		
		System.out.println("diff1 is "+diff1.getDays()+" days "+diff1.getMonths()+" months"
				+diff1.getYears()+" years");
	}

}
