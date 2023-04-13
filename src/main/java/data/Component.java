package data;

public abstract class Component {
    private String model;
    private String producer;
    private String serialNo;

    public Component(String model, String producer, String serialNo) {
        this.model = model;
        this.producer = producer;
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return  "model: " + model + ", producent: " + producer + ", numer seryjny: " + serialNo;
    }
}
