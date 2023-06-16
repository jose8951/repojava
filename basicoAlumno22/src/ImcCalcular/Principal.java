package ImcCalcular;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<CalculoImc> array = new ArrayList<>();

		CalculoImc ca1 = new CalculoImc(95, 175);
		CalculoImc ca2 = new CalculoImc(40, 120);
		CalculoImc ca3 = new CalculoImc(120, 115);
		CalculoImc ca4 = new CalculoImc(50, 195);
		CalculoImc ca5 = new CalculoImc(67, 200);

		array.add(ca1);
		array.add(ca2);
		array.add(ca3);
		array.add(ca4);
		array.add(ca5);

		for (CalculoImc calculoImc : array) {
			System.out.println(calculoImc.toString());
		}
		
		
		System.out.println(array);

	}
	
	

}
