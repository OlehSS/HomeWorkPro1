package StudentPackage;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student st1 = new Student("Karl", "Marks", 5);

        Student st1clone = new Student(st1);

        boolean areEqual = st1.equals(st1clone);

        System.out.println(areEqual);                           // Получаю false

        System.out.println(st1clone.getFirstName());

//      st1.setFirstName("Bob");                                // Имя у клона не изменилось

        System.out.println(st1clone.getFirstName());

        System.out.println(st1.getFirstName());


//      st1.nextGroup();                                        Перевод в следующую группу



    }
}
