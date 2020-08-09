package slideCalisma;

import java.util.Arrays;

public class SC1801 {

	public static void main(String[] args) {
		// Array devam...
		
		String str[] = {"ali","gel","okul","acildi","ders","calis"};
		System.out.println(Arrays.toString(str));//[ali, gel, okul, acildi, ders, calis]
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));//[acildi, ali, calis, ders, gel, okul]
		
		System.out.println("�lk eleman : " + str[0]);//�lk eleman : acildi
		System.out.println("son eleman : " + str[str.length-1]);//son eleman : okul
		
		System.out.println("Bastan 3. eleman : " + str[2]);//Bastan 3. eleman : calis
		System.out.println("sondan ikici eleman : " + str[str.length-2]);//sondan ikici eleman : gel
		
		System.out.println(Arrays.binarySearch(str,"b"));//-3,eleman yoksa negatif verir
		System.out.println(Arrays.binarySearch(str,"ders"));//3
		//binary metodundan �nse sort yapmak zorundy�z.
		
		int arr[] = {123,345,0,98,73,999,1111};//��rendiklerimizi tekrar edelim
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//s�ralad�k ve yazd�rd�k
		
		System.out.println(arr[4]);//
		System.out.println(arr[1]);//indexi bir olan eleman,73
		System.out.println(arr[arr.length-3]);//indexi sondan 3. eleman,345
		System.out.println(Arrays.binarySearch(arr, 93));// -3
		System.out.println(Arrays.binarySearch(arr, 123));//3
		
		String str1[] = { "!","cok","ders","cal��mal�s�n","daha","yolun var","unutma"};
		Arrays.sort(str1);
		System.out.println(Arrays.toString(str1));//[!, cal��mal�s�n, cok, daha, ders, unutma, yolun var]
		System.out.println(Arrays.binarySearch(str1, "daha"));//3
		
		
		for(int i=0 ; i<str1.length ; i++) {
			System.out.print(" " +str1[i]);//b�yle de yazd�rabilirdik
			
		}
		System.out.println();//bir sat�r atlatmak i�in yazd�m
		
		int arr2[] = {12,35,46,79,100,29,63,27};
		System.out.println(Arrays.toString(arr2));//[12, 35, 46, 79, 100, 29, 63, 27]
		
		// veya
		
		for(int i = 0 ; i<=arr2.length-1 ;i++ ) {
			System.out.print(" " +arr2[i]);// 12 35 46 79 100 29 63 27
		}
		System.out.println();//bunu bir sat�r atlatmak i�in yazd�m
		
		for(int i = 0 ; i<=arr2.length-1 ; i++) {//array in i�indeki 3 e b�l�nebilen elemanlar� yazd�rd�m.
			if(arr2[i]%3==0) {
				System.out.print(" " +arr2[i]);//12 63 27
			}
		}
		
		
		
		
		

	}

}
