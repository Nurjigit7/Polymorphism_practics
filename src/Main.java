import homework.BusinessСar;
import homework.Car;
import homework.DriveCar;
import homework.SportCar;
import homework1.Automobile;
import homework1.Bicycle;
import homework1.Transport;

public class Main {
    public static void main(String[] args) {
//        SportCar sportCar = new SportCar("bmw", "black", 2010);
//        DriveCar driveCar = new DriveCar("jazz", "gleen", 2015);
//        BusinessСar businessСar = new BusinessСar("lexcus", "red", 2020);
//        Car[] cars = {sportCar, driveCar, businessСar};
//        for (Car car : cars) {
//            if (car instanceof SportCar) {
//                ((SportCar) car).drivesacar();
//            }
//            if (car instanceof DriveCar) {
//                ((DriveCar) car).carmoregames();
//            }
//            if (car instanceof BusinessСar) {
//                ((BusinessСar) car).businesscars();
//            }
//            System.out.println(car);
//        }
////        SportCar[]sportCars=new SportCar[5];
////        for (int i = 0; i < sportCars.length; i++) {
////            if (cars[i]instanceof SportCar){
////                sportCars[i]= (SportCar) cars[i];
////                System.out.println(sportCars[i]);
////            }
////            DriveCar[]driveCars=new DriveCar[5];
////            for (int i1 = 0; i1 < driveCars.length; i1++) {
////                if (cars[i]instanceof DriveCar){
////                    driveCars[i1]= (DriveCar) cars[i1];
////                    System.out.println(driveCars[i1]);
////                }
////             BusinessСar[]businessСars=new BusinessСar[5];
////                for (int i2 = 0; i2 < businessСars.length; i2++) {
////                    if (cars[i]instanceof BusinessСar){
////                        businessСars[i2]= (BusinessСar) cars[i2];
////                        System.out.println(businessСars[i2]);
//                    }
//
//                }
//
//
//            }
// }
        Transport BMW = new Automobile("BMW");
        BMW.speedUp();
        Transport Bicycle=new Bicycle("Bicycle");
        Bicycle.speedUp();

   }

}