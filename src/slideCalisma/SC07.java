package slideCalisma;

import java.util.Scanner;

public class SC07 {

	public static void main(String[] args) {
		// Kullan�c�dan al�nan tam say� 0 dan k���k ise negatif,0 ise n�tr,
		//0 dan b�y�k ise pozitif yazd�ral�m.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir say� giriniz : ");
		int num = input.nextInt();
		
		if(num<0) {
			System.out.println("negatif say� girdiniz");
		
		}
		else if(num==0) {
			System.out.println("n�tr");
			
		}
		else if(num>0){
			System.out.println("pozitif say� girdiniz");
			
		}
		
		input.close();
		

	}

}
