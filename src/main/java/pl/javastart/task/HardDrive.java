package pl.javastart.task;

class HardDrive extends Component {
    private int volume;

    public HardDrive(String model, String producer, String serialNo, int volume) {
        super(model, producer, serialNo);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "dysk twardy - " + super.toString() + ", ilosc pamieci: " + volume + " GB";
    }
}
