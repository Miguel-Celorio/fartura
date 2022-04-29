import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FacturaTest {
    static Factura f = new Factura(100);

    @Test
    void testIvaReducido() {
        f.ivaReducido();
        assertEquals(f.getTotal(), 121);
    }

    @Test
    void testIvaTotal(){
        f.ivaTotal();
        assertEquals(f.getTotal(), 104);
    }

    @Test
    void testDescuentoEspecial(){
        f.descuentoEspecial();
        assertEquals(f.getTotal(), 90);
    }


}