import Classes.Auto;
import Classes.Engine;
import Classes.EngineType;

public class Main {
    public static void main(String[] args) {
        //Creation of different types of motors.
        Engine engine_1_4_TSI = new Engine(EngineType.PETROL, 125, 1.4);
        Engine engine_1_9_DTI = new Engine(EngineType.DIESEL, 110, 1.9);
        Engine engineTSIHybrid = new Engine(EngineType.HYBRID, 333, 3);

        //Creation of different types of autos.
        Auto VWTouaregHybrid = new Auto("Volkswagen", "Touareg Hybrid", engineTSIHybrid, 90,"Michelin");
        Auto VWPolo = new Auto("Volkswagen", "Polo", engine_1_4_TSI,65, "Michelin");
        Auto VWGolf = new Auto("Volkswagen", "Golf", engine_1_9_DTI,70, "Michelin");
    }
}
