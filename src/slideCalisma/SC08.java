package slideCalisma;

import java.util.Scanner;

public class SC08 {

	public static void main(String[] args) {
		//NESTED �F
		//Kullan�c�dan cinsiyetini girmesini isteyiniz.erkek ise ya��n� kontrol ediniz 18 den k���k
		// ise erkek �ocuk de�ilse adam ,
		//kad�n ise ya�� 18 den k���k ise k�z �ocu�u de�ilse kad�n yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("cinsiyetinizi giriniz : ");
		String cins = scan.nextLine();
		System.out.println("ya��n�z� giriniz : ");
		int yas = scan.nextInt();
		
		String c1 = "erkek";
		String c2 = "kad�n";
		
		if(cins.equals(c1)) {
			if(yas<18) {
				System.out.println("erkek �ocu�u");
			
			}else {
				System.out.println("adam");
			
			}
		}
		else if(cins.equals(c2)) {
				if(yas<18) {
					System.out.println("k�z �ocu�u");
				
				}else {
					System.out.println("kad�n");
				
				}
			}
		scan.close();
		}
	}


