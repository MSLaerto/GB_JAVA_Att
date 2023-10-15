public class Notebook {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private int os;
    private int color;

    public Notebook(String brand, String model, int ram, int storage, int os, int color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getOs() {
        return os;
    }

    public int getColor() {
        return color;
    }
}