package slideCalisma;

import java.util.Scanner;

public class SC071 {

	public static void main(String[] args) {
		//kullanýcýdan notunu alýn ve aþaðýdaki kurallara göre A,B,C ve D yazdýrýn
		//NOT<50 D,50<=NOT<60 C,60<=NOT<80 B,80<=NOT<=100 A
		
		Scanner scan = new Scanner(System.in);
		System.out.println("öðrenci notunu giriniz : ");
		int not = scan.nextInt();
		if(not<0 || not >100) {
			System.out.println("Yanlýþ deðer girdiniz ");
		}
		else if(not>=0 && not<50) {
			System.out.println("Öðrenci notu D " );
			
		}else if(not<60) {
			System.out.println("Öðrenci notu C ");
		}else if(not<80) {
			System.out.println("Öðrenci notu B ");
			
		}else {
			System.out.println("Öðrenci notu A ");
			
		}
		
		scan.close();
		
		
		
		
	}

}
