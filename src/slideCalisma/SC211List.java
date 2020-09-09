package slideCalisma;

import java.util.ArrayList;
import java.util.List;

public class SC211List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> il1 = new ArrayList<>();//list içinde kullanýlan int ifadesi büyük harfle
		//kýsaltýlmadan yazýlýr
		 il1.add(0);
		 il1.add(2);
		 il1.add(4);
		 System.out.println(il1);
		 il1.add(1, 5);
		 System.out.println(il1);
		 il1.remove(0);
		 System.out.println(il1);
		 
	}

}
