package Day7;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class DateTime {
	public static void main(String args[]) {
		Date today=new Date();
		System.out.println(today);
		
		Date yesterday=new Date("2019/03/14 14:00:00");
		System.out.println(yesterday);
		
		long timeinmillis=Date.parse("2019/03/14 14:30:00");
		Date time=new Date();
		
		LocalDate tdy= LocalDate.now();
		LocalDate bdy=LocalDate.of(1995,11 , 29);
		Period P=Period.between(bdy, tdy);
		System.out.println(P.getYears());
		
		
	}

}
