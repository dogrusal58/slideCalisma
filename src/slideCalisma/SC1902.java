package slideCalisma;

import java.util.Arrays;

public class SC1902 {
	//split metodu
	

	public static void main(String[] args) {
		String str = "Java�y�, sevdiniz mi?";
		
		String s1[]=str.split(",");
		String s2[] = str.split("y");//y yi keser.string i y ye g�re par�alar.Array i�inde y olmaz.
		String s3[] = str.split(" ");
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(s3));
		

	}

}
