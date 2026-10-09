public class FurnitureDemo {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair1 = new Chair("Премиум", 4500.0, "Дуб");
        Chair chair2 = new Chair("Офисный", 2900.0, "Пластик/Металл");
        Table table1 = new Table("Обеденный семейный", 12000.50, "Круглый");

        shop.addFurniture(chair1);
        shop.addFurniture(chair2);
        shop.addFurniture(table1);

        shop.showCatalog();
    }
}