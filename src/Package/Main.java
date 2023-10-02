package Package;

public class Main {
    public static void main(String[] args) {

        Fabric fabric = new Fabric();

        System.out.println(fabric.truck1);
        System.out.println(fabric.sport1);
        System.out.println(fabric.passenger1);

        // Можно устанавливать поля с типом Public и Default(Package private).
        // Поля с типом Private можно использовать только после создания геттеров и сеттеров.
    }
}
