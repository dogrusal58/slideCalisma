package slideCalisma;

import java.util.Arrays;

public class SC1802 {

	public static void main(String[] args) {
		// ARRAY devam...
		//Stringler i�in length()
		//int i�in length... parantezsiz kullan�l�r
		
		int arr[] = new int[2];
		System.out.println(arr[1]);
		//System.out.println(arr[2]);//length i 2 olan bir array e indexi 2 olan yaz�l�rsa
		//java.lang.ArrayIndexOutOfBoundsException uyar� al�n�r
		//bir de array e daha atama yapmad���m�z i�in 1. indexi �al��t�r�r ve s�f�r verir.
		
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		if(arr1==arr2) {
			System.out.println("same");
		}else {
			System.out.println("not same");//bize ayn� geliyor ama de�il,not same
		}
		
		
		int arr3[] = {1,2,3,4};
		int arr4[] = {1,2,3,4};
		if(Arrays.equals(arr3, arr4)) {
			System.out.println("same");
		}else {
			System.out.println("not same");//not same
		}
        
		int arr5[] = {1,2,3,4,5,6,7};//Array in elemanlar�n�n toplam�n� yazd�rd�k
        int sum = 0;
        for(int j=0 ; j<arr5.length ; j++) {
        	sum =sum + arr5[j];
        	
        }
		System.out.println(sum);
		
		
	}

}
