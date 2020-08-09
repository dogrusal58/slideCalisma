package slideCalisma;

public class SlideCalisma03 {

	public static void main(String[] args) {
		/*primitive data type leri java üretir.baþkasý üretemez
		 * bunlar boolean,char,byte,short,int,long,float,double
		 *non primitiveleri herkes oluþturabilir.
		 *primitivler value içerir,nonprimitive ler value ve method içerebilir.
		 *primitivler küçük,nonprimitivler büyük harf ile baþlar
		 *primitivlerin boyutu data tipine göre deðiþir ama non primitivlerin aynýdýr.
		 */
		String str1= "ali";
		String str2 ="Bahçe Þehir Üniversitesi";
		String str3,str4;
		str3="okul";
		str4="baþlýyor";
		String str5="geç",str6="kalmayýn";
		System.out.println(str1+str3+str4+str5+str6);
		//böyle yazdýrýrsak bitiþik yazar(aliokulbaþlýyorgeçkalmayýn)
		System.out.println(str1+" "+str3+" "+str4+" "+str5+" "+str6+"!");
		//ali okul baþlýyor geç kalmayýn!

	}

}
