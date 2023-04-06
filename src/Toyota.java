public abstract class Toyota {
    private String model;
    private int year;

    public Toyota(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void drive();

    public abstract void stop();
}

