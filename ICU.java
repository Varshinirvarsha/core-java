class ICU {

    public static void main(String[] args) {

        System.out.println("Hello ICU");
        startICU();

        System.out.println("Please add two ICU beds");

        int bedOne = 5;
        int bedTwo = 3;
        String wardType = "Critical";

        addBeds(bedOne, bedTwo, wardType);

        System.out.println("What is the ICU charge");

        double charge = getICUCharge();
        System.out.println(charge);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    static void startICU() {
        System.out.println("ICU service started...");
    }

    static void addBeds(int num1, int num2, String type) {
        System.out.println("Adding ICU beds...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    static double getICUCharge() {
        System.out.println("Checking ICU charge...");
        double price = 5000.00;
        System.out.println("Charge found");
        return price;
    }
}