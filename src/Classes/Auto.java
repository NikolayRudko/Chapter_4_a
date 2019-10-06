package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Class describing the auto.
 *
 * @author Nikolai Rudko
 * @version 1.1
 * @since 1.0
 *
 * @see Engine
 * @see Wheel
 */
public class Auto {
    private String producer;
    private String model;
    private Engine engine;
    private List<Wheel> wheels = new ArrayList<>();
    private double speed;
    private double tankVolume;
    private double fuelLevel;
    static final int COUNT_OF_WHEELS = 4;

    /**
     * Creation of a auto class instance.
     *
     * @param producer      The producer of the car.
     * @param model         The name of the car type model.
     * @param engine        The type of engine used in this car.
     * @param tankVolume    The tank volume of this car.
     * @param wheelProducer The producer name of wheels.
     * @see Wheel
     * @see Engine
     */
    public Auto(String producer, String model, Engine engine, double tankVolume, String wheelProducer) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        this.tankVolume = tankVolume;
        this.fuelLevel = this.tankVolume;
        this.speed = 0;

        for (int i = 0; i < COUNT_OF_WHEELS; i++) {
            this.wheels.add(new Wheel(i, wheelProducer));
        }
    }
/*
    public void move(double speed, double distance) {
        this.speed = speed;
        System.out.println("Speed car = " + this.speed);
    }

    public void stop() {
        speed = 0;
        System.out.println("Speed car = " + speed);
    }

    public void fuelCar(double fuelVolume) {
        if (fuelLevel == tankVolume) {
            System.out.println("Tank is full.");
        } else {
            if (fuelLevel + fuelVolume <= tankVolume) {
                fuelLevel += fuelVolume;
                System.out.println("Tank volume is " + fuelLevel);
            } else {
                System.out.printf("Tank is full. The tank's filled with %f\n.", fuelLevel + fuelVolume - tankVolume);
                fuelLevel = tankVolume;
            }
        }
    }


    public void replaceTheWheel(int w) {

    }*/

    @Override
    public String toString() {
        return "Classes.Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels producer=" + wheels.get(0).getProducer() +
                ", speed=" + speed +
                '}';
    }
}
