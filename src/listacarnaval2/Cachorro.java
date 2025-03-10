package listacarnaval2;

public class Cachorro extends Animal{
	public Cachorro(String Nome) {
		this.Nome = Nome;
	}
	public void Latir() {
		System.out.println(Nome + " Está Latindo");
	}
}
