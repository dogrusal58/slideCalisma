package slideCalisma;

public class SC24 {

	public static void main(String[] args) {
		// StringBuilder
		StringBuilder str1 = new StringBuilder("Çalýþýrsan kolaylaþýr !");
		System.out.println(str1);
		str1.append(" unutma !");
		System.out.println(str1);//Çalýþýrsan kolaylaþýr ! unutma !
		
		System.out.println(str1.substring(3, 12));//ýþýrsan k
		System.out.println(str1.charAt(8));//a
		//System.out.println(str1.delete(0,5));//ýrsan kolaylaþýr ! unutma !
		str1.insert(10,",");
		System.out.println(str1);//Çalýþýrsan, kolaylaþýr ! unutma !
		//System.out.println(str1.replace(4, 9, "ALÝYE"));
		System.out.println(str1.replace(0, 0, "haydi çalýþ! "));
		
		

	}

}
