package slideCalisma;

public class SlideCalisma06 {

	public static void main(String[] args) {
		// "==" ve"equals()" aras�ndaki fark
		//"==" hem adresleri hem de�erleri kontrol eder ,equals() sadece de�erleri kontrol eder.
		//firstName==lastName(false olur.)(de�erler ayn� adresler farkl�)
		//firstName.equals(lastName)(true olur)(sadece de�erlere bakar)
		
		String str1 = "Ali";
		String str2 = "ALi";
		System.out.println(str1.equals(str2));
		

	}

}
