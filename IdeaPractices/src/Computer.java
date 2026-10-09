public class Computer {
    private String brand; // Марка/Бренд
    private String model; // Модель
    private double price; // Цена

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Компьютер [Бренд=" + brand + ", Модель=" + model + ", Цена=" + price + " руб.]";
    }
}