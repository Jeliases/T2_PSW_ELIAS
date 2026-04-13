package pe.edu.cibertec;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {

    @Test
    @DisplayName("Pregunta1: Rectangulo común")
    void testCrearRectanguloComun(){
        Rectangle r = new Rectangle(10.0, 10.0);
        assertEquals(50.0, r.area(), "El area deberia ser 50");
        assertFalse(r.isSquare());
    }

    @Test
    @DisplayName("Pregunta2: Cuadrado")
    void testCrearCuadrado(){
        Rectangle r = new Rectangle(7.0, 7.0);
        assertTrue(r.isSquare(), "Debe reconocerse como cuadrado");

    }

    @Test
    @DisplayName("Pregunta3: Valores cero o negativos")
    void testValoresNoValidos(){
        assertThrows(IllegalArgumentException.class, () -> {
           new Rectangle(0, 5.0);
        }, "valores a 0");
    }



}
