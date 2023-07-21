package homework;

public class SportCar extends Car{
    public SportCar() {
    }

    public SportCar(String name, String color, int year_of_release) {
        super(name, color, year_of_release);
    }
    public void drivesacar(){
        System.out.println("sport is car");
    }

}
