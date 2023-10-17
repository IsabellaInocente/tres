package Temaclass;

public class Sorvete extends Produto {
	double tempAdequ;

	public Sorvete(long id, String nome, double preco, double tempAdequ) {
		super(id, nome, preco);
		this.tempAdequ = tempAdequ;
	}

	public double getTempAdequ() {
		return tempAdequ;
	}

	public void setTempAdequ(double tempAdequ) {
		this.tempAdequ = tempAdequ;
	}
	
	

}
