package slideCalisma;

import java.util.Scanner;

public class SlideCalisma032 {

	public static void main(String[] args) {
		// kullanýcýdan data alma
		Scanner scan = new Scanner(System.in);
		System.out.println("100 den küçük iki sayý giriniz");//kullanýcýya ne yapacaðýný söyleyin
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int sonuc = n1+n2;
System.out.println(n1+"+"+n2+"="+ sonuc);
   scan.close();
   
   
	}

}
