package slideCalisma;

public class SlideCalisma054 {

	public static void main(String[] args) {
		// Stringleri birle�tirme.(concatenation
		String str1 ="ali";
		String str2 = "gel";
		System.out.println(str1+str2);//aligel
		System.out.println(str1+" "+str2);//ali gel
		
		String a ="2"+(2+6);
		System.out.println(a);//28
		
		String b ="�al��";
		System.out.println(b+2+3);//�al��23/string ba�ta ise java bunu toplama g�rmez)
		
		String c ="�ok";
		System.out.println(c+(3-2));//�ok1
		
		int n1 =2;
		int n2 =3;
		String s1="study";
		String s2 ="hard";
		System.out.println(""+(n1*n2)+(n2-n1)+" "+s1+"-"+(n2-n1));//"61 study-1"
		//string bir ifadeden sonra kullan�lan i�lemleri yan yana yazar.bir tek parantez i�lerini yapar.
		

	}

}
