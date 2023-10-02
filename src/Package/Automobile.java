package Package;

public class Automobile {

    public AutomobileType type;

    public Automobile(AutomobileType type, int power, String mark, String model) {
        this.type = type;
        this.power = power;
        this.mark = mark;
        this.model = model;
    }

    int power;
    private String mark;

    private String model;

//    {
//        type = AutomobileType.sportCar;
//        power = 200;
//        mark = "BMW";
//        model = "X6";
//    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "type=" + type +
                ", power=" + power +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}


