package slideCalisma;

public class SC101 {

	public static void main(String[] args) {
		// String methodlar devam
		String s1 = "Ahmet,geldin mi ?";
		String s2 = "b�y�k F�K�RL� AdamLar ! ";
		String s3 ="EVDE KAL !";
		
		
		System.out.println(s1.indexOf("e"));//3
		System.out.println(s2.indexOf("K�R"));//8(ilk harfin indexini verir)
		System.out.println(s3.indexOf("K"));//5(bo�luk da karakterdir ve ilk harfin indexi 0 d�r)
		
		System.out.println(s1.lastIndexOf("i"));//14
		System.out.println(s2.lastIndexOf("a"));//19
		System.out.println(s3.lastIndexOf(" "));//8
		
		System.out.println(s2.toUpperCase().toLowerCase());//�nce k���kleri b�y��e sonra b�y�kleri k����e �evirdi
		
		String s4 = "Adana,Urfa kebap bulunur ! " ;
		System.out.println(s4.substring(3));//na,Urfa kebap bulunur !
		System.out.println(s4.substring(3, 9));//na,Urf(3 � ald� 9 u almad�)
		System.out.println(s4.substring(5, 10));//,Urfa(5 i al�yor 10 u alm�yor)
		System.out.println(s4.toLowerCase().charAt(6)+s4.toUpperCase().substring(1, 5));//uDANA
		
		String s5 = "1234567" ;
		String s6 = "4567093" ;
		int n1 = 1234567 ;
		int n2 = 4567093 ;
		
		System.out.println(Integer.valueOf(s5) + Integer.valueOf(s6));//5801660(i�indeki de�erleri topluyor)
		System.out.println(String.valueOf(n1) + String.valueOf(n2));//12345674567093(i�indeki de�erleri string olarak birle�tiriyor)
		
		
		
		
		

	}

}
