class Thermometer {

    public static void main(String[] args) {

        System.out.println("Hello Thermometer");
        startThermometer();

        System.out.println("Please add two temperature readings");

        int tempOne = 36;
        int tempTwo = 38;
        String patientName = "Anil";

        addTemperature(tempOne, tempTwo, patientName);

        System.out.println("What is the thermometer price");

        double price = getThermometerPrice();
        System.out.println(price);
    }

    static void startThermometer() {
        System.out.println("Temperature check started...");
    }

    static void addTemperature(int num1, int num2, String name) {
        System.out.println("Adding temperature values...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(name);
    }

    static double getThermometerPrice() {
        System.out.println("Checking thermometer price...");
        double price = 250.25;
        System.out.println("Price found");
        return price;
    }
}