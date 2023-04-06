public class LC200 extends Toyota implements Printable{
    private int towingCapacity; //    \\тяговое усилие  private boolean hasThirdRowSeats;

    private boolean hasThirdRowSeats;

    public LC200(String model, int year, int towingCapacity, boolean hasThirdRowSeats) {
        super(model, year);
        this.towingCapacity = towingCapacity;
        this.hasThirdRowSeats = hasThirdRowSeats;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public boolean hasThirdRowSeats() {
        return hasThirdRowSeats;
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
        System.out.println("Towing capacity: " + towingCapacity);
        System.out.println("Third row seats: " + hasThirdRowSeats);
    }
}
