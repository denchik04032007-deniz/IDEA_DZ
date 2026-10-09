import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер успешно добавлен в магазин.");
    }

    public boolean removeComputer(String brand, String model) {
        for (int i = 0; i < computers.size(); i++) {
            Computer c = computers.get(i);
            if (c.getBrand().equalsIgnoreCase(brand) && c.getModel().equalsIgnoreCase(model)) {
                computers.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Computer> findComputerByBrand(String brand) {
        ArrayList<String> found = new ArrayList<>();
        ArrayList<Computer> foundComputers = new ArrayList<>();
        for (Computer c : computers) {
            if (c.getBrand().equalsIgnoreCase(brand)) {
                foundComputers.add(c);
            }
        }
        return foundComputers;
    }

    public void printAllComputers() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
            return;
        }
        System.out.println("\n--- Ассортимент магазина ---");
        for (Computer c : computers) {
            System.out.println(c);
        }
    }
}
