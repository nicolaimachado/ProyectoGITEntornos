package unidad4;

public class Hora {
	protected int hora;
	protected int minutos;
	
	public Hora (int hora, int minutos) {
		setHora(hora);
		setMinutos(minutos);
	}
	
	public void inc (int hora, int minutos) {
		this.minutos++;
		if (this.minutos==60) {
			this.minutos=0;
			this.hora++;
			if (hora==24) {
				this.hora=0;
			}
		}
	}

	public void setHora(int hora) {
		if (hora>=0 && hora<=23) {
			this.hora=hora;
		}
	}

	public void setMinutos(int minutos) {
		if (minutos>=0 && minutos<=59) {
			this.minutos=minutos;
		}
	}
	

	@Override
	public String toString() {
		return hora + ":" + minutos;
	}
	
	
	
}
