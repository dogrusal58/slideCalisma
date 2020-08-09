package slideCalisma;

public class SC2501 {

	public static void main(String[] args) {

        SC25 obj = new SC25();
        System.out.println(obj.getStr());
        
        obj.setStr("önemli konular");
        System.out.println(obj.getStr());
        
        SC25 obj1 = new SC25();
        System.out.println(obj1.getSifre());
        
        obj1.setSifre(10711453);
        System.out.println(obj1.getSifre());

	}

}
