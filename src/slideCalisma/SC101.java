package slideCalisma;

public class SC101 {

	public static void main(String[] args) {
		// String methodlar devam
		String s1 = "Ahmet,geldin mi ?";
		String s2 = "büyük FÝKÝRLÝ AdamLar ! ";
		String s3 ="EVDE KAL !";
		
		
		System.out.println(s1.indexOf("e"));//3
		System.out.println(s2.indexOf("KÝR"));//8(ilk harfin indexini verir)
		System.out.println(s3.indexOf("K"));//5(boþluk da karakterdir ve ilk harfin indexi 0 dýr)
		
		System.out.println(s1.lastIndexOf("i"));//14
		System.out.println(s2.lastIndexOf("a"));//19
		System.out.println(s3.lastIndexOf(" "));//8
		
		System.out.println(s2.toUpperCase().toLowerCase());//önce küçükleri büyüðe sonra büyükleri küçüðe çevirdi
		
		String s4 = "Adana,Urfa kebap bulunur ! " ;
		System.out.println(s4.substring(3));//na,Urfa kebap bulunur !
		System.out.println(s4.substring(3, 9));//na,Urf(3 ü aldý 9 u almadý)
		System.out.println(s4.substring(5, 10));//,Urfa(5 i alýyor 10 u almýyor)
		System.out.println(s4.toLowerCase().charAt(6)+s4.toUpperCase().substring(1, 5));//uDANA
		
		String s5 = "1234567" ;
		String s6 = "4567093" ;
		int n1 = 1234567 ;
		int n2 = 4567093 ;
		
		System.out.println(Integer.valueOf(s5) + Integer.valueOf(s6));//5801660(içindeki deðerleri topluyor)
		System.out.println(String.valueOf(n1) + String.valueOf(n2));//12345674567093(içindeki deðerleri string olarak birleþtiriyor)
		
		
		
		
		

	}

}
