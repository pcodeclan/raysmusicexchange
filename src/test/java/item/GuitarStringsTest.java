package item;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("Yamaha", "Steel");
    }

    @Test
    public void testSetBuyingPrice() {
        guitarStrings.setBuyingPrice(2);
        assertEquals(2,guitarStrings.getBuyingPrice(),0.01);
    }

    @Test
    public void testSetSellingPrice() {
        guitarStrings.setSellingPrice(10);
        assertEquals(10,guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void testCalculateMarkup() {
        guitarStrings.setBuyingPrice(2);
        guitarStrings.setSellingPrice(10);
        assertEquals(8, guitarStrings.calculateMarkup(),0.01);
    }
}