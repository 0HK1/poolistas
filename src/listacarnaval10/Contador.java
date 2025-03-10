package listacarnaval10;

public class Contador  {
	private int count = 0;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void incrementar() {
		setCount(getCount()+1);
	}

	
}

class TarefaIncremento implements Runnable {
    private Contador contador;
    private int vezes;

    public TarefaIncremento(Contador contador, int vezes) {
        this.contador = contador;
        this.vezes = vezes;
    }

    @Override
    public void run() {
        for (int i = 0; i < vezes; i++) {
            contador.incrementar();
        }
    }
}