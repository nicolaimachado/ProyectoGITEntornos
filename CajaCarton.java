package unidad4;

public class CajaCarton extends Caja {

	private int numID;
	
	public CajaCarton(int ancho, int alto, int fondo, int unidades, medida tipoMedida, int numID) {
		super(ancho, alto, fondo, unidades);
		this.numID=numID;
	}
	
	public void setNumID(int numID) {
		this.numID = numID;
	}
	
	public float getSuperficie(int ancho, int alto, int fondo, int unidades) {
		float res;
		int panelesLat=(this.ancho*this.alto)*2;
		int panelesFT=(this.fondo*this.alto)*2;
		int panelesAB=(this.ancho*this.fondo)*2;
		res= (panelesLat+panelesFT+panelesAB)*this.unidades;
		return res;
	}
	
	@Override
	public double getVolumen(int ancho, int alto, int fondo, medida tipoMedida) {
		return (super.getVolumen(ancho, alto, fondo, tipoMedida.cm)*80)/100;
	}
	
	
}
