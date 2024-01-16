package unidad4;

public class Caja {
	protected int ancho;
	protected int alto;
	protected int fondo;
	protected int unidades;
	protected enum medida{cm, m};
	medida tipoMedida;
	
	public Caja (int ancho, int alto, int fondo, int unidades) {
		this.ancho=ancho;
		this.alto=alto;
		this.fondo=fondo;
		this.unidades=unidades;
		this.tipoMedida=tipoMedida;
	}
	
	public double getVolumen(int ancho, int alto, int fondo, medida tipoMedida) {
		double res;
		if (this.tipoMedida.equals(tipoMedida.cm)) {
			this.ancho=this.ancho/100;
			this.alto=this.alto/100;
			this.fondo=this.fondo/100;
		}
		res=(this.ancho*this.alto*this.fondo);
		return res;
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", tipoMedida=" + tipoMedida + ", unidades=" + unidades +  "]";
	}
}
