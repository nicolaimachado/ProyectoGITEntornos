package unidad4;

public class Cliente extends Persona {
	private String direccion;
	private float dineroGastado;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public float getDineroGastado() {
		return dineroGastado;
	}
	public void setDineroGastado(float dineroGastado) {
		this.dineroGastado = dineroGastado;
	}
	
	public String toString() {
		return super.toString()+", direccion "+direccion+", dineroGastado="+dineroGastado+"]";
	}
	
}
