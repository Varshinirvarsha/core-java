class SmartPointRunner {
    public static void main(String[] args) {

        SmartPoint s1 = new Smart("Watch", "Noise", 2999, true);
        SmartPoint s2 = new Smart("Speaker", 1500);
        SmartPoint s3 = new Smart("Boat");

        s1.display();
        s2.display();
        s3.display();
    }
}