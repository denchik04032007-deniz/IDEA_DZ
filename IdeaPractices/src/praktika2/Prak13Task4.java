package praktika2;

public class Prak13Task4 {
    public static void main(String[] args) {
        String[] shirtsData = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Prak13Shirt[] shirts = new Prak13Shirt[shirtsData.length];

        for (int i = 0; i < shirtsData.length; i++) {
            String[] parts = shirtsData[i].split(",");
            shirts[i] = new Prak13Shirt(parts[0], parts[1], parts[2], parts[3]);
        }

        for (Prak13Shirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
}

class Prak13Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Prak13Shirt(String code, String name, String color, String size) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Код: " + code + "\n" +
                "Название: " + name + "\n" +
                "Цвет: " + color + "\n" +
                "Размер: " + size + "\n" +
                "-------------------";
    }
}
