package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Furkan";
		String ogrenci2 = "İsa Emre";
		String ogrenci3 = "Engin";
		String ogrenci4 = "Mustafa";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Furkan";
		ogrenciler[1] = "İsa Emre";
		ogrenciler[2] = "Engin";
		ogrenciler[3] = "Mustafa";
		//ogrenciler[4] = "Ali";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("----------------");
		
		for(String ogrenci:ogrenciler) {
			
			System.out.println(ogrenci);
			
		}
		
				
	}

}
