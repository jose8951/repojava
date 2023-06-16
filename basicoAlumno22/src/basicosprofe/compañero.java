package basicosprofe;

public class compañero {
	private static boolean verificaPalindromo(String cadena) {
		boolean esPalindromo = true;
		String cadenaMitadUno = "";
		String cadenaMitadDos = "";
		String cadenaMitadDosReversed = "";
		int j = cadena.length();

		cadenaMitadUno = cadena.substring(0, (j / 2));
		cadenaMitadDos = cadena.substring((j / 2));

		for (int i = 0; i < cadenaMitadDos.length(); i++) {
			cadenaMitadDosReversed = cadenaMitadDos.charAt(i) + cadenaMitadDosReversed;
		}

		esPalindromo = cadenaMitadUno.contentEquals(cadenaMitadDosReversed);
		System.out.println(cadenaMitadUno);
		System.out.println(cadenaMitadDos);
		return esPalindromo;
	}

	public static void main(String[] args) {
		if (verificaPalindromo("poop")) {
			System.out.println("VERDADERO");
		} else {
			System.out.println("FALSO");
		}
	}

}
