package slideCalisma;

import java.util.Arrays;

public class SC19 {

	public static void main(String[] args) {

     int arr[] = {5,9,18,4,79,43};
     Arrays.sort(arr);
     
     for(int j =0; j<=arr.length-1;j++) {
    	 System.out.print(" " +arr[j]);
     }
     
     
     int a1[] = {45,987,56,85,24,57,546};
     int a2[] = {45,987,56,85,24,57,546};
     int a3[] = {56,986,37,145,465,1,999};
     
     System.out.println("\n" + Arrays.equals(a1, a3));
     System.out.println( Arrays.equals(a1, a2));
     
     if(Arrays.equals(a1, a2)) {
    	 System.out.println("same");
     }else {System.out.println("not same");
     
     }
     

	}

}
