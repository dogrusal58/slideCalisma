package slideCalisma;

import java.util.Arrays;

public class SC20 {

	public static void main(String[] args) {
		//Multi Dimensional Array’ler
    int arr [][] = {{1,2},{5,0},{9,7},{7,5}};//çoklu array,
 //bu array de eðer 7 yi seçeceksek 7 nin yerleri arr[2][1] ve arr[3][0] þeklindedir.
    
    System.out.println(arr[2][0]);//9
    System.out.println(arr[1][1]);//0
    
    System.out.println(Arrays.toString(arr[2]));//[9,7]
    System.out.println(Arrays.toString(arr[3]));//[7, 5]
    
    System.out.println(Arrays.toString(arr));
    
 

	}

}
