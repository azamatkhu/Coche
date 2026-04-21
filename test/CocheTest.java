import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CocheTest {

    @Test
    void testCrearCoche() {
        Coche miCoche = new Coche("Tesla", "Model 3", 2023);
        assertEquals(2023, miCoche.getAnio());
    }

    @Test
    void testAnioIncorrecto() {
        Coche cocheAntiguo = new Coche("Coche", "Antiguo", 1700);

        assertEquals(1886, cocheAntiguo.getAnio());
    }

    @Test
    void testModificarVariables() {
        Coche coche = new Coche("BMW", "X5", 2010);
        coche.setMarca("Audi");
        coche.setAnio(2020);

        assertEquals("Audi", coche.getMarca());
        assertEquals(2020, coche.getAnio());
    }
}
