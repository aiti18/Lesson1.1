public final class IPhone extends Phone {

    public IPhone(String name, Manufacturer manufacturer) {
        super(name, manufacturer, OperatingSystem.IOS);
    }

    // Переопределение метода displayInfo
    @Override
    public void displayInfo() {
        System.out.println(getInfo() + ", Operating System: " + getOperatingSystem() + " (Customized for iPhone)");
    }
}