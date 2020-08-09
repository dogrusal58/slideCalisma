package slideCalisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MukemmelSayi {//bu method ile önce pozitif bölenleriniz sayýsýný buluyoruz

	public static void main(String[] args) {
		// Bir sayisinin pozitif tam bolenleri belirleme 
		// Ayrica bu sayinin mukemmel sayi olup olmadigini bulma programi
		
		// 6 ==> {1,2,3,6}
		// 1+2+3=6 = 6
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Pozitif Bolenlerini bulacaginiz sayiyi giriniz =");
		int num = scan.nextInt();
		
		Integer arr[]=pozBolenler(num).toArray(new Integer[pozBolenler(num).size()]); 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		if(mukemmel(arr)==2*num) {
			System.out.println("Sayi mukemmel sayidir");
		}else {
			System.out.println("Sayi mukemmel sayi degildir");
		}
				
		scan.close();
	}
	
	
	public static List<Integer> pozBolenler(int num){
		List<Integer> list = new ArrayList<>();
		for(int i =1; i<=num; i++) {
			if(num%i==0) {
				list.add(i);
			}
		}return list;
	}
	
	public static int mukemmel(Integer... arr) {
		int sum = 0;
		for(int w:arr) {
			sum+=w;
		}return sum;
	}

}



