package slideCalisma;

public class SlideCalisma03 {

	public static void main(String[] args) {
		/*primitive data type leri java �retir.ba�kas� �retemez
		 * bunlar boolean,char,byte,short,int,long,float,double
		 *non primitiveleri herkes olu�turabilir.
		 *primitivler value i�erir,nonprimitive ler value ve method i�erebilir.
		 *primitivler k���k,nonprimitivler b�y�k harf ile ba�lar
		 *primitivlerin boyutu data tipine g�re de�i�ir ama non primitivlerin ayn�d�r.
		 */
		String str1= "ali";
		String str2 ="Bah�e �ehir �niversitesi";
		String str3,str4;
		str3="okul";
		str4="ba�l�yor";
		String str5="ge�",str6="kalmay�n";
		System.out.println(str1+str3+str4+str5+str6);
		//b�yle yazd�r�rsak biti�ik yazar(aliokulba�l�yorge�kalmay�n)
		System.out.println(str1+" "+str3+" "+str4+" "+str5+" "+str6+"!");
		//ali okul ba�l�yor ge� kalmay�n!

	}

}
