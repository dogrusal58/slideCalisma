package slideCalisma;

public class SC12 {

	public static void main(String[] args) {
		// while-loop kullanarak 1den 5e kadar olan sayýlarý yazdýralým
		
		int i =1 ;
		while(i<=5) {
			System.out.print(i +" ");
			i++;
		}
		
		System.out.print("\n");//bunu araya yazýnca bir alt satýrdan devam etti.
		
		//k'dan küçük harfleri yazdýralým
		char ch= 'a';
		while(ch<'k') {
			
			System.out.print(ch + " ");
			ch++;
		}
		
		System.out.print("\n");//dikkat ln eklemedik.ln ekleyince bir boþluk daha yapýyor.
			
			//ilk 8 küçük harfin ascii deðerleri toplamý
			int sum = 0 ;
			char ch1 = 'a';
			while(ch1<='j') {
				sum =sum + ch1;
				ch1++;
			}
			System.out.print(sum);
		

	}

}
