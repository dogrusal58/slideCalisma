package slideCalisma;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SC23 {

	public static void main(String[] args) {
/* DATE
 * 1-)�u anki tarih
 * 2-)tarihi ileri veya geri alabilme
 * 3-)tarih format�n� de�i�tirme
 * java LocalDate isimli class olu�turmu�
 */
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);//2020-07-25
		
		System.out.println(ld.plusDays(-2));//ld.plus tarihe ekleme yap�yor
		System.out.println(ld.plusMonths(4));
		System.out.println(ld.plusYears(7));
		
		System.out.println(ld.minusDays(56));//ister b�yle yapar�z ister yukar�y� eksi yapar�z
        System.out.println(ld.minusMonths(6));
        System.out.println(ld.minusYears(8));//tarihte �nceye gitme
        
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//month b�y�k harf ile
		System.out.println(dtf.format(ld));//25/07/2020
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf1.format(ld));//25/Tem/2020
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf2.format(ld));//25/Temmuz/2020
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(dtf3.format(ld));//25/07/20
		
		
		

	}

}
