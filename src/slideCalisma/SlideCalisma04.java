   package slideCalisma;

public class SlideCalisma04 {

	public static void main(String[] args) {
		// 1-)Auto widening casting : k���k data tipini b�y�k data tipine atarsak bunu java sorun etmez,otomatik tan�r.
		byte num1 = 15;
		long num2 = num1;
		System.out.println(num2);
		int num3 =12345;
		double num4 = num3;
		System.out.println(num4);
		
		//2-)Explicit Narrowing Casting : b�y�k data tipini k����e �evirme i�ni biz yapt�rmal�y�z.
		
		long num5 = 123456789;
		int num6 = (int)num5;
		System.out.println(num6);
		
		float num7 = 3.32f ;
		double num8 = num7 ;
		System.out.println(num7);

		double num9 = 12345.6789 ;
		float num10 =(float) num9;
		System.out.println(num9);
		
		int s1 = 5;
		double s2 = 6.2;
		double toplam = s1 + s2 ;
		System.out.println("Toplam = "+ toplam);
		
		short s3 = 255;
		byte s4 = (byte)s3;
		System.out.println(s4);// -1  ��kt�s� "-1" olur.Byte -128 ile 127 aras� de�erler alabilir,e�er byte �n aral���nda olmayan bir
		//de�eri byte yazd�rmaya �al���rsak,java onun de�erinden devaml� 128 ��kar�r.
		
		long s5 = 17683;
		byte s6 = (byte)s5;
		System.out.println(s6);//19
		
		byte s7 =127;
		System.out.println(s7);
		int s8 =5/2;//2
		float s9 = 5/2f;//2,5  veya 5f/2f de olur.
		System.out.println("s8 = "+ s8 +"   "+ "s9 = " + s9);
		double s10 = 5/2d;// 5d/2d de olur.
		System.out.println(s10);//2,5
		
	}

}
