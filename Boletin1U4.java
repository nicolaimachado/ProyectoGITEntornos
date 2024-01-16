package unidad4;

public class Boletin1U4 {

	public static void main(String[] args) {
		CuentaCorriente c1=new CuentaCorriente("Carlos", "1111111A");
		
		c1.sacarDinero(20);
		
		c1.ingresarDinero(180);
		//saldo es inaccesible porque esta en privado en su propia clase
		System.out.println("Tienes de saldo " + c1.getSaldo());
		
		c1.mostrarInfo();
		
		System.out.println(c1.toString());
		
		CuentaCorriente c2=new CuentaCorriente (1000);
		System.out.println(c2.toString());
		
		CuentaCorriente.setHoy("Lunes");
		System.out.println(CuentaCorriente.getHoy());
		
		CuentaCorriente.setNomBanco("Jijiji");
		System.out.println(CuentaCorriente.getNomBanco());
	}

}
