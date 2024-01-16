package unidad4;

abstract class Instrumento {
	protected int index = 0;
	protected enum Nota{DO, RE, MI, FA, SOL, LA, SI};
	protected Nota nota;
	protected Nota arrayNotas[] = new Nota[100];
	
	public Instrumento(int index, Nota[] arrayNotas, Nota nota) {
		this.index=index;
		this.arrayNotas=arrayNotas;
		this.nota=nota;
	}
	
	public void add(Nota[] arrayNotas, Nota nota, int index) {
		if (this.index < 100) {
			this.nota=nota;
			this.arrayNotas[this.index] = this.nota;
			this.index++;
		}
	}
	
	public abstract void interpretar(Nota nota);
	
}