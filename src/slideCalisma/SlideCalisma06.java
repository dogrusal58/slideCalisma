package slideCalisma;

public class SlideCalisma06 {

	public static void main(String[] args) {
		// "==" ve"equals()" arasýndaki fark
		//"==" hem adresleri hem deðerleri kontrol eder ,equals() sadece deðerleri kontrol eder.
		//firstName==lastName(false olur.)(deðerler ayný adresler farklý)
		//firstName.equals(lastName)(true olur)(sadece deðerlere bakar)
		
		String str1 = "Ali";
		String str2 = "ALi";
		System.out.println(str1.equals(str2));
		

	}

}
