package unidad4;

public class Hora12 extends Hora {
	private boolean esMañana;
	private String tipoHora="";
	
	public Hora12(int hora, int minutos, String tipoHora) {
		super(hora, minutos);
		this.esMañana=true;
	}
	
	public void setEsMañana(int hora) {
		if (hora<=12) {
			esMañana=true;
		} else {
			esMañana=false;
		}
	}
	
	@Override
	public void setHora(int hora) {
		if (hora>=1 && hora<=12) {
			this.hora=hora;
		}
	}
	
	@Override
	public String toString() {
		return hora + ":" + minutos + " " + tipoHora;
	}
	
}
