package Heranca;

public class Automovel {
	int numerosportas;
	String motor;
	public int getNumerosportas() {
		return numerosportas;
	}
	public void setNumerosportas(int numerosportas) {
		this.numerosportas = numerosportas;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public Automovel(int numerosportas, String motor) {
		super();
		this.numerosportas = numerosportas;
		this.motor = motor;
	}

}
