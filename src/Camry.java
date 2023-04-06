public class Camry extends Toyota implements Printable{
    private String color;
    private int price;

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public Camry(String model, int year, String color, int price) {
        super(model, year);
        this.color = color;
        this.price = price;
    }


    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void printInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}
