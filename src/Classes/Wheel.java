package Classes;

/**
 * Class describing the Classes.Wheel.
 *
 * @author Nikolai Rudko
 * @version 1.1
 * @see WheelNumber
 * @since 1.0
 */
public class Wheel {
    private int number;
    private String producer;

    /**
     * Creation of a wheel class instance.
     *
     * @param number   The number of the wheel.
     * @param producer The producer name of the wheel.
     */
    public Wheel(int number, String producer) {
        this.number = number;
        this.producer = producer;
    }

    /**
     * Returns the producer name of wheel.
     */
    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Classes.Wheel{" +
                "number=" + number +
                ", company='" + producer + '\'' +
                '}';
    }
}
