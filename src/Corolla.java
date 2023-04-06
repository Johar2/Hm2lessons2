public class Corolla extends Toyota implements Printable {
    private String fuelType;
    private boolean isHybrid;

    public Corolla(String model, int year, String fuelType, boolean isHybrid) {
        super(model, year);
        this.fuelType = fuelType;
        this.isHybrid = isHybrid;
    }

    public String getFuelType() {
        return fuelType;
    }

    public boolean isHybrid() {
        return isHybrid;
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
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Hybrid: " + isHybrid);
    }

    }

