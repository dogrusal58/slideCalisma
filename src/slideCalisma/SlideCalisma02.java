package slideCalisma;

public class SlideCalisma02 {

	public static void main(String[] args) {
		// bu slide ýn konusu veri tanýmlama ve veri tipleri
		/*veri memory de kaplanan yerin adýdýr.her veri tipinin farklý boyutu vardýr.
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
		System.out.println(s3 / s1);//int sayýlar bölündüðünde sonuç ondalýklý ise tanýmdan dolayý java tam sayý kýsmýný alýr.
		//örnek olark int a=5 ve b=2 ise a/b = 2 olacaktýr.taným int olduðu için.eðer taným float olsaydý sonuç 2.5 olurdu
		float a,b;
		a=5;
		b=2;
		System.out.println(a/b);
		
		char ch1='A',ch2='l',ch3='i',ch4='g',ch5='e';
		System.out.println(ch1+ch2+ch3+" "+ch4+ch5+ch2+" ");
		//" " ifadesi string dir.bundan öncekileri java karakterlerin ascii deðerlerini toplar
		//fakat stringden sonra düþünür ki bunlar toplanmaz harfleri yazar
		
		System.out.println(""+ch1+ch2+ch3+" "+ch4+ch5+ch2);
		//baþa "" ifadesini yazýnca java düþündüki strinler toplanmaz hepsini string olarak yazdý
		//print ve println arasýndaki fark satýr atlatmadýr.
		//"" ve " " farklý anlamdadýr.içinde boþluk olmayan hiç ifadesi taþýr,boþluk olan araya bir boþluk yapar," " veya "" birer stringdir.
		
		System.out.println("Ali"+" "+"gel");//" " boþluk koymayý unutursan bitiþik yazdýrýr.
	}

}
