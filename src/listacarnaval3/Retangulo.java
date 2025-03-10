package listacarnaval3;

public class Retangulo extends Forma {
	private double largura, altura, area;
	
	public Retangulo(double largura, double altura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	double calcularArea() {
		return(getLargura() * getAltura());
		
	}

	
	
}
