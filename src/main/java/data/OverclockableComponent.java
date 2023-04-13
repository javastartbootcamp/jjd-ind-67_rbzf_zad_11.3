package data;

public abstract class OverclockableComponent extends Component {
    private int clockSpeed;
    private int temperature;
    private final int tempMax;

    public OverclockableComponent(String model, String producer, String serialNo, int clockSpeed, int temperature, int tempMax) throws OverheatException {
        super(model, producer, serialNo);
        this.clockSpeed = clockSpeed;
        this.temperature = temperature;
        this.tempMax = tempMax;
        temperatureCheck(temperature);
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void overClock(int additionalClockSpeed) throws OverheatException {
        System.out.println("proba zwiekszenia taktowania o " + additionalClockSpeed + " MHz");
        int tempToCheck = temperature + getTempFactor() * (additionalClockSpeed / 100);
        if (temperatureCheck(tempToCheck)) {
            temperature = tempToCheck;
            clockSpeed += additionalClockSpeed;
        }
    }

    abstract int getTempFactor();

    public boolean temperatureCheck(int temperature) throws OverheatException {
        if (temperature >= tempMax) {
            throw new OverheatException("Uwaga: zbyt duza temperatura - moze doprowadzic do przegrzania komponentu.");
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", taktowanie: " + clockSpeed + " MHz, temperatura: "
                + temperature + ", maksymalna temperatura: " + tempMax;

    }
}
