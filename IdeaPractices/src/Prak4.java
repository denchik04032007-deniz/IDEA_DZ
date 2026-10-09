enum ComputerBrand {
    ASUS, HP, DELL, APPLE, LENOVO
}

public class Prak4 {
    public static void main(String[] args) {

        ComputerBrand myFavoriteBrand = ComputerBrand.ASUS;

        System.out.println("Мой любимый бренд компьютера: " + myFavoriteBrand);

        System.out.print("Комментарий системы: ");
        switch (myFavoriteBrand) {
            case APPLE:
                System.out.println("Отличный выбор для дизайнеров и разработчиков на iOS!");
                break;
            case ASUS:
                System.out.println("Надежные компьютеры, отличный выбор для учебы и гейминга.");
                break;
            case HP:
            case DELL:
            case LENOVO:
                System.out.println("Прекрасные рабочие станции для офиса и повседневных задач.");
                break;
            default:
                System.out.println("Интересный бренд!");
                break;
        }

        System.out.println("\nСписок всех марок в нашей системе:");
        for (ComputerBrand brand : ComputerBrand.values()) {
            System.out.println("- " + brand);
        }
    }
}