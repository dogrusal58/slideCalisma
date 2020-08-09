package slideCalisma;

public class SC2503 {

	public static void main(String[] args) {
		SC2502 obj = new SC2502();
		System.out.println(obj.getAd_Soyad());
		System.out.println(obj.getGelir());
		System.out.println(obj.getTelNo());
		System.out.println(obj.getYas());
		
		obj.setGelir(4500);
		obj.setYas(36);
		obj.setTelNo("5359876542");
		
		System.out.println(obj.getTelNo());
		System.out.println(obj.getGelir());
		System.out.println(obj.getYas());

	}

}
