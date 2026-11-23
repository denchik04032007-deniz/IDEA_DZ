package praktika1;

interface MathCalculable {
    double PI = 3.14159265358979;

    //Возведение  степень
    double power(double base, int exponent);

    //Модуль комплексного числа
    double absComplex(double a, double b);
}

class MathFunc implements MathCalculable {

    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double absComplex(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}

public class MathCalculableTaskp7t4 {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("=== Тестирование MathFunc ===");
        System.out.println("2 в степени 10 = " + mc1.power(2, 10));
        System.out.println("Модуль числа (3 + 4i) = " + mc1.absComplex(3, 4));

        System.out.println("PI из интерфейса = " + MathCalculable.PI);

        MathFunc mf = new MathFunc();
        System.out.println("Длина окружности радиуса 5 = " + mf.circleLength(5));
    }
}
