package listacarnaval4;

public class Gerente extends Funcionario {
	
	public Gerente(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	@Override
	public void calcularBonus() {
		valorBonus = (20.0 / 100) * salarioBase;
	}

	@Override
	public double calcularSalarioTotal() {
		calcularBonus();
		return salarioBase + valorBonus;
		
	}
	
}
