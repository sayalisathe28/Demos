import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("input date dd/MM/yy::");
		String input = sc.next();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yy");
		LocalDate date = LocalDate.parse(input,format);
		System.out.println("date = "+date);
		
		sc.close();
	}

}
