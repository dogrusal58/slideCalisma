package slideCalisma;

public class SC17 {
    static int x = 10 ;//eðer static yapmasaydýk compile time error verir.çünki method static olup variable static olmamasý olmaz.

	public
	    static void main(String[] args) {
		   System.out.println(SC17.x);

	}
	static {
		int x = 20;
		System.out.print(x + " ");
	}

}
