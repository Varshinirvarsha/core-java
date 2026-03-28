class Bandage {

    public static void main(String[] args) {

        System.out.println("Hello Bandage");
        startBandage();

        System.out.println("Please add two bandage packs");

        int packOne = 6;
        int packTwo = 4;
        String bandageType = "Cotton";

        addBandages(packOne, packTwo, bandageType);

        System.out.println("What is the bandage price");

        double price = getBandagePrice();
        System.out.println(price);
    }

    static void startBandage() {
        System.out.println("Bandage supply started...");
    }

    static void addBandages(int num1, int num2, String type) {
        System.out.println("Adding bandage packs...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getBandagePrice() {
        System.out.println("Checking bandage price...");
        double price = 70.50;
        System.out.println("Price found");
        return price;
    }
}