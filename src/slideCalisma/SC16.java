package slideCalisma;

public class SC16 {
	int x = 5 ;
	
	SC16(){
		System.out.print("-x" + x);
	}
	
	SC16(int x) {
		this();
	   System.out.print("-x" + x);
	}

	public 
	  static void main(String[] args) {
		SC16 mc1 = new SC16(4);
		SC16 mc2 = new SC16();

	}

}
