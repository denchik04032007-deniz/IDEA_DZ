package praktika1;

public class WrapperTaskp3t1 {
    public static void main(String[] args) {
        //Создаем объекты класса Double, используя метод valueOf()
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.71");
        System.out.println("1. Объекты через valueOf():");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        //Преобразуем значение типа String к типу double через parseDouble()
        String text = "123.456";
        double parsed = Double.parseDouble(text);
        System.out.println("2. parseDouble(\"" + text + "\") = " + parsed);

        //Преобразуем объект класса Double ко всем примитивным числовым типам
        System.out.println("\n3. Преобразование объекта Double к примитивам:");
        Double obj = Double.valueOf(100.75);

        byte b = obj.byteValue();
        short s = obj.shortValue();
        int i = obj.intValue();
        long l = obj.longValue();
        float f = obj.floatValue();
        double d = obj.doubleValue();

        System.out.println("Исходный объект: " + obj);
        System.out.println("byte   = " + b);
        System.out.println("short  = " + s);
        System.out.println("int    = " + i);
        System.out.println("long   = " + l);
        System.out.println("float  = " + f);
        System.out.println("double = " + d);

        //Выводим значение объекта Double на консоль
        System.out.println("\n4. Значение объекта Double на консоль:");
        System.out.println("   " + obj);

        //Преобразуем литерал типа double к строке
        String str = Double.toString(3.14);
        System.out.println("\n5. Double.toString(3.14) = " + str);
    }
}
