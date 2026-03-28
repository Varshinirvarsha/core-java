class ChargerBox_Runner {

    public static void main(String[] args) {

        ChargerBox.shop();

        ChargerBox.purchase("shob");

        float price = ChargerBox.price();
        System.out.println("Charger Price: " + price);

        float total = ChargerBox.amount(price);
        System.out.println("Total Payment: " + total);
    }
}