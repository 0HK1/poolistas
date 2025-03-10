package listacarnaval4;

abstract class Funcionario {
	protected double salarioBase, valorBonus;
	
	abstract void calcularBonus();
	
	abstract double calcularSalarioTotal();
}
