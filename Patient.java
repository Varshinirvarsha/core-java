class Patient {

    public static void main(String[] args) {

        System.out.println("Hello Patient");
        startPatient();

        System.out.println("Please add two health values");

        int weight = 60;
        int height = 170;
        String condition = "Stable";

        addHealth(weight, height, condition);

        System.out.println("What is the patient bill");

        double bill = getPatientBill();
        System.out.println(bill);
    }

    static void startPatient() {
        System.out.println("Patient checkup started...");
    }

    static void addHealth(int num1, int num2, String type) {
        System.out.println("Adding health values...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getPatientBill() {
        System.out.println("Checking patient bill...");
        double price = 2500.75;
        System.out.println("Bill found");
        return price;
    }
}