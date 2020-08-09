package slideCalisma;

import java.util.Arrays;

public class SC1902 {
	//split metodu
	

	public static void main(String[] args) {
		String str = "Java’yý, sevdiniz mi?";
		
		String s1[]=str.split(",");
		String s2[] = str.split("y");//y yi keser.string i y ye göre parçalar.Array içinde y olmaz.
		String s3[] = str.split(" ");
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(s3));
		

	}

}
