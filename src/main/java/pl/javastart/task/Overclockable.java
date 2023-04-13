package pl.javastart.task;

interface Overclockable {
    void overClock(int additionalClockSpeed) throws OverheatException;

    void temperatureCheck() throws OverheatException;
}
