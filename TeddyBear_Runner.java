class TeddyBear_Runner {

    public static void main(String[] args) {

        TeddyBear.storeName();

        TeddyBear.customer("Anu");

        int price = TeddyBear.getPrice();
        System.out.println("Teddy Bear Price: " + price);

        int total = TeddyBear.totalBill(price);
        System.out.println("Total Bill: " + total);
    }
}