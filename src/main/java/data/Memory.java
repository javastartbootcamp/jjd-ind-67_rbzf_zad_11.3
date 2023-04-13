package data;

public class Memory extends OverclockableComponent implements Overclockable {
    private int volume;
    private static final int TEMP_FACTOR = 15;

    public Memory(String model, String producer, String serialNo, int volume, int clockSpeed, int temperature, int tempMax) throws OverheatException {
        super(model, producer, serialNo, clockSpeed, temperature, tempMax);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    int getTempFactor() {
        return TEMP_FACTOR;
    }

    @Override
    public String toString() {
        return "pamiec - " + super.toString() + ", ilosc pamieci: " + volume + " GB";

    }
}
