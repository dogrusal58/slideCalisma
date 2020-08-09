package slideCalisma;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class SC2301 {

	public static void main(String[] args) {
/*Time
 *  1-)anlýk zamaný verme
 *  2-)ileri ve geri alma
 *  3-)formatýný deðiþtirme
 *  java nýn LocalTime isimli clasý var
 */
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);//16:36:56.521
		
		System.out.println(lt.plusHours(3));//zamana ekleme yapýyoruz
		System.out.println(lt.plusMinutes(35));
		System.out.println(lt.plusSeconds(126));
		
		System.out.println(lt.minusHours(2));//zamanda geriye gittik.
		System.out.println(lt.minusMinutes(25));
		System.out.println(lt.minusSeconds(2567));
		
		DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf1.format(lt));//04:41
		
		DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf2.format(lt));//16:42
		
		//farklý ülkelerdeki yerel saat
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));
		
	}

}
