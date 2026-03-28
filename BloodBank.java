class BloodBank {

    public static void main(String[] args) {

        System.out.println("Hello BloodBank");
        startBloodBank();

        System.out.println("Please add two blood units");

        int unitOne = 4;
        int unitTwo = 6;
        String bloodGroup = "O+";

        addBloodUnits(unitOne, unitTwo, bloodGroup);

        System.out.println("What is the blood cost");

        double cost = getBloodCost();
        System.out.println(cost);
    }

    static void startBloodBank() {
        System.out.println("Blood bank service started...");
    }

    static void addBloodUnits(int num1, int num2, String type) {
        System.out.println("Adding blood units...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getBloodCost() {
        System.out.println("Checking blood cost...");
        double price = 1200.50;
        System.out.println("Cost found");
        return price;
    }
}