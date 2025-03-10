package listacarnaval4;

public class Vendedor extends Funcionario {
	
	public Vendedor(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public void calcularBonus() {
		valorBonus = (10.0 / 100) * salarioBase;
	}

	@Override
	public double calcularSalarioTotal() {
		calcularBonus();
		return salarioBase + valorBonus;
		
	}
	
	
}
