package slideCalisma;

import java.util.ArrayList;
import java.util.List;

public class SC21List {

	public static void main(String[] args) {
		// list olu�turma,eleman ekleme,silme,boyutunu s�yleme
		
		List <String> sl1 = new ArrayList<>(); 
		sl1.add("a");
		sl1.add("b");
		sl1.add("c");
		sl1.add("d");
		System.out.println(sl1.size());//listin length ini verir
		System.out.println(sl1);
		sl1.add(2, "y");//2. indexe y yi  ekldik
		System.out.println(sl1);
		
		sl1.add(0, "cok calis");
		System.out.println(sl1);
		
		sl1.remove(3);//index 3 � siler
		System.out.println(sl1);
		sl1.remove("d");
		System.out.println(sl1);
		
		sl1.add("k");
		//her zaman yeni eleman� sa�a ekler
		System.out.println(sl1);
		
		System.out.println(sl1.remove("c"));//true(b�yle yazarsak true veya false verir)
		System.out.println(sl1);
		
		sl1.remove("b");//(�nce silip sonra yazd�rmak daha iyi)
		System.out.println(sl1);

	}

}
