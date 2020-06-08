package shop;

import instrument.Guitar;
import instrument.Type;
import item.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop stock;
    Guitar guitar;
    GuitarStrings guitarString;

    @Before
    public void setUp() throws Exception {
        stock = new Shop();
        guitar = new Guitar("Yamaha", "Brown", "Wood", Type.Stringed, "Brass");
        guitarString = new GuitarStrings("Yamaha", "Steel");
    }

    @Test
    public void addProductTest() {
        stock.addProduct(guitar);
        assertEquals(1, stock.getProductCount());
    }

    @Test
    public void removeProductTest() {
        stock.addProduct(guitar);
        stock.addProduct(guitarString);
        stock.removeProduct(guitar);
        assertEquals(1, stock.getProductCount());
    }

    @Test
    public void calculateTotalMarkupTest(){
        stock.addProduct(guitar);
        guitar.setBuyingPrice(50);
        guitar.setSellingPrice(300);
        stock.addProduct(guitarString);
        guitarString.setBuyingPrice(2);
        guitarString.setSellingPrice(10);
        assertEquals(258.00, stock.calculateTotalMarkup(), 0.01);
    }
}