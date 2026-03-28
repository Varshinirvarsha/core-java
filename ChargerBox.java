class ChargerBox {

    static void shop() {
        System.out.println("Mobile Accessories Shop");
    }

    static void purchase(String name) {
        System.out.println("Customer buying charger: " + name);
    }

    static float price() {
        return 299.75f;
    }

    static float amount(float price) {
        return price + 40.25f;
    }
}