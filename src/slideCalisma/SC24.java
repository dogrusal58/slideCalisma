package slideCalisma;

public class SC24 {

	public static void main(String[] args) {
		// StringBuilder
		StringBuilder str1 = new StringBuilder("�al���rsan kolayla��r !");
		System.out.println(str1);
		str1.append(" unutma !");
		System.out.println(str1);//�al���rsan kolayla��r ! unutma !
		
		System.out.println(str1.substring(3, 12));//���rsan k
		System.out.println(str1.charAt(8));//a
		//System.out.println(str1.delete(0,5));//�rsan kolayla��r ! unutma !
		str1.insert(10,",");
		System.out.println(str1);//�al���rsan, kolayla��r ! unutma !
		//System.out.println(str1.replace(4, 9, "AL�YE"));
		System.out.println(str1.replace(0, 0, "haydi �al��! "));
		
		

	}

}
