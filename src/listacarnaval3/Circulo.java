package listacarnaval3;

public class Circulo extends Forma {
	protected double raio, area;
	public Circulo(double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	double calcularArea() {
		return (Math.PI * raio * raio);
	}
	
	
}
