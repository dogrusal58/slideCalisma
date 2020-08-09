package slideCalisma;

public class SC1901 {

	public static void main(String[] args) {
		int x[] = {2,1,4,5,7};
		
		int limit = 3 ;
		int sum = 0 ;
		int i = 0 ;
		while((sum<limit) && (i<x.length)) {
			i ++;
			sum =sum + x[i];
			
		}
		System.out.println(sum);
          
	}

}
