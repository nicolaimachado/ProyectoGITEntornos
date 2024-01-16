package unidad4;

public class Hora12 extends Hora {
	private boolean esMa�ana;
	private String tipoHora="";
	
	public Hora12(int hora, int minutos, String tipoHora) {
		super(hora, minutos);
		this.esMa�ana=true;
	}
	
	public void setEsMa�ana(int hora) {
		if (hora<=12) {
			esMa�ana=true;
		} else {
			esMa�ana=false;
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
