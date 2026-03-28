class Nurse {

    public static void main(String[] args) {

        System.out.println("Hello Nurse");
        callNurse();

        System.out.println("Nurse please add two medicine doses");

        int morningDose = 2;
        int nightDose = 1;
        boolean patientRecovered = true;

        addDose(morningDose, nightDose, patientRecovered);

        System.out.println("Nurse what is the injection cost");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!");

        float cost = getInjectionCost();
        System.out.println(cost);
    }

    static void callNurse() {
        System.out.println("Nurse is ready to help...");
    }

    static void addDose(int dose1, int dose2, boolean recovered) {
        System.out.println("Calculating medicine dose...");
        int totalDose = dose1 + dose2;
        System.out.println(totalDose);
        System.out.println(recovered);
	    System.out.println("!!!!!!!!!!!!!!!!!!!!!!");

    }

    static float getInjectionCost() {
        System.out.println("Checking injection cost...");
        float price = 120.5f;
        System.out.println("Cost found");
        return price;
    }
}