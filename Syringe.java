class Syringe {

    public static void main(String[] args) {

        System.out.println("Hello Syringe");
        startSyringe();

        System.out.println("Please add two injection units");

        int unitOne = 5;
        int unitTwo = 7;
        String injectionType = "Vaccine";

        addUnits(unitOne, unitTwo, injectionType);

        System.out.println("What is the syringe price");

        double price = getSyringePrice();
        System.out.println(price);
    }

    static void startSyringe() {
        System.out.println("Syringe preparation started...");
    }

    static void addUnits(int num1, int num2, String type) {
        System.out.println("Adding injection units...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getSyringePrice() {
        System.out.println("Checking syringe price...");
        double price = 40.50;
        System.out.println("Price found");
        return price;
    }
}