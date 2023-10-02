package StudentPackage;

public class Student {

    private String firstName;
    private String lastName;
    private int groupNumber;

    public Student(String firstName, String lastName, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber > 0) {
            this.groupNumber = groupNumber;
        }else{
            throw (new RuntimeException("Номер группы должен быть положительным"));
        }
    }

    // Метод увеличивающий значение группы на 1

    public void nextGroup(){
        this.groupNumber++;
    }

    // Делаем клон

    public Student(Student original){
        this.firstName = original.firstName;
        this.lastName = original.lastName;
        this.groupNumber = original.groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
