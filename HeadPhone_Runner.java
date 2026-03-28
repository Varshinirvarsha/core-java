class HeadPhone_Runner {

    public static void main(String[] args) {

        HeadPhone.name();

        HeadPhone.booking("Deepthi");

        int price = HeadPhone.getPrice();
        System.out.println("Price: " + price);

        int lastPrice = HeadPhone.amount(price);
        System.out.println("AMOUNT: " + lastPrice);
    }
}