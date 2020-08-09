package slideCalisma;

public class Test1 {

	static { 

        System.out.println("Iyi");

    } 

    Test1(){

    	System.out.println("Cirkin");

    }

    static { 

        System.out.println("Kotu");

    } 

    public static void main(String args[]) { 

    	Test1 t1 = new Test1();

        System.out.println("Berbat"); 

        Test1 t2 = new Test1();

    } 

}