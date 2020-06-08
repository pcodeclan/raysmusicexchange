package instrument;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Yamaha", "Brown", "Wood", Type.Stringed, "Brass");
    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha", guitar.getBrand());
    }

    @Test
    public void getColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals(Type.Stringed, guitar.getType());
    }

    @Test
    public void getStringType() {
        assertEquals("Brass", guitar.getStringType());
    }

    @Test
    public void play() {
        assertEquals("Strum", guitar.play());
    }

    @Test
    public void setBuyingPrice() {
        guitar.setBuyingPrice(50);
        assertEquals(50, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void setSellingPrice() {
        guitar.setSellingPrice(300);
        assertEquals(300, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void testCalculateMarkup() {
        guitar.setBuyingPrice(50);
        guitar.setSellingPrice(300);
        assertEquals(250, guitar.calculateMarkup(),0.01);
    }
}