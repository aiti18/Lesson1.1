public class Main {
    public static void main(String[] args) {
        Manufacturer apple = new Manufacturer("Apple", "USA");
        Manufacturer samsung = new Manufacturer("Samsung", "South Korea");

        // Создание объектов
        Phone objectA = new Phone("Galaxy S22", samsung, OperatingSystem.ANDROID);
        IPhone objectB = new IPhone("iPhone 14", apple);
        IPhone objectC = new IPhone("iPhone 15", apple);

        // Вызов методов
        System.out.println("Object A:");
        objectA.displayInfo();
        objectA.displayInfo("Flagship model");

        System.out.println("\nObject B:");
        objectB.displayInfo();
        objectB.displayInfo("Latest model");

        System.out.println("\nObject C:");
        objectC.displayInfo();
        objectC.showOperatingSystem();
    }
}
