package slideCalisma;

public class TersString {

	public static void main(String[] args) {
		// "Salih sana �ok g�c�k oluyorum !"
		String str ="Salih sana �ok g�c�k oluyorum !";
		String s ="";
		 for(int i =str.length()-1;i>=0;i--) {
			 s =s + str.charAt(i);
			 
		 }
		 System.out.println(s); 
		 
		 String str1 = "Ben de kendime �ok g�c�k oluyorum !";
		 String s1 ="";
		 for(int i =str1.length()-1;i>=0;i--) {
			 s1 = s1 +str1.charAt(i);
		 }
		 System.out.println(s1);
		 
		 StringBuilder Str2 = new StringBuilder("Biraz daha �al��mal�s�n !");
		 System.out.println(Str2.reverse());//string builder metodu ile tersten yazd�rd�k
		 
		 Str2.append(" , �ok �al��mal�s�n");//.append ekleme yapar.
		 System.out.println(Str2);
	}

}
