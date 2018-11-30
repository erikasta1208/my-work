package co.com.fincaraiz.certificacion.utils;

public class WaitAMoment {

	public static void please() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
	}
	
}
