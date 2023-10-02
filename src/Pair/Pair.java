package Pair;

public class Pair {
    private String first;
    private String second;

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public Pair(){
        this.first = "one";
        this.second = "two";
        System.out.println(first);
        System.out.println(second);
    }

    public Pair(String first, String second){
        this.first = first;
        this.second = second;
        System.out.println(first);
        System.out.println(second);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
