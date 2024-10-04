public class Phone extends Technology {
    private OperatingSystem operatingSystem;

    public Phone(String name, Manufacturer manufacturer, OperatingSystem operatingSystem) {
        super(name, manufacturer);
        this.operatingSystem = operatingSystem;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    // Перегруженный метод без параметров
    public void displayInfo() {
        System.out.println(getInfo() + ", Operating System: " + operatingSystem);
    }

    // Перегруженный метод с параметром
    public void displayInfo(String extraInfo) {
        System.out.println(getInfo() + ", Operating System: " + operatingSystem + ", Extra Info: " + extraInfo);
    }

    // Неперезаписываемый метод
    public final void showOperatingSystem() {
        System.out.println("Operating System: " + operatingSystem);
    }
}
