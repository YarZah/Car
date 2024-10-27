package Car;

import java.time.LocalDate;

public class Car {

    private double fuel;
    private double consumption;
    private CarModel carModel;
    private LocalDate nextInspectDate;

    public Car() {
    }

    public Car(double fuel, double consumption, CarModel carModel, LocalDate nextInspectDate) {
        this.nextInspectDate = nextInspectDate;
        this.fuel = fuel;
        this.consumption = consumption;
        this.carModel = carModel;
    }


    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }


    public CarModel getCarModel() {
        return carModel;
    }

    public double getFuel() {
        return this.fuel;
    }

    public double getConsumption() {
        return this.consumption;
    }

   public boolean isAllowed() {
       LocalDate today = LocalDate.now();
       return !today.isAfter(nextInspectDate);
   }
    @Override
    public String toString() {
        return "Car =" +
                " " + "CarModel = " + carModel +
                ", Заповненість бака=" + fuel +
                ", Витрата палива на 100 км=" + consumption + "л";
    }
    public void drive() {
        if (fuel > 0) {
            System.out.println("Машина їде вперед");
        }
    }

}
