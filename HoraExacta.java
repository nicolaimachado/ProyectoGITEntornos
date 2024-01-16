package unidad4;

import java.util.Objects;

public class HoraExacta extends Hora {

	private int segundos;
	private boolean esIgual;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}

	private void setSegundos(int segundos) {
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}

	private void inc(int hora, int minutos, int segundos) {
		this.segundos = segundos++;
		if (segundos == 60) {
			this.segundos = 0;
			this.minutos++;
			if (minutos == 60) {
				this.minutos = 0;
				this.hora++;
				if (hora == 24) {
					this.hora = 0;
				}
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(esIgual, segundos);
	}

	@Override
	public boolean equals(Object otraHora) {
		HoraExacta otra = (HoraExacta) otraHora;
		boolean iguales;
		if (this.hora==(otra.hora) && this.minutos==(otra.minutos) && this.segundos==(otra.segundos)) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;
	}

	@Override
	public String toString() {
		return hora + ":" + minutos + ":" + segundos;
	}

}
