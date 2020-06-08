package instrument;

import shop.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String brand;
    private String colour;
    private String material;
    private Type type;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String brand, String colour, String material, Type type) {
        this.brand = brand;
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public Type getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
