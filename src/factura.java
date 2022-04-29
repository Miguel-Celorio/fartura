package tarea2;

/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class factura {
	double total;
	double subtotal;
	
	public factura(double stota) {
		subtotal = stota;
	}
	
	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void ivaredu () {
		total = subtotal + (subtotal * 0.21d);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void iva () {
		total = subtotal + (subtotal * 0.04d);
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void descuentoesp () {
		total = subtotal - (subtotal * 0.10d);
	}

}
