import java.util.ArrayList;

abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}

class Chair extends Furniture {
    private String material;

    public Chair(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.printf("🪑 Стул: %s | Материал: %s | Цена: %.2f руб.%n",
                getName(), material, getPrice());
    }
}

class Table extends Furniture {
    private String shape;

    public Table(String name, double price, String shape) {
        super(name, price);
        this.shape = shape;
    }

    @Override
    public void displayInfo() {
        System.out.printf("🪵 Стол: %s | Форма: %s | Цена: %.2f руб.%n",
                getName(), shape, getPrice());
    }
}

class FurnitureShop {
    private ArrayList<Furniture> showcase = new ArrayList<>();

    public void addFurniture(Furniture f) {
        showcase.add(f);
    }

    public void showCatalog() {
        System.out.println("=== КАТАЛОГ МЕБЕЛЬНОГО МАГАЗИНА ===");
        if (showcase.isEmpty()) {
            System.out.println("Магазин пуст.");
            return;
        }
        for (Furniture f : showcase) {
            f.displayInfo();
        }
    }
}