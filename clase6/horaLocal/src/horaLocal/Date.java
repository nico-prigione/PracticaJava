package horaLocal;

import java.time.LocalDate;
import java.time.Month;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var ld= LocalDate.now();
		var ls=LocalDate.of(1984, Month.JULY, 10);
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ls);

	}

}
