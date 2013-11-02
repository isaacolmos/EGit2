package spai.egit2;


public class Fraccion {
	private int numerador;

	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fraccion() {
		this(1, 1);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public double decimal() {
		return (double) numerador / denominador;
	}

	public double decimalDoble() {
		return (double) (numerador * 2.0 / denominador) ;
	}

	public double decimalTriple() {
		return (double) (numerador * 3.0 / denominador);
	}

	public double decimalCuadruple() {
		return (double) (numerador * 4.0 / denominador) ;
	}

}
