
public class Main {
 //main javada başlangıç metodu
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri java 'da camelCase yazılır.
		//String
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		
		System.out.println(ortaMetin);
		
		//integer tamsayı değer
		int vade = 12;
	
		//Double ondalıklı sayı 
		double dolarDun=18.14;
		double dolarBugun=18.10;
	
		//Boolean doğru yanlış
		boolean dolarDustuMu=false;
		
		String okYonu = "";
		
		if(dolarBugun<dolarDun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		}
		else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		//Array Diziler
		String[] krediler = {
				"HızlıKredi","Maaşını alan","MutluEmekli"
		};
		
		//For loop
		for(int i = 0 ; i< krediler.length;i++) {
			System.out.println(krediler[i]);
		}
	}

}
