package slideCalisma;

import java.util.Scanner;

public class SC093 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin, ekrana o tamsay�n�n mutlak degerini yazd�r�n.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam say� giriniz : ");
        int n = scan.nextInt();
        
        System.out.println(n<0 ? (-n) : (n)) ;
        scan.close();
		
		
	}

}
