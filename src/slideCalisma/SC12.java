package slideCalisma;

public class SC12 {

	public static void main(String[] args) {
		// while-loop kullanarak 1den 5e kadar olan say�lar� yazd�ral�m
		
		int i =1 ;
		while(i<=5) {
			System.out.print(i +" ");
			i++;
		}
		
		System.out.print("\n");//bunu araya yaz�nca bir alt sat�rdan devam etti.
		
		//k'dan k���k harfleri yazd�ral�m
		char ch= 'a';
		while(ch<'k') {
			
			System.out.print(ch + " ");
			ch++;
		}
		
		System.out.print("\n");//dikkat ln eklemedik.ln ekleyince bir bo�luk daha yap�yor.
			
			//ilk 8 k���k harfin ascii de�erleri toplam�
			int sum = 0 ;
			char ch1 = 'a';
			while(ch1<='j') {
				sum =sum + ch1;
				ch1++;
			}
			System.out.print(sum);
		

	}

}
