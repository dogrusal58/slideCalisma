package slideCalisma;

public class SlideCalisma02 {

	public static void main(String[] args) {
		// bu slide �n konusu veri tan�mlama ve veri tipleri
		/*veri memory de kaplanan yerin ad�d�r.her veri tipinin farkl� boyutu vard�r.
		 * 
		 */
		//1.yol
		int yas=19,kilo=70,boy=185;
		//2.yol
		int hiz,yol,zaman;
		hiz=120;
		yol=360;
		zaman=3;
		//3.yol
		int s1=165;
		float s2=35.79f;
		//2.yol
		long s3;
		s3=12345678;
		System.out.println(yas + hiz);
		System.out.println(s3 - s1);
		System.out.println(s3 / s1);//int say�lar b�l�nd���nde sonu� ondal�kl� ise tan�mdan dolay� java tam say� k�sm�n� al�r.
		//�rnek olark int a=5 ve b=2 ise a/b = 2 olacakt�r.tan�m int oldu�u i�in.e�er tan�m float olsayd� sonu� 2.5 olurdu
		float a,b;
		a=5;
		b=2;
		System.out.println(a/b);
		
		char ch1='A',ch2='l',ch3='i',ch4='g',ch5='e';
		System.out.println(ch1+ch2+ch3+" "+ch4+ch5+ch2+" ");
		//" " ifadesi string dir.bundan �ncekileri java karakterlerin ascii de�erlerini toplar
		//fakat stringden sonra d���n�r ki bunlar toplanmaz harfleri yazar
		
		System.out.println(""+ch1+ch2+ch3+" "+ch4+ch5+ch2);
		//ba�a "" ifadesini yaz�nca java d���nd�ki strinler toplanmaz hepsini string olarak yazd�
		//print ve println aras�ndaki fark sat�r atlatmad�r.
		//"" ve " " farkl� anlamdad�r.i�inde bo�luk olmayan hi� ifadesi ta��r,bo�luk olan araya bir bo�luk yapar," " veya "" birer stringdir.
		
		System.out.println("Ali"+" "+"gel");//" " bo�luk koymay� unutursan biti�ik yazd�r�r.
	}

}
