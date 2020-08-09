package slideCalisma;

public class TersString {

	public static void main(String[] args) {
		// "Salih sana çok gýcýk oluyorum !"
		String str ="Salih sana çok gýcýk oluyorum !";
		String s ="";
		 for(int i =str.length()-1;i>=0;i--) {
			 s =s + str.charAt(i);
			 
		 }
		 System.out.println(s); 
		 
		 String str1 = "Ben de kendime çok gýcýk oluyorum !";
		 String s1 ="";
		 for(int i =str1.length()-1;i>=0;i--) {
			 s1 = s1 +str1.charAt(i);
		 }
		 System.out.println(s1);
		 
		 StringBuilder Str2 = new StringBuilder("Biraz daha çalýþmalýsýn !");
		 System.out.println(Str2.reverse());//string builder metodu ile tersten yazdýrdýk
		 
		 Str2.append(" , çok çalýþmalýsýn");//.append ekleme yapar.
		 System.out.println(Str2);
	}

}
