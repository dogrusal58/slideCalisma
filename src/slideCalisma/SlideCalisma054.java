package slideCalisma;

public class SlideCalisma054 {

	public static void main(String[] args) {
		// Stringleri birleþtirme.(concatenation
		String str1 ="ali";
		String str2 = "gel";
		System.out.println(str1+str2);//aligel
		System.out.println(str1+" "+str2);//ali gel
		
		String a ="2"+(2+6);
		System.out.println(a);//28
		
		String b ="çalýþ";
		System.out.println(b+2+3);//çalýþ23/string baþta ise java bunu toplama görmez)
		
		String c ="çok";
		System.out.println(c+(3-2));//çok1
		
		int n1 =2;
		int n2 =3;
		String s1="study";
		String s2 ="hard";
		System.out.println(""+(n1*n2)+(n2-n1)+" "+s1+"-"+(n2-n1));//"61 study-1"
		//string bir ifadeden sonra kullanýlan iþlemleri yan yana yazar.bir tek parantez içlerini yapar.
		

	}

}
