package Heranca;

public class Todos {
	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo ("nissan", "gtr-r35",2012,"preto");
		System.out.println("Veiculo:");
		System.out.println("marca"+ veiculo.getMarca());
		System.out.println("modelo" + veiculo.getModelo());
		System.out.println("cor" + veiculo.getCor());
		System.out.println("sno" + veiculo.getAno());
		
		Automovel automovel = new Automovel (2, "VR38DETT, V6 biturbo de 3,8 litros");
		System.out.println("automovel");
		System.out.println("numportas" + automovel.getClass());
		System.out.println("motor"+ automovel.getMotor());
		
		Moto moto = new Moto (4);
		System.out.println("Moto");
		System.out.println("cilindrada" + moto.getCilindrada());
	}

}
