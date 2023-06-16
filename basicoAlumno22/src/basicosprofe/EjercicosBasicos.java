package basicosprofe;

import java.sql.*;

import java.text.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * LISTA DE EJERCICIOS DE REPASO A LA PARTE DE INICIACIÓN EN JAVA:
 * 
 * 1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER
 * PERTENECE A LA CADENA O NO perteneceACadena 2) HACER UN MÉTODO QUE RECIBA UNA
 * CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
 * 2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
 * 
 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
 * 
 * 
 * 3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar 4) HACER UN
 * MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE EDAD O NO
 * mayorDeEdad 5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA SI
 * EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota - 6)
 * HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS invertirCadena 7)
 * * HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99
 * deTresEnTres
 *
 ***
 * TODO HACED UNA APLICACIÓN QUE PERMITA INTRODUCIR AL USUARIO SU ESTATURA EN
 * METROS Y SU PESO EN KG Y LE INFORME SU INFORME DE SU ÍNDICE DE MASA CORPORAL
 * (IMC) SEGÚN LA SIGUIENTE FÓRMULA
 * 
 * LA FÓRMULA DEL IMC = PESO KG / ESTATURA AL CUADRADO METROS * SI IMC < 16 ->>
 * su imc es DESNUTRIDO SI IMC >= 16 Y < 18 ->> su imc es DELGADO SI IMC >= 18 Y
 * < 25 ->> su imc es IDEAL SI IMC >= 25 Y < 31 ->> su imc es SOBREPESO SI IMC
 * >= 31 ->> su imc es , DE DEOBESO ADEMÁSCIRLE SU IMC NUMÉRICO Y NOMINAL,
 * pista: PARA LEER DE TECLADO USAD LA CLASE SCANNER
 *
 *
 * // DEFINO UN MÉTODO // DARLE UN NOMBRE - camelCase // ID la entrada - // ID
 * la salida -
 *
 * //pensar el los pasos en esapñol en psuedocódigo
 */
public class EjercicosBasicos {

	public static void main(String[] args) {

		String valor = "hola";
		char caracter = 'a';
//		if (cadena(valor, caracter)) {
//			System.out.println("Tiene caracter");
//		} else {
//			System.out.println("Tiene no caracter");
//		}

		// ejercicio 2
		// repetido(valor, caracter);

		// ejercio 2.1
		// posicionCaracter(valor, caracter);

		// ejercicio 3
		// parImpar(11);

		// ejercicio 4
		// pedirEdad();

		// ejercicio 5
		// mostrarResultadoNota(6);

		// ejercicio 6
		//invertirCadena(valor);
		
		// ejercicio 7
		// muestaSecuencia();

		// ejercicio 8
		// calcularImc();

		// pruebacontant();

		// swingModerno(8);
		
		calcularImc();
		

	}// main


	private static void swingModerno(int nota) {
		String notaAlfabetica = null;
		notaAlfabetica = switch (nota) {
		case 0, 1, 2, 3, 4 -> "Suspenso";
		case 5 -> "Aprobado";
		case 6 -> "Bine";
		case 7, 8 -> "Notable";
		case 9, 10 -> "Sobresaliente";
		default -> "Error";
		};
		System.out.println("Tu nota es: " + notaAlfabetica);

	}

	

	private static void calcularImc() {
//		System.out.println("peso 40 -altura 1,70 DESNUTRIDO");
//		System.out.println("peso 50 -altura 1,70 DELGADO");
//		System.out.println("peso 70 -altura 1,70 IDEAL");
//		System.out.println("peso 80 -altura 1,70 SOBREPESO");
//		System.out.println("peso 99 -altura 1,70 DE DEOBESO");

		Scanner sc = new Scanner(System.in);
		System.out.print("Dame tu peso en Kg ");
		
		double peso = sc.nextDouble();
		System.out.print("datem tu altura metros: ");
		double altura = sc.nextDouble();
		//50, 195
		
		
		// LA FÓRMULA DEL IMC = PESO KG / ESTATURA AL CUADRADO METROS
		double imc = peso / Math.pow(altura, 2);
	

		if (imc < 16) {// SI IMC < 16 ->> su imc es DESNUTRIDO
			System.out.printf("su imc %.2f es DESNUTRIDO ", imc);
		} else if (imc >= 16 && imc < 18) {// SI IMC >= 16 Y < 18 ->> su imc es DELGADO
			System.out.printf("su imc %.2f es DELGADO ", imc);
		} else if (imc >= 18 && imc < 25) {// SI IMC >= 18 Y < 25 ->> su imc es IDEAL
			System.out.printf("su imc %.2f es IDEAL ", imc);
		} else if (imc >= 25 && imc < 31) {// SI IMC >= 25 Y < 31 ->> su imc es SOBREPESO
			System.out.printf("su imc %.2f es SOBREPESO ", imc);
		} else if (imc >= 31) {// SI IMC >= 31 ->> su imc es , DE DEOBESO
			System.out.printf("su imc %.2f es DE DEOBESO ", imc);
		}
	}

	// LA SECUENCIA 3, 6, 9, 12, 15 ...99 deTresEnTres
	private static void muestaSecuencia() {
		int numero = 0;
		while (numero < 99) {
			numero = numero + 3;
			if (numero < 99) {
				System.out.print(numero + ", ");
			} else {
				System.out.print(numero + ".");
			}
		}
	}

	private static void invertirCadena(String valor) {
		char[] aCaracteres = valor.toCharArray();
		int a = aCaracteres.length;
		for (int i = a; i > 0; i--) {
			System.out.print(aCaracteres[i - 1]);
		}

		String cadReves = new StringBuilder(valor).reverse().toString();
		System.out.println("\n" + cadReves);

	}

	private static void mostrarResultadoNota(int i) {
		if (i < 5) {
			System.out.println("Suspenso");
		} else if (i == 5) {
			System.out.println("suficiente");
		} else if (i == 6) {
			System.out.println("bien");
		} else if (i == 7) {
			System.out.println("notable");

		} else if (i >= 8 && i <= 10) {
			System.out.println("Sobresaliente");
		}

	}

	private static void pedirEdad() {
		System.out.println("introduce tu edad: ");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		if (edad >= 18) {
			System.out.println("Si es mayor de edad con una edad de: " + edad);
		} else {
			System.out.println("No eres  mayor de edad con una edad de: " + edad);
		}

		// DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");
		// jue, 1 ene 1970, 01:00:00 CET
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(new Date(edad));
		System.out.println(date);
	}

	private static void parImpar(int i) {

		if (i % 2 == 0) {
			System.out.printf("es numero %d es par ", i);
		} else {
			System.out.printf("Es numero %d NO es par ", i);
		}
	}

	// "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
	private static void posicionCaracter(String valor, char caracter) {
		boolean in = false;
		int cont = 0;
		int numero = valor.length() - 1;
		try {
			while (valor.charAt(cont) != caracter && !in) {
				cont++;
				if (valor.charAt(cont) == caracter) {
					in = true;
				}
			}
			System.out.println(valor + " " + caracter + " --> " + cont);
		} catch (java.lang.StringIndexOutOfBoundsException e) {
			System.out.println("este caracter no esta dentro de la palabra  -1");
		}
	}

	// ejercicio 2
	private static void repetido(String valor, char caracter) {
		char[] aCaracteres = valor.toCharArray();
		int contador = 0;
		for (int i = 0; i < aCaracteres.length; i++) {
			if (aCaracteres[i] == caracter) {
				contador++;
			}
		}
		System.out.println("numero de veces que se repite el caracter " + caracter + "  numero de veces  " + contador);
	}

	// ejercicio 1
	private static boolean cadena(String valor, char caracter) {
		char[] aCaracteres = valor.toCharArray();
		boolean resulado = false;
		for (int i = 0; i < aCaracteres.length && !resulado; i++) {
			if (aCaracteres[i] == caracter) {
				resulado = true;
			} else {
				resulado = false;
			}
		}
		return resulado;
	}

}
