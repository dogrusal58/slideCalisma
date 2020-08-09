package slideCalisma;

public class SC10 {

	public static void main(String[] args) {
		// String Methodlar
		
		String str = " Ali , Veli, Kýrkdokuz , Elli ! "; 
		String s2 = " Kalk gidelim ! ";
		String s3 = " yeis bir bataklýktýr,içine düþersen boðulursun ! ";
		String s4 = "AZMÝNE SIMSIKI SARIL , BAK , NE OLURSUN ! ";
		
		//boþluklarýn karakter sayýldýðýný unutma!
		
		System.out.println(str.charAt(7));//V
		System.out.println(str.charAt(12));//boþluða denk geldi bir þey vermez
		//System.out.println(str.charAt(54));//run time error verir
		
		System.out.println(str.length());//32 , stringin uzunluðunu verir.boþluk ve iþaretleri de sayar
		System.out.println(s2.length());//16
		
		System.out.println(s3.contains("c"));//false,bir elemanýn olup olmadýðýný sorgular
		System.out.println(s4.contains("S"));//true
		
		System.out.println(str.replace("e", "E"));// 'e' yerine 'E' yazdý
		System.out.println(s2.replace("Kalk", "OTUR"));//Kalk yerine OTUR yazdý
		System.out.println(s3.replace("i", ""));//'i' lerin tamamýný sildi
		
		String s5 = "Asdf_3 4?kl 78.mn /0?";
		System.out.println(s5.replaceAll("\\d","*"));//tüm rakamlarý yýldýza çevirdi.
		System.out.println(s5.replaceAll("\\D", "1"));//rakamlarýn dýiýndaki her þeyi  1 e çevirdi.
		//replaceAll() methodu string ve regex kabul eder.char etmez.replace ile 
		//ayný iþi yapar.replace() char ve string kabul eder regex etmez.
		System.out.println(s5.replaceAll("\\s", "?"));//space leri ? çevirdi
		System.out.println(s5.replaceAll("\\S", "F"));//space dýþýndakileri F ye çevirdi
		
		System.out.println(s4.toLowerCase());//büyük harfleri küçük harf yaptý
		System.out.println(s3.toUpperCase());//küçük harfleri büyük harf yaptý
		
		
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
