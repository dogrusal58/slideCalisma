package slideCalisma;

import java.util.Scanner;

public class SC08 {

	public static void main(String[] args) {
		//NESTED ÝF
		//Kullanýcýdan cinsiyetini girmesini isteyiniz.erkek ise yaþýný kontrol ediniz 18 den küçük
		// ise erkek çocuk deðilse adam ,
		//kadýn ise yaþý 18 den küçük ise kýz çocuðu deðilse kadýn yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("cinsiyetinizi giriniz : ");
		String cins = scan.nextLine();
		System.out.println("yaþýnýzý giriniz : ");
		int yas = scan.nextInt();
		
		String c1 = "erkek";
		String c2 = "kadýn";
		
		if(cins.equals(c1)) {
			if(yas<18) {
				System.out.println("erkek çocuðu");
			
			}else {
				System.out.println("adam");
			
			}
		}
		else if(cins.equals(c2)) {
				if(yas<18) {
					System.out.println("kýz çocuðu");
				
				}else {
					System.out.println("kadýn");
				
				}
			}
		scan.close();
		}
	}


