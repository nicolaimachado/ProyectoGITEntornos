package unidad4;

public class CuentaCorriente {
	// atributo
	private float saldo;
	private int limDesc;
	public String nom;
	String dni;
	private static String hoy;
	private static String nomBanco;
	
	// constructor
	public CuentaCorriente(String nom, String dni) {
		limDesc = -50;
		saldo = 0;

		this.nom = nom;
		this.dni = dni;
	}
	
	public CuentaCorriente(float saldo) {
		this.saldo=saldo;
		this.limDesc=0;
	}
	
	public CuentaCorriente(String dni, int limDesc, float saldo) {
		this.dni=dni;
		this.limDesc=limDesc;
		this.saldo=saldo;
	}
	
	public static String getNomBanco() {
		return nomBanco;
	}

	public static void setNomBanco(String nomBanco) {
		CuentaCorriente.nomBanco = nomBanco;
	}

	public static String getHoy() {
		return hoy;
	}

	public static void setHoy(String hoy) {
		CuentaCorriente.hoy = hoy;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getLimDesc() {
		return limDesc;
	}

	public void setLimDesc(int limDesc) {
		this.limDesc = limDesc;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean sacarDinero(float dineroASacar) {
		boolean puedeSacar = false;
		if (this.saldo - dineroASacar >= this.limDesc) {
			puedeSacar = true;
			this.saldo -= dineroASacar;
		}
		return puedeSacar;
	}
	
	public void ingresarDinero(float ingreso) {
		this.saldo+=ingreso;
	}
	
	public void mostrarInfo() {
		System.out.println(this.saldo + ", " + this.limDesc + ", " + this.nom + ", " + this.dni);
	}
	
	public String toString() {
		return (this.saldo + ", " + this.limDesc + ", " + this.nom + ", " + this.dni);
	}

}
