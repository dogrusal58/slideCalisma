package slideCalisma;

import java.util.Scanner;

public class SC092 {

	public static void main(String[] args) {
		//Kullanýcýdan iki tamsayý girmesini isteyin, ekrana her zaman büyük olanýný yazdýrýn

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci tam sayýyý giriniz : ");
		int num1 = scan.nextInt();
		
		System.out.println("Ýkinci tam sayýyý giriniz : ");
		int num2 = scan.nextInt();
		
		String result = num1 > num2 ? "büyük sayý birinci girdiðiniz" : "büyük sayý ikinci girdiðiniz" ;
		System.out.println(result);
		scan.close();

	}

}
