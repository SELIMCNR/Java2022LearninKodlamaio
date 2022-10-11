package core.logging;

public class FileLogger implements Logger{

	@Override //interfaceden geliyor der
	public void log(String data) {
		System.out.println("Dosyaya Loglandı: "+data);
		
	}
	

}
