/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class Factura {
	double total;
	double subtotal;
	
	public Factura(double subtotal) {
		this.subtotal = subtotal;
	}
	
	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void ivaReducido () {
		total = subtotal + (subtotal * 0.21d);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void ivaTotal () {
		total = subtotal + (subtotal * 0.04d);
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void descuentoEspecial () {
		total = subtotal - (subtotal * 0.10d);
	}

	public double getTotal() {
		return total;
	}

	public double getSubtotal() {
		return subtotal;
	}
}
