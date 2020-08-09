package slideCalisma;

import java.util.Scanner;

public class SC086 {

	public static void main(String[] args) {
		// TERNARY
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz : ");
		char hrf = scan.next().charAt(0);
		
		String result = (hrf>='A' && hrf<='Z') ? "BÜYÜK HARF" : "KÜÇÜK HARF";
		System.out.println(result);
		scan.close();

	}

}
