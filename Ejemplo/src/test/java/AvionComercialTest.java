import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {
    AvionComercial method;
    @BeforeEach
    public void Setup() {
        method = new AvionComercial(30000,5);
    }
    @Test
    public void testVolarCombustibleIgualA25000() {
        Assertions.assertEquals(method.volar(5000),25000);
    }
    @Test
    public void testGetConsumoCombustibleIgualA30000(){
        Assertions.assertEquals(method.getConsumoCombustible(),5);
    }
}
