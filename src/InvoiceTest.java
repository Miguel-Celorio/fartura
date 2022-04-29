import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {
    static Invoice f = new Invoice(100);

    @Test
    void testIvaReducido() {
        f.reducedIva();
        assertEquals(f.getTotal(), 121);
    }

    @Test
    void testIvaTotal(){
        f.totalIva();
        assertEquals(f.getTotal(), 104);
    }

    @Test
    void testDescuentoEspecial(){
        f.specialDiscount();
        assertEquals(f.getTotal(), 90);
    }


}