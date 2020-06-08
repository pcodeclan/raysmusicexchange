package item;

import shop.ISell;

public class GuitarStrings implements ISell {

    private String brand;
    private String material;
    private double buyingPrice;
    private double sellingPrice;

    public GuitarStrings(String brand,String material) {
        this.brand = brand;
        this.material = material;
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

    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
