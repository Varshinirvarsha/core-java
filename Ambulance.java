class Ambulance {

    public static void main(String[] args) {

        System.out.println("Hello Ambulance");
        startAmbulance();

        System.out.println("Please add two emergency numbers");

        int driverNumber = 108;
        int helperNumber = 102;
        String emergencyType = "Accident";

        addNumbers(driverNumber, helperNumber, emergencyType);

        System.out.println("What is the ambulance charge");

        double charge = getAmbulanceCharge();
        System.out.println(charge);
		System.out.println("#####################");
    }

    static void startAmbulance() {
        System.out.println("Ambulance service started...");
    }

    static void addNumbers(int num1, int num2, String type) {
        System.out.println("Adding emergency numbers...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
		System.out .println("###################");
    }

    static double getAmbulanceCharge() {
        System.out.println("Checking ambulance charge...");
        double price = 1500.75;
        System.out.println("Charge found");
        return price;
    }
}