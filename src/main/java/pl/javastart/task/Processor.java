package pl.javastart.task;

class Processor extends Component implements Overclockable {
    private int clockSpeed;
    private int temperature;
    private static final int MAX_TEMP = 80;
    private static final int TEMP_FACTOR = 10;

    public Processor(String model, String producer, String serialNo, int clockSpeed, int temperature) throws OverheatException {
        super(model, producer, serialNo);
        this.clockSpeed = clockSpeed;
        temperatureCheck();
        this.temperature = temperature;
    }

    @Override
    public void overClock(int additionalClockSpeed) throws OverheatException {
        System.out.println("proba zwiekszenia taktowania procesora o " + additionalClockSpeed + " MHz");
        temperature += TEMP_FACTOR * (additionalClockSpeed / 100);
        temperatureCheck();
        clockSpeed += additionalClockSpeed;
    }

    @Override
    public void temperatureCheck() throws OverheatException {
        if (temperature >= MAX_TEMP) {
            throw new OverheatException("Uwaga: zbyt duza temperatura - moze doprowadzic do przegrzania procesora.");
        }
    }

    @Override
    public String toString() {
        return "procesor - " + super.toString() + ", taktowanie: " + clockSpeed + " MHz, temperatura: " + temperature;
    }
}
