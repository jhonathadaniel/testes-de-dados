import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testTrianguloValidoEquilatero() {
        assertTrue(triangulo.ehTriangulo(5, 5, 5));
        assertEquals("Equilátero", triangulo.tipoTriangulo(5, 5, 5));
    }

    @Test
    public void testTrianguloValidoIsosceles() {
        assertTrue(triangulo.ehTriangulo(5, 5, 8));
        assertEquals("Isósceles", triangulo.tipoTriangulo(5, 5, 8));
    }

    @Test
    public void testTrianguloValidoEscaleno() {
        assertTrue(triangulo.ehTriangulo(3, 4, 5));
        assertEquals("Escaleno", triangulo.tipoTriangulo(3, 4, 5));
    }

    @Test
    public void testTrianguloInvalido() {
        assertFalse(triangulo.ehTriangulo(0, 5, 5));
        assertFalse(triangulo.ehTriangulo(5, 0, 5));
        assertFalse(triangulo.ehTriangulo(5, 5, 0));
        assertEquals("Não é Triângulo", triangulo.tipoTriangulo(0, 5, 5));
        assertEquals("Não é Triângulo", triangulo.tipoTriangulo(5, 0, 5));
        assertEquals("Não é Triângulo", triangulo.tipoTriangulo(5, 5, 0));
    }
}
