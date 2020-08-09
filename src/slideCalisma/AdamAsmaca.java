package slideCalisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdamAsmaca {
	static List<Character> listTahmin= new ArrayList<>();
	static int hataSayisi = 0;

	public static void main(String[] args) {
		System.out.println("Adam asmaca oyunu basliyor...");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yetkili kisi bir kelime giriyor...");
		String kelime = scan.next();
		char arr[] = kelime.toCharArray(); // String arr[]= kelime.split("");
		// Kelime listemiz...
		List<Character> listKelime= new ArrayList<>();
		for(char w:arr) {
			listKelime.add(w);
		}
		
		// Tahmin listesi 
		for(int i=0 ; i<listKelime.size(); i++) {
			listTahmin.add('_');
		}
		
		System.out.println("Kelimeyi bulmak icin 6 hakkiniz vardir... ");
		while(hataSayisi<6) {
			int count = 0;
			System.out.println("Bir harf giriniz");
			char harf = scan.next().charAt(0);
			for (int i=0 ; i<listKelime.size(); i++) {
				if(harf==listKelime.get(i)) {
					listTahmin.set(i, harf);
					count++;
				}
			}
			yazdirma(listTahmin);
			
			if(listTahmin.equals(listKelime)) {
				System.out.println("...Tebrikler kelimiyi buldunuz...");
				break;
			}else if(count==0) {
				hataSayisi++;
				adamAsma(hataSayisi);
			}
		}		
		scan.close();
	}
	
	// Her harf girisinde tahmin listemi yazdirma...
	public static void yazdirma(List<Character> liste) {
		for(char w:liste) {
			System.out.print(w+" ");
		}
	}

	public static void adamAsma(int hataSayisi) {
		if(hataSayisi==1) {
			System.out.println(  "\nO zaman kafa yolcu...;      ");
            System.out.println(  "                                ");      
            System.out.println(  "      ------                    ");
            System.out.println(  "      |     |                   ");
            System.out.println(  "      |     O                   ");
            System.out.println(  "      |                         ");  
            System.out.println(  "      |                         ");
            System.out.println(  "      |                         ");
            System.out.println(  "     ___        ");
            System.out.println(6-hataSayisi+" hakkiniz kaldi!");
		}else if(hataSayisi==2) {
            System.out.println(  "\nIc organlara dikkat...;        ");
            System.out.println(  "                                ");      
            System.out.println(  "      ------                    ");
            System.out.println(  "      |     |                   ");
            System.out.println(  "      |     O                   ");
            System.out.println(  "      |     |                    ");  
            System.out.println(  "      |                         ");
            System.out.println(  "      |                         ");
            System.out.println(  "     ___        ");
            System.out.println(6-hataSayisi+" hakkiniz kaldi!");
		}else if(hataSayisi==3) {
            System.out.println(  "\nHey kendine gel sag kol yolcu...;");
            System.out.println(  "                                ");      
            System.out.println(  "      ------                    ");
            System.out.println(  "      |     |                   ");
            System.out.println(  "      |     O                   ");
            System.out.println(  "      |    -|                   ");  
            System.out.println(  "      |                         ");
            System.out.println(  "      |                         ");
            System.out.println(  "     ___        ");
            System.out.println(6-hataSayisi+" hakkiniz kaldi!");
		}else if(hataSayisi==4) {
            System.out.println(  "\nYazik sol kol da yolcu...;   ");
            System.out.println(  "                                ");      
            System.out.println(  "      ------                    ");
            System.out.println(  "      |     |                   ");
            System.out.println(  "      |     O                   ");
            System.out.println(  "      |    -|-                    ");  
            System.out.println(  "      |                         ");
            System.out.println(  "      |                         ");
            System.out.println(  "     ___        ");
            System.out.println(6-hataSayisi+" hakkiniz kaldi!");
		}else if(hataSayisi==5) {
            System.out.println(  "\nAha Sag bacak da yolcu...;     ");
            System.out.println(  "                                ");      
            System.out.println(  "      ------                    ");
            System.out.println(  "      |     |                   ");
            System.out.println(  "      |     O                   ");
            System.out.println(  "      |    -|-                  ");  
            System.out.println(  "      |    [                    ");
            System.out.println(  "      |                         ");
            System.out.println(  "     ___        ");
            System.out.println(6-hataSayisi+" hakkiniz kaldi!");
		}else if(hataSayisi==6) {
            System.out.println(  "\nUzgunuz ; Adam oldu...;     ");
            System.out.println(  "                                ");      
            System.out.println(  "      ------                    ");
            System.out.println(  "      |     |                   ");
            System.out.println(  "      |     O                   ");
            System.out.println(  "      |    -|-                  ");  
            System.out.println(  "      |    [ ]                  ");
            System.out.println(  "      |                         ");
            System.out.println(  "     ___        ");
            System.out.println("Hakkiniz kalmadi...");
		}
		
	}
}