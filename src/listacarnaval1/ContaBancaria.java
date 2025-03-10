package listacarnaval1;

public class ContaBancaria {
	private double saldo;
	
	public ContaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valorSacado) {
		if(getSaldo()>=valorSacado) {
			setSaldo(getSaldo() - valorSacado);
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean depositar(double valorDepositado) {
		setSaldo(getSaldo() + valorDepositado);
		return true;
	}
	
	
	
}
