package slideCalisma;

import java.util.Scanner;

public class SC081 {

	public static void main(String[] args) {
		/*NESTED İF
		 * Kullanıcıdan bir harf girmesini isteyin. 
		Girdiği küçük harf ise harﬁn “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
		“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
		Girdiği büyük harf ise harﬁn “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
		“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz : ");
		char harf = scan.next().charAt(0);
		if(harf>='a' && harf<='z') {
			if(harf=='a') {
				System.out.println("ilk küçük harf ");
				
			}else {
				System.out.println("ilk küçük harf değil");
				
			}
		}
			if(harf>='A' && harf<='Z') {
				if(harf=='Z') {
					System.out.println("son büyük harf");
					
				}else {
					System.out.println("son büyük harf değil");
					
				}
			}
		}
}


