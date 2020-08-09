package slideCalisma;

public class SC10 {

	public static void main(String[] args) {
		// String Methodlar
		
		String str = " Ali , Veli, K�rkdokuz , Elli ! "; 
		String s2 = " Kalk gidelim ! ";
		String s3 = " yeis bir batakl�kt�r,i�ine d��ersen bo�ulursun ! ";
		String s4 = "AZM�NE SIMSIKI SARIL , BAK , NE OLURSUN ! ";
		
		//bo�luklar�n karakter say�ld���n� unutma!
		
		System.out.println(str.charAt(7));//V
		System.out.println(str.charAt(12));//bo�lu�a denk geldi bir �ey vermez
		//System.out.println(str.charAt(54));//run time error verir
		
		System.out.println(str.length());//32 , stringin uzunlu�unu verir.bo�luk ve i�aretleri de sayar
		System.out.println(s2.length());//16
		
		System.out.println(s3.contains("c"));//false,bir eleman�n olup olmad���n� sorgular
		System.out.println(s4.contains("S"));//true
		
		System.out.println(str.replace("e", "E"));// 'e' yerine 'E' yazd�
		System.out.println(s2.replace("Kalk", "OTUR"));//Kalk yerine OTUR yazd�
		System.out.println(s3.replace("i", ""));//'i' lerin tamam�n� sildi
		
		String s5 = "Asdf_3 4?kl 78.mn /0?";
		System.out.println(s5.replaceAll("\\d","*"));//t�m rakamlar� y�ld�za �evirdi.
		System.out.println(s5.replaceAll("\\D", "1"));//rakamlar�n d�i�ndaki her �eyi  1 e �evirdi.
		//replaceAll() methodu string ve regex kabul eder.char etmez.replace ile 
		//ayn� i�i yapar.replace() char ve string kabul eder regex etmez.
		System.out.println(s5.replaceAll("\\s", "?"));//space leri ? �evirdi
		System.out.println(s5.replaceAll("\\S", "F"));//space d���ndakileri F ye �evirdi
		
		System.out.println(s4.toLowerCase());//b�y�k harfleri k���k harf yapt�
		System.out.println(s3.toUpperCase());//k���k harfleri b�y�k harf yapt�
		
		
		String s6 = "cuma";
		String s7 = "Cuma";
		String s8 = "CUMA";
		
		System.out.println(s6==s7);//false
		System.out.println(s6.equals(s7));//false
		System.out.println(s7.equals(s8));//false
		System.out.println(s6.equalsIgnoreCase(s7));//true
		System.out.println(s7.equalsIgnoreCase(s8));//true
		
		String s9 = "Cat, caterpillar" ;
		System.out.println(s9.indexOf("p"));//10
		System.out.println(s9.indexOf('p'));//10
		System.out.println(s9.indexOf("erp"));//ilk harfin indexi
		System.out.println(s9.indexOf("a",3));
		System.out.println(s9.lastIndexOf("a",3));
		

		
		
		
	}

}
