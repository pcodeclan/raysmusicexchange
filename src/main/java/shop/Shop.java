package shop;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<ISell>();
    }

    public void addProduct(ISell product){
        this.stock.add(product);
    }

    public void removeProduct(ISell product){
        this.stock.remove(product);
    }

    public int getProductCount(){
        return this.stock.size();
    }

    public double calculateTotalMarkup(){
        double totalMarkup = 0;
        for (ISell everyItem : this.stock){
            totalMarkup += everyItem.calculateMarkup();
        }
        return totalMarkup;
    }

}
