package slideCalisma;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SC23 {

	public static void main(String[] args) {
/* DATE
 * 1-)þu anki tarih
 * 2-)tarihi ileri veya geri alabilme
 * 3-)tarih formatýný deðiþtirme
 * java LocalDate isimli class oluþturmuþ
 */
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);//2020-07-25
		
		System.out.println(ld.plusDays(-2));//ld.plus tarihe ekleme yapýyor
		System.out.println(ld.plusMonths(4));
		System.out.println(ld.plusYears(7));
		
		System.out.println(ld.minusDays(56));//ister böyle yaparýz ister yukarýyý eksi yaparýz
        System.out.println(ld.minusMonths(6));
        System.out.println(ld.minusYears(8));//tarihte önceye gitme
        
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//month büyük harf ile
		System.out.println(dtf.format(ld));//25/07/2020
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf1.format(ld));//25/Tem/2020
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf2.format(ld));//25/Temmuz/2020
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(dtf3.format(ld));//25/07/20
		
		
		

	}

}
