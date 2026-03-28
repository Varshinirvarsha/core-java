class Speakers_Runner {

    public static void main(String[] args) {

        Speakers.brand();

        Speakers.order("Ravi");

        double price = Speakers.getCost();
        System.out.println("Speaker Cost: " + price);

        double finalBill = Speakers.bill(price);
        System.out.println("Final Bill: " + finalBill);
    }
}