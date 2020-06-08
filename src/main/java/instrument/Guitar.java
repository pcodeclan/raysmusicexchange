package instrument;

public class Guitar extends Instrument{

    private String stringType;

    public Guitar(String brand, String colour, String material, Type type, String stringType) {
        super(brand, colour, material, type);
        this.stringType = stringType;
    }

    public String getStringType() {
        return stringType;
    }

    public String play() {
        String sound;
        return sound = "Strum";
    }

    public double calculateMarkup() {
       return this.getSellingPrice() - this.getBuyingPrice();
    }
}
