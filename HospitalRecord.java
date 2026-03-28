class HospitalRecord {

    static String hospitalName = "CityCare";
    static short floors = 5;
    static boolean emergency = true;

    public static void main(String[] args) {

        String patientName = "Anu";
        int roomNo = 212;
        float bill = 1200.50f;

        System.out.println("Hospital: " + hospitalName);
        System.out.println("Floors: " + floors);
        System.out.println("Emergency Available: " + emergency);

        System.out.println("Patient: " + patientName);
        System.out.println("Room No: " + roomNo);
        System.out.println("Bill: " + bill);
    }
}