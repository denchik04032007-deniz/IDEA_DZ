package praktika1;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " — цена: " + getPrice() + " руб.";
    }
}

class Service implements Priceable {
    private String name;
    private double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " — цена: " + getPrice() + " руб.";
    }
}

public class PriceableTaskp6t4 {
    public static void main(String[] args) {
        Priceable[] items = {
                new Product("Ноутбук", 55000.0),
                new Product("Телефон", 30000.0),
                new Service("Стрижка", 800.0)
        };
        System.out.println("Все товары и услуги с ценами:");
        for (Priceable item : items) {
            System.out.println(item);
        }
    }
}
