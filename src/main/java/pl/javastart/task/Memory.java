package pl.javastart.task;

class Memory extends Component implements Overclockable {
    private int volume;
    private int clockSpeed;
    private int temperature;
    private static final int MAX_TEMP = 85;
    private static final int TEMP_FACTOR = 15;

    public Memory(String model, String producer, String serialNo, int volume, int clockSpeed, int temperature) throws OverheatException {
        super(model, producer, serialNo);
        this.volume = volume;
        this.clockSpeed = clockSpeed;
        temperatureCheck();
        this.temperature = temperature;
    }

    @Override
    public void overClock(int additionalClockSpeed) throws OverheatException {
        System.out.println("proba zwiekszenia taktowania pamieci o " + additionalClockSpeed + " MHz");
        temperature += TEMP_FACTOR * (additionalClockSpeed / 100);
        temperatureCheck();
        clockSpeed += additionalClockSpeed;
    }

    @Override
    public void temperatureCheck() throws OverheatException {
        if (temperature >= MAX_TEMP) {
            throw new OverheatException("Uwaga: zbyt duza temperatura - moze doprowadzic do przegrzania pamieci.");
        }
    }

    @Override
    public String toString() {
        return "pamiec - " + super.toString() + ", ilosc pamieci: " + volume +
                " GB, taktowanie: " + clockSpeed + " MHz, temperatura: " + temperature;
    }
}
