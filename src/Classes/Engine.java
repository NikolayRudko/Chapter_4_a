package Classes;

/**
 * Class describing the Classes.Engine.
 *
 * @author Nikolai Rudko
 * @version 1.1
 * @see EngineType
 * @since 1.0
 */
public class Engine {
    private EngineType type;
    private double power;
    private double volume;

    /**
     * Creation of a Classes.Engine class instance.
     *
     * @param type   The type of the engine.
     * @param power  The power of the engine.
     * @param volume The volume of the engine.
     * @see EngineType
     */
    public Engine(EngineType type, double power, double volume) {
        this.type = type;
        this.power = power;
        this.volume = volume;
    }

    public EngineType getType() {
        return type;
    }

    public double getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Classes.Engine{" +
                "type=" + type +
                ", power=" + power +
                ", volume=" + volume +
                '}';
    }
}
