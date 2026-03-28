class Doctor {

    public static void main(String[] args) {

        System.out.println("Hello Doctor");
        callDoctor();

        System.out.println("Doctor please add patient temperature and pulse");

        int temperature = 37;
        int pulse = 80;
        String patientStatus = "Stable";

        calculateHealth(temperature, pulse, patientStatus);

        System.out.println("Doctor what is the consultation fee");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");

        long fee = getConsultationFee();
        System.out.println(fee);
    }

    static void callDoctor() {
        System.out.println("Doctor is available now...");
    }

    static void calculateHealth(int temp, int pulseRate, String status) {
        System.out.println("Checking patient health...");
        int result = temp + pulseRate;
        System.out.println(result);
        System.out.println(status);
	    System.out.println("&&&&&&&&&&&&&&&&&&&&&&");

    }

    static long getConsultationFee() {
        System.out.println("Checking fee details...");
        long price = 500L;
        System.out.println("Fee found");
        return price;
    }
}