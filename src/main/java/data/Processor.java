package data;

import data.Component;
import data.Overclockable;
import data.OverheatException;

public class Processor extends OverclockableComponent implements Overclockable {
    private static final int TEMP_FACTOR = 10;

    public Processor(String model, String producer, String serialNo, int clockSpeed, int temperature, int tempMax) throws OverheatException {
        super(model, producer, serialNo, clockSpeed, temperature, tempMax);
    }

    @Override
    int getTempFactor() {
        return TEMP_FACTOR;
    }

    @Override
    public String toString() {
        return "procesor - " + super.toString();
    }
}
