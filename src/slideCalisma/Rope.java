package slideCalisma;

public class Rope {
	public static void swing() {
		System.out.println("swing");
	}
	public void climb() {
		System.out.println("climb");
	}
	public static void play() {
		swing();
		//climb(); buras� �al��maz.��nki static de�il.static metodun i�indeki her�ey static olmal�
	}

	public static void main(String[] args) {
		
		Rope rope = new Rope();
		rope.play();
		Rope rope2 = null;
		rope2.play();

	}

}
