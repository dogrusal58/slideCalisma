package slideCalisma;

import java.util.Arrays;

public class SC18 {

	public static void main(String[] args) {
		// ARRAY olu�turma ve ekleme yollar�
		
		int arr[] = new int[4];//burada array in uzunlu�unu belirtiyoruz
		arr[0] = 7;//array bir objedir.
		arr[1] = 9;//array e ekleme yap�yoruz
		arr[2] = 8;
		arr[3] = 0;
		System.out.println(Arrays.toString(arr));//array i yazd�r�yoruz.
		
		int arr1[]= {3,9,4,0,5};//bu �ekilde arr i�in k�sayoldur.
		System.out.println(Arrays.toString(arr1));
		
		int arr2[] = {5,8,0,3,7};
		Arrays.sort(arr2);//k���kten b�y��e s�ralama
		System.out.println(Arrays.toString(arr2));//[0, 3, 5, 7, 8]
		
		int arr3[] = {1,5,9,2,6,17,30,4,28};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));//[1, 2, 4, 5, 6, 9, 17, 28, 30]
		System.out.println("En k���k eleman� = " + arr3[0]);//1
		System.out.println("En b�y�k eleman� = " + arr3[arr3.length-1]);//30
		
		//arr3[9] =67;
		//System.out.println(Arrays.toString(arr3));(array olu�turulduktan sonra eklenmiyor)
		
		
		
		
		
		
		

	}

}
