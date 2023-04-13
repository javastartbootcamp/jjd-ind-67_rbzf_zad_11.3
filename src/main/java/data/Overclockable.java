package data;

public interface Overclockable {
    void overClock(int additionalClockSpeed) throws OverheatException;

    boolean temperatureCheck(int temperature) throws OverheatException;
}
