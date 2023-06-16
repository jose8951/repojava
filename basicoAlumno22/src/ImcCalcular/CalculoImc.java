package ImcCalcular;

public class CalculoImc {

	private float peso;
	private float altura;
	private float imc;

	
	/**
	 * Calcular imc
	 * @param peso
	 * @param altura
	 */
	public CalculoImc(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura/100;
		calcularDatos();
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void calcularDatos() {
		 imc = (float) (this.peso/ Math.pow(this.altura, 2));
	}

	@Override
	public String toString() {
		return "CalculoImc [peso=" + peso + ", altura=" + altura + ", imc=" + imc + "]";
	}
	
	

}
