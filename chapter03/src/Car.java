public class Car {
    private String band;
    private double price;
    private String color;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=500000||price<=200000){
            System.out.println("价格设置不合理");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
