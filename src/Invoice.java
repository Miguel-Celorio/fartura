/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class Invoice {
	double total;
	double subtotal;
	final double reducedIva = 0.21;
	final double standardIva = 0.04;
	final double vipDiscount = 0.1;
	
	public Invoice(double subtotal) {
		this.subtotal = subtotal;
	}
	
	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void reducedIva () {
		total = subtotal + (subtotal * reducedIva);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void totalIva () {
		total = subtotal + (subtotal * standardIva);
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void specialDiscount () {
		total = subtotal - (subtotal * vipDiscount);
	}

	public double getTotal() {
		return total;
	}

}
