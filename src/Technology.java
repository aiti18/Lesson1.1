public class Technology {
    private String name;
    private Manufacturer manufacturer;

    public Technology(String name, Manufacturer manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getInfo() {
        return "Name: " + name + ", Manufacturer: " + manufacturer;
    }
}
