package homework;

public class Car {
    private String name;
    private String color;
    private int year_of_release;

    public Car() {
    }

    public Car(String name, String color, int year_of_release) {
        this.name = name;
        this.color = color;
        this.year_of_release = year_of_release;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear_of_release() {
        return year_of_release;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year_of_release=" + year_of_release +
                '}';
    }

    public void setYear_of_release(int year_of_release) {
        this.year_of_release = year_of_release;
    }
}
